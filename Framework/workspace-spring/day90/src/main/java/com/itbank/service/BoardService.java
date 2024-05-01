package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardViewVO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public List<BoardViewVO> getboards() {
		
		return dao.selectAll();
	}

	public String insert(BoardViewVO input) {
		return dao.insert(input);
	}
}