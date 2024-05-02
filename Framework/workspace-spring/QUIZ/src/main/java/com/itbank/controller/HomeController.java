package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.AccountService;

@Controller
public class HomeController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", as.getAccounts());
		mav.setViewName("home");
		
		return mav;
	}
	
}
