package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtill;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "update board set title= ? where no=?";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "<�߿�> ~~ ����ȳ�");
			ps.setInt(2, 6);
			
			
			// sql���� ���� �� ��� �� ó��
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			// �ڿ� �ݳ�
			JDBCUtill.close(rs,ps,con);
		}
	
	}
}
