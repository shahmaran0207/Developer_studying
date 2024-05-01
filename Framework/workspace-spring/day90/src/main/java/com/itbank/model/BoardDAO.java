package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardViewVO;

public interface BoardDAO {
	
	@Select	("select banner from v$version")
	public String test();

	@Select("select * from board order by idx desc offset 0 rows fetch first 10rows only")
	public List<BoardViewVO> selectAll();

	@Insert("insert into board(title, contents) values(#{title}, #{contents})")
	public String insert(BoardViewVO input);
	
}