package MiniProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {

	public Connection getConnection() {

		Connection con = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "SCOTT";
		String pw = "TIGER";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			System.out.print("Driver »Æ¿Œ");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void close(ResultSet rs, Statement ps, Connection con) {
		try {
			if (con != null) {
				con.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close(Statement ps, Connection con) {
		try {
			if (con != null) {
				con.close();
			}
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
