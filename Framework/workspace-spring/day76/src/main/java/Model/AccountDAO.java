package Model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import Model.vo.AccountVO;

public interface AccountDAO {
	@Select("select * from account")
	public
	List<AccountVO> selectAll();
}
