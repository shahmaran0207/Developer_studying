package com.itbank.Controller;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.PersonVO;

@Controller
@RequestMapping("/EX05")
public class EX05Controller {

	@GetMapping 				// getmapping에 아무런 주소도 할당하지 않으면, requestmapping의 주소로 할당됨
	public void EX05() {}		// view는 /WEB-INF/views/EX05.jsp
	
	@PostMapping
	public String EX05(Model model, @RequestParam Map<String, Object> map) {
		//컨트롤러 메서드 파라미터에서 map은 여러 용도로 사용되는데
		// 요청 파라미터는 어노테이션을 붙이지 않으면 파라미터를 받을 수 없다.
		
		Set<String> keys=map.keySet();
		String msg="";
		for (String k: keys) {
			msg+=map.get(k);
		
		}
		model.addAttribute("result", msg);
		return "EX05_result";
		
	}

	@GetMapping("/test1")
	public String EX06() {
		return "EX06";
	}
	
	@PostMapping("/test1")
	public ModelAndView EX06(PersonVO vo) {
		//Model과 view를 한번에 지정 가능한 객체
		ModelAndView mav=new ModelAndView();
		
		String msg="불합격";
		
		if(vo.getScore() >=600) msg="합격";
		
		mav.addObject("msg",msg);
		mav.setViewName("EX06_result");	//여기가 반환 위치
		
		return mav;
	}
}