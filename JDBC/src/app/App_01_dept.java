package app;

import DAO.DeptDAO;
import service.DeptService;
import service.DeptServiceImpl;
import vo.DeptVO;

public class App_01_dept {
	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		DeptService service = new DeptServiceImpl(dao);
		
		for(DeptVO data :service.getAllDept()) {
			System.out.println(data.getDname());
		}
		System.out.println("=============================");
	}
}
