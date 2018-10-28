package service;

import java.util.List;

import vo.DeptVO;

public interface DeptService {
	public List<DeptVO> getAllDept();
	public DeptVO getDept(int no);
	public void insertDept(DeptVO vo) throws Exception;
	public void insertDept(int no, String name, String loc) throws Exception;
	
	
}
