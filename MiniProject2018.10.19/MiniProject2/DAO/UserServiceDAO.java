package MiniProject2.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import MiniProject2.JDBCUtil;
import MiniProject2.Vo.SeekerVO;

public class UserServiceDAO {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private JDBCUtil jdbc = new JDBCUtil();

	/**
	 * ID중복체크 메소드
	 * 
	 * @param id
	 * @return 중복시 True 중복이 아닐시 false
	 */
	public boolean getIdReduplicationCheck(String id) {
		String sql = "select s_id as ID from SEEKER where s_id = ? ";
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString("ID").equals(id)) {
					return true;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return false;
	}

	/**
	 * PW 같은지 조사
	 * 
	 * @param pw
	 * @return pw같으면 True pw다르면 false
	 */
	public boolean getPwReduplicationCheck(String pw) {
		String sql = "select s_pw as PW from SEEKER ";
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString("PW").equals(pw)) {
					return true;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return false;
	}

	/**
	 * 
	 * @param id를 통해 권한 체크
	 * @return 회사관리자면 true 관리자가아니면 false
	 */
	public boolean getAuthorityCheck(String id) {
		String sql = "select s_belong from SEEKER where s_id=? ";
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getBoolean("s_belong")) {
					return true;
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return false;
	}

	/**
	 * 매개변수를 db에 저장
	 * 
	 */
	public void seekerRegister(SeekerVO vo) {
		String sql = "insert into SEEKER values (?,?,?,?,?,?,?)";

		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			// SeekerVO객체를 불러와 객체의 정보로 저장
			ps.setString(1, vo.getSeeker_id());
			ps.setString(2, vo.getSeeker_pw());
			ps.setString(3, vo.getSeeker_final_edu());
			ps.setInt(4, vo.getSeeker_age());
			ps.setString(5, vo.getSeeker_field());
			ps.setString(6, vo.getSeeker_area());
			ps.setInt(7, vo.getSeeker_blong());
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
	}

}
