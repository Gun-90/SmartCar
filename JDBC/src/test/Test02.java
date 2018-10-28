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
		
		// 화면 띄워서 입력받음
		String num  = JOptionPane.showInputDialog("검색할 부서번호를 입력해 주세요");
		int deptno = Integer.parseInt(num);

		String sql="select * from emp where deptno = ?";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅 작업 
			ps.setInt(1, deptno);
			
			//sql 구문 실행 및 결과 값 처리
			rs  = ps.executeQuery()	;
			System.out.printf("%10s \t %10s \t  %s \t      %s %n","사원명","업무","입사일","부서번호");
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
			//자원 반납
			JDBCUtill.close(rs, ps, con);
		}
	}
}
