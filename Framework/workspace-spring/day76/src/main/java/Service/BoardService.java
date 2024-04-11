package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.BoardDAO;
import Model.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public String test() {
		return dao.test();
	}
	
	public List<BoardVO> getBoards(){
		return dao.selectAll();
	}
	
	public int insert(BoardVO input) {
		return dao.insert(input);
	}
}
