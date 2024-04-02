package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;
import model.vo.BoardVO;
import service.Paging;

@WebServlet("/board")
public class BoardController extends HttpServlet {

	private static final long serialVersionUID = 300L;
	private String path = "/WEB-INF/board/";
	
	private Mapper<BoardVO> mp = (ResultSet rs) -> {
		BoardVO row = new BoardVO();
		
		row.setIdx(rs.getInt("idx"));
		row.setNick(rs.getString("nick"));
		row.setContents(rs.getString("contents"));
		row.setTitle(rs.getString("title"));
		row.setV_count(rs.getInt("v_count"));
		row.setW_date(rs.getDate("w_date"));
		
		return row;
	};
	
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
		
		HttpSession session = req.getSession();
		AccountVO user =  (AccountVO) session.getAttribute("user");
		int user_idx = user.getIdx();
		

		String sql = "insert into "
				+ "board(title, contents, user_idx) "
				+ "values(?, ?, ?)";
		

		
		DAO dao = new DAO();
		int row = dao.update(sql, title, contents, user_idx);
		
		System.out.println(row == 0 ? "성공" : "실패");
		
		String cpath = req.getContextPath();
		resp.sendRedirect(cpath);
	}
}