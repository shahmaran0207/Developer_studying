package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;

	@GetMapping("view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav=new ModelAndView("board/view");
		
		mav.addObject("row", bs.getBoard(idx));
		
		return mav;
	}
}
