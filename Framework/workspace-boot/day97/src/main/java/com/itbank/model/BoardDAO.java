package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.itbank.vo.BoardVO;

@Mapper
public interface BoardDAO {

	@Select("select * from board order by idx desc")
	List<BoardVO> selectAll();

	@Insert()
	int write(BoardVO input);

}
