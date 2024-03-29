package jdbc;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
	DAO를 활용해서 Person 테이블 모두 출력
	홍길동	173.2	99/12/25
이진호	161.3	98/01/02
박철수	166.6	03/05/05
박민지	166.6	02/04/04
유재석	175.1	88/05/05
하동훈	165.3	00/01/01
노홍철	174.5	00/01/01
정형돈	170	00/01/01
이수진	162.3	99/03/28
 */

class killVO{
	private String name;
	private double height;
	private Date birth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		String msg="%s  %.1f %s";
		msg=String.format(msg, name, height, birth);
		return msg;
	}
}

class kill extends DAO{
	List<killVO> selectAll(){
		String sql="select * from person";

		stmt=getStatement();
		try {
			rs=stmt.executeQuery(sql);

			List<killVO> list=new ArrayList<killVO>();

			while(rs.next()) {
				killVO ki=new killVO();

				ki.setBirth(rs.getDate("birth"));
				ki.setHeight(rs.getDouble("height"));
				ki.setName(rs.getString("name"));

				list.add(ki);
			}
			return list;

		} catch (SQLException e) {
			System.out.println("SQL문 예외: "+e.getMessage());
		} finally {
			close();
		}

		return null;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		kill ki3 =new kill();

		List<killVO> ki2=ki3.selectAll();

		for (killVO ki: ki2) {
			System.out.println(ki);
		}

	}
}