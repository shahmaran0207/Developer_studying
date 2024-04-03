package com.itbank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EX01Controller {
//	@RequestMapping(value="/EX01", method=RequestMethod.GET)
//	- spring 3.x버전까지는 위의 방식으로URI 매칭했음
	
	@GetMapping("/EX01")		//GetMapping()은 4.x 이후부터 적용된 것
	public String ex01() {
		
		return "EX01";			// ※ servlet-context.xml을 열어서 같이 확인
								// 1. 컨트롤러가 반환하는 문자열이 view의 이름이 된다.
								// 2. 뷰의 이름 앞 / 뒤로 prefix, suffix의 값이 더해진다.
								// 3. 즉, /WEB-INF/view/ + EX01+.jsp가 들어간다.
								// 4. 그 후 3번의 경로에  있는 jsp로 forward가 된다.
		
		
	}
}
