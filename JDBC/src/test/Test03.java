package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtill;

public class Test03 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//board ���̺� �Խñ� ��� 
		//�Խù� ��ȣ , title , �ۼ��� �̸� , ��� ���� ,��ȸȽ��
		// �������� ��ũ�� �־������ cnt ���� ��ũ USERS u ���� ��ũ....
		String sql=" select no,title,name,regdate,cnt " + 
				" from board b, USERS u" + 
				" where b.id = u.id" + 
				" order by 1    ";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			
			//sql ���� ���� �� ��� �� ó��
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s  \t",rs.getInt("no"));
				System.out.printf("%-15s  \t",rs.getString("title"));
				System.out.printf("%-8s  \t",rs.getString("name"));
				System.out.printf("%s  \t",rs.getDate("regdate"));
				System.out.printf("%s  \n",rs.getInt("cnt"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			//�ڿ� �ݳ�
			JDBCUtill.close(rs, ps, con);
		}
	}

}
