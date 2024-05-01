package com.itbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itbank.service.BoardService;
import com.itbank.vo.BoardViewVO;


@RestController
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService bs;
	
	@GetMapping
	public List<BoardViewVO> getbaords(){
		return bs.getboards();
	}
	
	@PostMapping("/board")
	public String addBoard(BoardViewVO input) {
		
		return  bs.insert(input);
	}
}