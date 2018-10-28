package DAO;

import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtill;
import vo.DeptVO;

public class DeptDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int row = 0;
	
	String sql_1 = "select deptno,dname,loc from dept order by  deptno";
	
	String sql_2 = "select * from dept where deptno = ? ";
	
	String sql_3 = "Insert Into dept values(?,?,?) ";
	
	public List<DeptVO> getDeptList(){
		List<DeptVO> list = new ArrayList<>();
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql_1);
			rs = ps.executeQuery();
			while(rs.next()) {
				DeptVO data =new DeptVO(rs.getInt("deptno"),
										rs.getString("dname"),
										rs.getString("loc"));
				list.add(data);
				
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			JDBCUtill.close(rs, ps, con);
			
			
		}
		
		
		return list;
	}
	
	
	public DeptVO getDept(int deptno) {
		DeptVO data = null;
		String sql_2 = "select * from dept where deptno = ?";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql_2);
			ps.setInt(1,  deptno);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				data = new DeptVO(rs.getInt("deptno"),
								rs.getString("dname"),
								rs.getString("loc"));
			
	
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			JDBCUtill.close(rs, ps, con);
			
			
		}
		return data;
	}
															// 예외가 발생시 여기서 처리하지않고 던진다
	public void insertDept(int deptno,String dname, String loc) throws Exception {
		DeptVO data = new DeptVO(deptno, dname, loc);
		insertDept(data);
	}
											// 예외가 발생시 여기서 처리하지않고 던진다
	public void insertDept(DeptVO vo) throws Exception {
		String sql_3 = "insert into dept values(?,?,?)";
		try {
			con = JDBCUtill.getConnection();
			ps = con.prepareStatement(sql_3);
			ps.setInt(1, vo.getDeptno());
			ps.setString(2, vo.getDname());
			ps.setString(3, vo.getLoc());
			
			row = ps.executeUpdate();
		}catch (Exception e) {
//			System.out.println(e);
			throw e;
		}finally {
			JDBCUtill.close(rs, ps, con);
		}
		
		
	}
}

