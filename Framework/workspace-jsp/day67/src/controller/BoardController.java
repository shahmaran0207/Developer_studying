package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.BoardVO;

@WebServlet("/board")
public class BoardController extends HttpServlet{
	private static final long serialVersionUID = 1123L;
	private Mapper<BoardVO> mp = (ResultSet rs) -> {
		BoardVO row = new BoardVO();

		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("contents"));
		row.setTitle(rs.getString("title"));

		return row;
	};
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		 
		 
	 
		 String sql="insert into "
				 +"board(title, contents, user_idx) "
				 +"values(?, ?, ?)";
		 
		 DAO dao=new DAO();
		 
		 req.setAttribute("insert", dao.query(sql, mp));
		 
		 
	 }
}