package com.itbank.controller;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.itbank.service.AccountService;
import com.itbank.vo.AccountVO;

@Controller
@RequestMapping("/")
public class AccountController {

	@Autowired
	private AccountService as;

	@GetMapping("/acc/login")
	public void login() {}

	@PostMapping("/acc/login")
	public String login(AccountVO user, HttpSession session) {
		
		user = as.login(user);
		
		if (user != null) {
			session.setAttribute("user", user);
		}
		
		return "redirect:/";
	}

	@GetMapping("/acc/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@GetMapping("/acc/myPage")
	public void myPage() {}

	@PostMapping("/acc/myPage")
	public String update(AccountVO input, HttpSession session) {
		AccountVO user = (AccountVO) session.getAttribute("user");
		
		int idx = user.getIdx();
		input.setIdx(idx);

		as.update(input);

		return "redirect:/acc/logout";
	}

	@GetMapping("/acc/delete/{idx}")
	public String delete(@PathVariable int idx) {
		as.delete(idx);
		
		return "redirect:/";
	}
	
	@GetMapping("/acc/signUp")
	public void signUp() {
	}

	@PostMapping("/acc/signUp")
	public ModelAndView signUp(AccountVO input) throws IOException {
		ModelAndView mav = new ModelAndView("message");

		mav.addObject("row", as.signUp(input));
		mav.addObject("msg", "가입이 환영 합니다");
		mav.addObject("path", "/");

		return mav;
	}
}
