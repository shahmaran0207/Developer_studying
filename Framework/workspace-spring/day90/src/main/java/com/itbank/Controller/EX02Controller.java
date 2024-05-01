package com.itbank.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.vo.BoardViewVO;
import com.itbank.vo.PersonVO;

@RestController // Controller + Responsebody
@RequestMapping("/EX02")
public class EX02Controller {

	@GetMapping
	public String get() {
		return "Hello Spring";
	}

	@GetMapping("/person")
	public PersonVO getPerson() {
		return new PersonVO("홍길동", 23);
	}

	@GetMapping("/persons1")
	public List<PersonVO> getPersons1(){
		List<PersonVO> list=new ArrayList<>();
		
		list.add(new PersonVO("홍길동",3));
		list.add(new PersonVO("이수진",23));
		list.add(new PersonVO("김신일",23));
		
		return list;
	}
	
	@GetMapping("/persons2")
	public Map<String , PersonVO> getPersons2(){
		Map<String , PersonVO> map=new HashMap<>();
		
		map.put("1", new PersonVO("홍길동", 33));
		map.put("2", new PersonVO("이수진", 13));
		map.put("3", new PersonVO("홍성욱", 23));
		
		return map;
	}
	
	@GetMapping("/student")
	public Map<String, Object> getstudent() {
		Map<String, Object> stu = new HashMap<>();

		stu.put("name", "김민수");
		stu.put("age", 16);
		stu.put("score", 88);
		stu.put("gender", '남');

		return stu;
	}
	
	@GetMapping("/board")
	public Map<String, BoardViewVO> getBoardView() {
		Map<String, BoardViewVO> stu = new HashMap<>();
		
		return stu;
	}
	
}