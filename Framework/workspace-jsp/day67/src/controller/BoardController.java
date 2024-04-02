package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.BoardVO;

@WebServlet("/board")
public class BoardController extends HttpServlet {
	
	private Mapper<BoardVO> mp = (ResultSet rs) -> {
		BoardVO row = new BoardVO();
		
		row.setContents(rs.getString("contents"));
		row.setIdx(rs.getInt("idx"));
		row.setNick(rs.getString("nick"));
		row.setTitle(rs.getString("title"));
		row.setV_count(rs.getInt("v_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	};

	private static final long serialVersionUID = 300L;
	private String path = "/WEB-INF/board/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "write.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// ������ �Է��� ������ �ޱ�
		String title = req.getParameter("title");
		String contents = req.getParameter("contents");
		int user_idx = Integer.parseInt(req.getParameter("user_idx"));

		String sql = "insert into "
				+ "board(title, contents, user_idx) "
				+ "values(?, ?, ?)";
		
		DAO dao = new DAO();
		int row = dao.update(sql, title, contents, user_idx);
		
		System.out.println(row == 0 ? "성공" : "실패");
		
		String cpath=req.getContextPath();
		resp.sendRedirect(cpath);
	}
	
}
