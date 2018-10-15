package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.JDBCUtill;
import vo.DeptVO;

public class Test08 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DeptVO dept = null;
		
		String sql = "select * from dept";
		ArrayList<DeptVO> list = new ArrayList<>();
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			// sql구문 실행 및 결과 값 처리
			rs = ps.executeQuery();
			while(rs.next()) {
				// 자바의 객체화 작업
				dept = new DeptVO(rs.getInt("deptno"),rs.getString("dname"),
						rs.getString("loc") );
				list.add(dept);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// 자원 반납
			JDBCUtill.close(rs,ps,con);
		}
	}
	
}
