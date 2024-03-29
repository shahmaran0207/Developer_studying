package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
	JDBC: JAVA DataBase Connectivity
	- Java에서 DB에 접근하기 위한 인터페이스를 제공하는 라이브러리
 */

public class EX01 {
	public static void main(String[] args) throws SQLException {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user="c##itbank";
		String password="it";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. 최초 한번 드라이버 로드 필요
			Class.forName(driver);
			
			//2. 사용할 SQL구문을 문자열로 준비
			String sql = "select banner from v$version";
			
			//3. DB에 연결을 생성
			conn=DriverManager.getConnection(url, user, password);
			
			//4. SQL 실행객체를 Connection부터 받는다
			stmt=conn.createStatement();
			
			//5. select 실행 결과는 ResultSet으로부터 받는다
			rs=stmt.executeQuery(sql);
			
			rs.next(); //커서를 다음 행으로 이동
			
			//6. 현재 커서가 가리키는 행에서 원하는 열을 반환 받는다.
			String banner = rs.getString("banner");
			System.out.println(banner);
			

			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			//7. 연결에 사용한 객체는 모두 역순으로 제거해야 함! → 이거 안닫히면 connection이 계속 쌓여서 나중에 큰일남  → 반드시 닫아야 함
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
	}
}