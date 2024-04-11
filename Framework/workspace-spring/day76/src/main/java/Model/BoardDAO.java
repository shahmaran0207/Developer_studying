package Model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import Model.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select banner from v$version")
	String test();
	
	@Select("select * from board_view order by idx desc "
			+ "offset 0 rows "
			+ "fetch first 10 rows only")
	List<BoardVO> selectAll();
	
	//DAO 이번에는 interface로 쓰는 이유
	// root-context에 난리 쳐 놓은거 덕분에 기존에 class 에 쓰던 것을 알아서 해줌 
	// 즉, --> @select만 하면 나머지는 알아서 해줌
	
	// interface는 뭔가를 더 편하게 쓰기 위해 만든 것
	// ex) 컴퓨터에 키보드와 마우스가 있는 것과 비슷함
	// ex) 자판기 동전투입구, 버튼, 리모컨 ....
	
	@Insert("insert into board(title, user_idx, contents) "
			+ "values(#{title}, #{user_idx}, #{contents})")
	int insert(BoardVO input); //매개변수 여러개 넣으면 안됨
	//여러개의 데이터(값)를 받을 땐 VO 혹은 map으로 받아야 한다
}