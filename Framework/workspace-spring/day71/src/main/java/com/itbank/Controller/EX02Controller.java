package com.itbank.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EX02Controller {

	//컨트롤러 메서드의 반환형 동작
	//1. String: 반환값이 view의 이름이 된다
	//2. void: 요청 urI가 view의 이름이 된다
	
	@GetMapping("/EX02")
	public void EX02() {}
	
	@PostMapping("/EX02")
	public String EX02(HttpServletRequest request) { 
//		try {
//			request.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {}
		
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		
		String adult=(age>=19)?"성인":"미성년자";
		request.setAttribute("adult",  adult);
		
		return "EX02_result";

	}
	
	@GetMapping("/EX03")
	public void EX03(){}
	
	@PostMapping("/EX03")
	public String EX03(Model model, String name, int age){
		//파라미터의 이름과 컨트롤러 메서드의 매개변수 이름이 같은 것끼리 지정한다.
		
		String msg=name+"님은 ";
		msg+= (age>=19) ?"성인":"미성년자";
		
		//model: request의 Attribute를 대체한다.
		model.addAttribute("msg", msg);
		
		return "EX03_result";
	}
}