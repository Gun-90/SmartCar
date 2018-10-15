package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtill;

public class Test05 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "INSERT INTO BOARD (NO, Title, id) " +
		"VALUES ((select nvl(MAX(no),0) FROM BOARD)+1,?,?)";
		
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "sample Test");
			ps.setString(2, "test01");
			ps.executeUpdate();
			
			// sql구문 실행 및 결과 값 처리
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// 자원 반납
			JDBCUtill.close(rs,ps,con);
		} 

 }
}
