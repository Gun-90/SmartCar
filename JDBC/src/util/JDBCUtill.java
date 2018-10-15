package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtill {
	public static Connection getConnection() {
		Connection con = null;
		
		String driver = "oracle.jdbc.OracleDriver";
		String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String userid = "scott";
		String pw = "tiger";
		
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, pw);
			
			//System.out.println(con);
			
			// SQL 수행(excute, executeUpdate, executeQuery)
			
		}catch (ClassNotFoundException e) {
			System.out.println("Driver 확인");
			
		}catch (SQLException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
	public static void close(ResultSet rs, PreparedStatement ps , Connection con) {
		
		//자원정리(connection, Statement, resultset)
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
