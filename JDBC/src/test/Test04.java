package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtill;

public class Test04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "select *  from users where id=? and pw=?";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, args[0]);
			ps.setString(2, args[1]);
			
			// sql구문 실행 및 결과 값 처리
			rs=ps.executeQuery();
			String name = null;
			while(rs.next()) {
				name = rs.getString("name");
				System.out.println(rs.getString("name"));
			}
			System.out.println("로그인정보 : " + name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// 자원 반납
			JDBCUtill.close(rs,ps,con);
		}
	}
}
