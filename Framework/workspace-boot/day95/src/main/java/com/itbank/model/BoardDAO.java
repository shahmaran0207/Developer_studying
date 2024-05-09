package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

@Mapper
public interface BoardDAO {
	
	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectIdx(int idx);

	List<BoardVO> selectAll();
}
