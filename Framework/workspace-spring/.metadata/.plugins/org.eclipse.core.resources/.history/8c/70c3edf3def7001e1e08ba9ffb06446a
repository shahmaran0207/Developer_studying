package com.itbank.rev;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AreaVO;

import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {
	@Autowired

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/area")
	public String area() {
		return "area";
	}
	
	@GetMapping("/play")
	public String play() {
		return "play";
	}
	
	@GetMapping("/money")
	public String money() {
		return "money";
	}


	@PostMapping("/area")
	public int area(HttpServletRequest request) {
		String area=request.getParameter("area");
		String goal=request.getParameter("goal");
		
		return 0;
	}

}
