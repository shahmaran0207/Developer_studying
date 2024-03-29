package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class PersonDAO extends DAO{
	List<PersonVO> selectALL(){
		String sql="select * from person";
		
		try {
			stmt=getStatement();
			rs=stmt.executeQuery(sql);
			
			List<PersonVO> list =new ArrayList<PersonVO>();
			
			while(rs.next()) {
				PersonVO row=new PersonVO();
				
				row.setBirth(rs.getDate("birth"));
				row.setHeight(rs.getDouble("height"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			return list;
					
		} catch (SQLException e) {
			System.out.println("SQL 예외: "+e.getMessage());
		} finally {
			close();
		}
		return null;
	}
}

public class Person {
	public static void main(String[] args) {
		PersonDAO dao=new PersonDAO();
		
		for (PersonVO row: dao.selectALL()) {
			System.out.println(row);
		}
	}
}
