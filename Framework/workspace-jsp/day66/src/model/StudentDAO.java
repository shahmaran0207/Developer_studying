package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.vo.StudentVO;

public class StudentDAO extends DAO{
	public List<StudentVO> selectAll() {
		String sql = "select * from student";
		
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<StudentVO> list = new ArrayList<>();
			
			while (rs.next()) {
				StudentVO row = new StudentVO();
				
				row.setEng(rs.getInt("eng"));
				row.setIdx(rs.getInt("idx"));
				row.setKor(rs.getInt("kor"));
				row.setMat(rs.getInt("mat"));
				row.setName(rs.getString("name"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
		
		} finally {
			close();
		}
		
		return null;
	}

	public int insert(StudentVO stu) {
		String sql="insert into student "+
				"(name, kor, eng, mat) "+
				"values(?, ?, ?, ?)";
		
		try {
			conn=ds.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,  stu.getName());
			pstmt.setInt(2,  stu.getKor());
			pstmt.setInt(3,  stu.getMat());
			pstmt.setInt(4,  stu.getEng());
			
			return pstmt.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("insert 예외: "+ e.getMessage());
		} finally {
			close();
		}
		return 0;
	}
	
	public int delete(int idx) {
		String sql = "delete from student where idx = ?";
		
		try {
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
	
	public int update(StudentVO input) {
		String sql = "update student "
				+ "set "
					+ "name = ?,"
					+ "kor = ?, "
					+ "eng = ?, "
					+ "mat = ? "
				+ "where idx = ?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, input.getName());
			pstmt.setInt(2, input.getKor());
			pstmt.setInt(3, input.getEng());
			pstmt.setInt(4, input.getMat());
			pstmt.setInt(5, input.getIdx());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		return 0;
	}
}
