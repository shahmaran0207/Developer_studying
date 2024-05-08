package com.itbank.contorller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.AccountService;
import com.itbank.vo.AccountVO;

@Controller
public class AccountController {

	@Autowired
	private AccountService as;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("list", as.getAccounts());
		mav.setViewName("home");

		return mav;
	}

	@GetMapping("/login")
	public void login() {
	}

	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) {
		input = as.getAccount(input);

		if (input != null)
			session.setAttribute("user", input);

		return "redirect:/";
	}

	@GetMapping("/signUp")
	public void signUp() {
	}

	@ResponseBody
	@GetMapping("/checkId")
	public int checkId(String userid) {
		// 전달은 id가 DB에 존재하는지 파악
		// 있으면 0을 없으면 1을 반환
		
		AccountVO user=as.selectID(userid);
		int row=1;
		
		if (user == null) row=0;

		return row;
	}

}
