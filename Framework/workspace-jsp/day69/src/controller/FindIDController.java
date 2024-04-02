package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;
import service.HashPw;

@WebServlet("/account/findID")
public class FindIDController extends HttpServlet {

	private static final long serialVersionUID = 700L;
	
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
	
	String path = "/WEB-INF/account/";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "findID.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String sql = "select * from account where email = ?";
		String email = req.getParameter("email");
		
		DAO dao = new DAO();
		AccountVO user = dao.queryForObject(sql, mp, email);
		
		req.setAttribute("userid", user.getUserid());
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "msg3.jsp");
		
		rd.forward(req, resp);
	}
}
