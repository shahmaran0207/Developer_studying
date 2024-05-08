package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class HomeController {
	
	@Autowired
	private TestService ts;

	@GetMapping("/")
	public String hello() {
		return "home";
		
	}
	
	@GetMapping("/EX01")
	public ModelAndView serviceTest() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("total", ts.total(10));
		mav.setViewName("EX01");
		
		return mav;
	}
	
	@GetMapping("/EX02")
	public ModelAndView daoTest() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("banner", ts.daotest());
		
		return mav;
	}
	
}