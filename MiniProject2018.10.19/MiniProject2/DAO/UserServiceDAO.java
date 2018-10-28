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
	 * ID�ߺ�üũ �޼ҵ�
	 * 
	 * @param id
	 * @return �ߺ��� True �ߺ��� �ƴҽ� false
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
	 * PW ������ ����
	 * 
	 * @param pw
	 * @return pw������ True pw�ٸ��� false
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
	 * @param id�� ���� ���� üũ
	 * @return ȸ������ڸ� true �����ڰ��ƴϸ� false
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
	 * �Ű������� db�� ����
	 * 
	 */
	public void seekerRegister(SeekerVO vo) {
		String sql = "insert into SEEKER values (?,?,?,?,?,?,?)";

		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			// SeekerVO��ü�� �ҷ��� ��ü�� ������ ����
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
