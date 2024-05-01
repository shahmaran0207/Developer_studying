package com.itbank.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller		// Controller : 지정 URL로의 요청을 처리하고 지정 view로 이동
public class EX01Controller {
	
	@ResponseBody		//view가 아닌 데이터 그대로 반환
	@GetMapping("/EX01")
	public String EX01() {
		return "Hello world";
	}
}