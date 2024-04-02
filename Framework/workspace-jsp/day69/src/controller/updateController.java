package controller;

import java.io.IOException;
import java.sql.ResultSet;

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
import service.HashPw;

@WebServlet("/account/update")
public class updateController extends HttpServlet{
	private static final long serialVersionUID = 8725L;
	
	private String path = "/WEB-INF/account/";
	
	private Mapper<AccountVO> mp = (ResultSet rs) -> {
		AccountVO row = new AccountVO();
		
		row.setEmail(rs.getString("email"));
		row.setIdx(rs.getInt("idx"));
		row.setJ_date(rs.getDate("j_date"));
		row.setNick(rs.getString("nick"));
		row.setUserid(rs.getString("userid"));
		row.setUserpw(rs.getString("userpw"));
		
		return row;
	};

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd=req.getRequestDispatcher(path+"update.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String sql = "update account set nick=?, userpw = ?, email=? where idx = ? ";

		HttpSession session = req.getSession();
		
		String nick = req.getParameter("nick");
		String userpw = req.getParameter("userpw");
		String email = req.getParameter("email");
		int idx=Integer.parseInt(req.getParameter("idx"));
		
		userpw = HashPw.getHash(userpw);
		String msg="성공";
		
		DAO dao = new DAO();
		AccountVO user = dao.queryForObject(sql, mp, nick, userpw, email, idx);
		
		if (user != null) {
			session.setAttribute("user", user);
			msg+="실패";
		}
		
		req.setAttribute("change", msg);
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "msg2.jsp");
		rd.forward(req, resp);
	}
}
