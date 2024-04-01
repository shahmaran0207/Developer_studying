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
import javax.servlet.http.HttpSession;

import model.DAO;
import model.Mapper;
import model.vo.AccountVO;

@WebServlet("/account/findpw")
public class finpwController extends HttpServlet {

	private static final long serialVersionUID = 700L;
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
		rd = req.getRequestDispatcher(path + "findpw.jsp");
		
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String sql="select * from account where userid=? and email = ?";
		String userid=req.getParameter("userid");
		String email=req.getParameter("email");
		
		DAO dao=new DAO();
		AccountVO row=dao.queryForObject(sql,  mp, userid, email);
		
		String newpw=UUID.randomUUID().toString().substring(0, 6);

		if(row == null) {
			newpw="일치하는 데이터가 없습니다.";
		}
		
		
		req.setAttribute("newpw",  newpw);
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(path + "msg.jsp");
		
		rd.forward(req, resp);
	}
}