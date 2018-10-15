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
		
		// jdbc는 오토커밋
		String sql_1 = "select ename, job, sal from emp ";
		String sql_2 = "select ename, job, sal+nvl(comm,0) as \"급여\" from emp ";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			// 1. 드라이버 로딩
			Class.forName(driver);
			
			// 2. Connection 생성
			con = DriverManager.getConnection(url, userid, pw);
			//System.out.println(con);
			
			// 3. statement(SQL 구문 관리 객체) 생성
			ps = con.prepareStatement(sql_2);
			
			// SQL 수행(excute, executeUpdate, executeQuery)
			rs = ps.executeQuery(); // rs는 테이블의 첫번째 줄을 가르키고 있음
			
			// 결과처리
			while(rs.next()) {
				
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+ "\t");
				System.out.print(rs.getString("급여")+ "\n");
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e);			
		} finally {
			// 7. 자원정리(connection, statement, resultset)
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
