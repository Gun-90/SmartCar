package MiniProject2.DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import MiniProject2.JDBCUtil;
import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;

public class CompanyInfoDAO {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private JDBCUtil jdbc = new JDBCUtil();

	/**
	 * DB ȸ���̸���
	 * 
	 * @return �ߺ������� ȸ���̸� ����Ʈ
	 */
	public List<CompanyInfoVO> getScreenList() {
		List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();
		String sql = "select distinct c_name as ȸ���̸� from COMPANY_INTRO";
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				CompanyInfoVO data = new CompanyInfoVO();
				data.setC_name(rs.getString("ȸ���̸�"));
				list.add(data);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;
	}

	/**
	 * ������ ���͸����ñ�˻�
	 * 
	 * @param start ������
	 * @return �����Ϻ��� �����ϱ��� ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getStartRecruitmentList(String start) {
		List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();

		String sql = "select * from COMPANY_INTRO c where c.c_recruitment_start >= ? ";
		System.out.println(start);
		try {
			System.out.println(start);
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Date parsed = format.parse(start);
			java.sql.Date change1 = new java.sql.Date(parsed.getTime());
			System.out.println(start);
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setDate(1, change1);

			rs = ps.executeQuery();

			while (rs.next()) {

				CompanyInfoVO data = new CompanyInfoVO(rs.getString("c_name"), rs.getString("c_field"),
						rs.getString("c_intro"), rs.getDate("c_recruitment_start"), rs.getDate("c_recruitment_end"),
						rs.getString("c_qualification"), rs.getString("c_area"), rs.getString("c_talent"));

				list.add(data);

			}
		} catch (ParseException e) {
			System.out.println("parseEXception");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;
	}

	/**
	 * �����ϱ��� �����ñ�˻�
	 * 
	 * @param start ������
	 * @return �����Ϻ��� �����ϱ��� ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getEndRecruitmentList(String end) {
		List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();
		System.out.println(end);
		String sql = "select * from COMPANY_INTRO c where c.c_recruitment_start <= sysdate AND c.c_recruitment_end <= ? "; // >>>>>>��¥
		try {
			System.out.println(end);
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			Date parsed = format.parse(end);
			java.sql.Date change1 = new java.sql.Date(parsed.getTime());
			System.out.println(end);

			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setDate(1, change1);

			rs = ps.executeQuery();

			while (rs.next()) {

				CompanyInfoVO data = new CompanyInfoVO(rs.getString("c_name"), rs.getString("c_field"),
						rs.getString("c_intro"), rs.getDate("c_recruitment_start"), rs.getDate("c_recruitment_end"),
						rs.getString("c_qualification"), rs.getString("c_area"), rs.getString("c_talent"));

				list.add(data);

			}
		} catch (ParseException e) {
			System.out.println("parseEXception");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;
	}

	/**
	 * �˻����� ���Ե� ȸ���˻�
	 * 
	 * @param name ȸ��˻��� �˻���
	 * @return ȸ���̸������Ե� ����Ʈ
	 */
	public List<CompanyInfoVO> getAllCompanyList(String name) {
		List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();

		String sql = "select * from COMPANY_INTRO where c_name LIKE ? ";
		StringBuffer sb = new StringBuffer();
		sb.append("%").append(name).append("%");
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, sb.toString());
			rs = ps.executeQuery();
			while (rs.next()) {
				CompanyInfoVO data = new CompanyInfoVO(rs.getString("c_name"), rs.getString("c_field"),
						rs.getString("c_intro"), rs.getDate("c_recruitment_start"), rs.getDate("c_recruitment_end"),
						rs.getString("c_qualification"), rs.getString("c_area"), rs.getString("c_talent"));
				list.add(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;

	}

	/**
	 * �˻����� ȸ��˻�
	 * 
	 * @param name ȸ���̸�
	 * @return ȸ���̸��� ����Ʈ
	 */
	public List<CompanyInfoVO> getCompanyList(String name) {
		List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();

		String sql = "select * from COMPANY_INTRO c where c.c_name = ? ";
		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			rs = ps.executeQuery();

			while (rs.next()) {

				CompanyInfoVO data = new CompanyInfoVO(rs.getString("c_name"), rs.getString("c_field"),
						rs.getString("c_intro"), rs.getDate("c_recruitment_start"), rs.getDate("c_recruitment_end"),
						rs.getString("c_qualification"), rs.getString("c_area"), rs.getString("c_talent"));

				list.add(data);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;
	}

	/**
	 * ���� �ּҰ� ȸ���� �ٹ������� ���� �����˻�
	 * 
	 * @param area ������°����� �˻�
	 * @return ���� �ּҰ� ȸ���� �ٹ������� ����Ʈ
	 */
	public List<ComSeekVO> getAreaCompanyList(String area) {
		List<ComSeekVO> list = new ArrayList<ComSeekVO>();

		String sql = "select * from COMPANY_INTRO c, SEEKER s where s.s_area = c.c_area AND s.s_area = ?";

		try {
			con = jdbc.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, area);
			rs = ps.executeQuery();

			while (rs.next()) {

				ComSeekVO data = new ComSeekVO(rs.getString("c_name"), rs.getString("c_field"), rs.getString("c_intro"),
						rs.getString("c_recruitment_start"), rs.getString("c_recruitment_end"),
						rs.getString("c_qualification"), rs.getString("c_area"), rs.getString("c_talent"));

				list.add(data);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			jdbc.close(rs, ps, con);
		}
		return list;
	}
}
