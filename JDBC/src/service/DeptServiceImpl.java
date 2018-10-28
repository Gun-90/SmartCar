package service;

import java.util.List;

import DAO.DeptDAO;
import vo.DeptVO;

public class DeptServiceImpl implements DeptService{
	DeptDAO dao = null;
	public DeptServiceImpl() {	}
	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}
	public DeptDAO getDao() {
		return dao;
	}
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	@Override
	public List<DeptVO> getAllDept() {
		
		return dao.getDeptList();
	}

	@Override
	public DeptVO getDept(int no) {
		// TODO Auto-generated method stub
		return dao.getDept(no);
	}

	@Override
	public void insertDept(DeptVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.insertDept(vo);
		
	}

	@Override
	public void insertDept(int no, String name, String loc) throws Exception {
		// TODO Auto-generated method stub
		dao.insertDept(no,name,loc);
		
	}
	
}
