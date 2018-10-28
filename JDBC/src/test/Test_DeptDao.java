package test;

import java.util.Iterator;
import java.util.List;

import DAO.DeptDAO;
import vo.DeptVO;

public class Test_DeptDao {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		List<DeptVO> list = dao.getDeptList();
		
		Iterator<DeptVO> id = list.iterator();
		
		while(id.hasNext()) {
			DeptVO deptVO = id.next();
			System.out.println(deptVO.getDname());
			
		}
		System.out.println("================");
		System.out.println(dao.getDept(70));
		System.out.println("================");
		// dao.insertDept(50,"기술부", "서울");
		try {
			dao.insertDept(new DeptVO(60, "교육부", "대전"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("================");
		System.out.println(dao.getDept(60));
	}

}
