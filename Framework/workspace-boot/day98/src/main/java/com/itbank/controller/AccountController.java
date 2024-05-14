package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itbank.service.AccountService;
import com.itbank.service.sha512;
import com.itbank.vo.AccountVO;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private sha512 hash;
	
	@Autowired
	private AccountService as;
	
	@GetMapping
	public String list(Model model) {
		model.addAttribute("list", as.getAccounts());
		
		return "account/list";
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) { 
		String pw=input.getUserpw();
		String hashpw=hash.getHash(pw);
		
		AccountVO input1=new AccountVO(input.getUserid(), hashpw);
		
		session.setAttribute("user", as.login(input1));
		
		return "redirect:/account";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/account";
	}
}
