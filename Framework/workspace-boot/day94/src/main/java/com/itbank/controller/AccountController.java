package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.itbank.model.AccountDAO;

@Controller
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountDAO dao;
	
	@GetMapping("/list")
	public ModelAndView daoTest() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("list", dao.selectAll());
		
		return mav;
	}
	

}
