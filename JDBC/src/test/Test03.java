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
		
		//board 테이블 게시글 목록 
		//게시물 번호 , title , 작성자 이름 , 등록 날자 ,조회횟수
		// 마지막에 블랭크를 넣어줘야함 cnt 다음 블랭크 USERS u 다음 블랭크....
		String sql=" select no,title,name,regdate,cnt " + 
				" from board b, USERS u" + 
				" where b.id = u.id" + 
				" order by 1    ";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql);
			
			//sql 구문 실행 및 결과 값 처리
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
			//자원 반납
			JDBCUtill.close(rs, ps, con);
		}
	}

}
