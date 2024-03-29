package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DAO는 자주 사용되는 객체로public 클래스로 만들어두면 좋다

public class DAO {
	protected String driver="oracle.jdbc.driver.OracleDriver";
	protected String url="jdbc:oracle:thin:@192.168.1.100:1521:xe";
	protected String user="c##itbank";
	protected String password="it";
	
	protected Connection conn;
	protected Statement stmt;
	protected ResultSet rs;
	
	protected Statement getstatement() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
			stmt=conn.createStatement();
			
			return stmt;
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("SQL에러: ");
		}
		
		return null;
	}
	
	void close() {
			try {
				if(rs != null) rs.close();
				if(stmt != null)stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {}
	}
	
	public String test(){
		String sql="select banner from v$version";
		
		try {
			stmt=getstatement();
			rs=stmt.executeQuery(sql);
			
			rs.next();
			
			return rs.getString("banner");
		} catch (SQLException e) {
			System.err.println("SQL 예외: "+e.getMessage());
		} finally {
			close();
		}
		return null;
		
		
	}
}