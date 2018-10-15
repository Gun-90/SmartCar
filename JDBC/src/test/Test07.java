package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtill;

public class Test07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "delete from board";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			// sql구문 실행 및 결과 값 처리
			
			int row = ps.executeUpdate();
			System.out.println((row+" delete 수행"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// 자원 반납
			JDBCUtill.close(rs,ps,con);
		}
	}
}
