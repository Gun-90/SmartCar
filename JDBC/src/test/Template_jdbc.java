package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtill;

public class Template_jdbc {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " ";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			// sql���� ���� �� ��� �� ó��
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// �ڿ� �ݳ�
			JDBCUtill.close(rs,ps,con);
		}
	}
}
