package com.itbank.rev;

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
	public ModelAndView processTravelInfo(@RequestBody AreaVO areaVO) {
		System.out.println("Received Travel Information: " + areaVO.toString());

		ModelAndView mav = new ModelAndView();
		String msg=areaVO.toString();
		mav.addObject("msg", msg);
		mav.setViewName("result");
		
		return mav;
	}

}
