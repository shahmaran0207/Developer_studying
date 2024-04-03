package com.itbank.Controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.vo.PersonVO;

@Controller
@RequestMapping("/EX04")
public class EX04Controller {
	
	@GetMapping("/test1")	//EX04/test1 으로 요청이 들어오면 실행
	public void test1() {}	//void는 요청 uri가 view 이름이 된다.
							// 즉, /WEB-INF/views/EX04/test1.jsp로 포워드
	
	@PostMapping("/test1")
	public String test1(Model model, PersonVO per) {
		String msg=per.getName()+"님은 ";
		double height=per.getHeight();
		Date date=per.getDate();
		int score=per.getScore();
		
		msg+="키는 "+height+" cm이고, 생일은 "+date+", 점수는 "+score+"입니다. ";
		
		model.addAttribute("msg2", msg);
		return "EX04/test1_result";
		//해당 포워드가 되는 파일에 per 정보를 문자열로 한줄로 저장해서 보낸다.
		// 해당 jsp 파일에서 받은 정보를 화면에 출력한다.
	}
}