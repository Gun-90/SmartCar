package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JDBCUtill;

public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// ȭ�� ����� �Է¹���
		String num  = JOptionPane.showInputDialog("�˻��� �μ���ȣ�� �Է��� �ּ���");
		int deptno = Integer.parseInt(num);

		String sql="select * from emp where deptno = ?";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			// ? ���� �۾� 
			ps.setInt(1, deptno);
			
			//sql ���� ���� �� ��� �� ó��
			rs  = ps.executeQuery()	;
			System.out.printf("%10s \t %10s \t  %s \t      %s %n","�����","����","�Ի���","�μ���ȣ");
			System.out.println("===================================================");
			while(rs.next()) {
				System.out.printf("%-10s \t",rs.getString("ename"));
				System.out.printf("%-10s \t",rs.getString("job"));
				System.out.printf("%s \t",rs.getDate("hiredate"));
				System.out.printf("%s %n",rs.getString("deptno"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			//�ڿ� �ݳ�
			JDBCUtill.close(rs, ps, con);
		}
	}
}
