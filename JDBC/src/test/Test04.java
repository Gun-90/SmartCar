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
			
			// sql���� ���� �� ��� �� ó��
			rs=ps.executeQuery();
			String name = null;
			while(rs.next()) {
				name = rs.getString("name");
				System.out.println(rs.getString("name"));
			}
			System.out.println("�α������� : " + name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// �ڿ� �ݳ�
			JDBCUtill.close(rs,ps,con);
		}
	}
}
