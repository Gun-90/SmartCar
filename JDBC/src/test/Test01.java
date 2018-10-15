package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userid = "scott";
		String pw = "tiger";
		
		// jdbc�� ����Ŀ��
		String sql_1 = "select ename, job, sal from emp ";
		String sql_2 = "select ename, job, sal+nvl(comm,0) as \"�޿�\" from emp ";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			// 1. ����̹� �ε�
			Class.forName(driver);
			
			// 2. Connection ����
			con = DriverManager.getConnection(url, userid, pw);
			//System.out.println(con);
			
			// 3. statement(SQL ���� ���� ��ü) ����
			ps = con.prepareStatement(sql_2);
			
			// SQL ����(excute, executeUpdate, executeQuery)
			rs = ps.executeQuery(); // rs�� ���̺��� ù��° ���� ����Ű�� ����
			
			// ���ó��
			while(rs.next()) {
				
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+ "\t");
				System.out.print(rs.getString("�޿�")+ "\n");
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);			
		} finally {
			// 7. �ڿ�����(connection, statement, resultset)
			try {
				if(rs != null) rs.close();
				if(ps != null) ps.close();
				if(con != null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println(" *** Main end *** ");
		
	}

}
