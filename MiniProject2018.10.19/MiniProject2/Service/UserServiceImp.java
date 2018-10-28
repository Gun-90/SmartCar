package MiniProject2.Service;

import MiniProject2.DAO.UserServiceDAO;
import MiniProject2.Vo.SeekerVO;

public class UserServiceImp implements UserService {

	private UserServiceDAO dao = null;

	public UserServiceImp() {

	}

	public UserServiceImp(UserServiceDAO dao) {
		super();
		this.dao = dao;
	}

	public UserServiceDAO getDao() {
		return dao;
	}

	public void setDao(UserServiceDAO dao) {
		this.dao = dao;
	}

	/**
	 * ID�ߺ�üũ �޼ҵ� UserServiceDAO���� ��û �ߺ��� True �ߺ��� �ƴҽ� false
	 */
	@Override
	public boolean getIdReduplicationCheck(String id) {

		return dao.getIdReduplicationCheck(id);

	}

	/**
	 * pw������ True pw�ٸ��� false
	 */
	@Override
	public boolean getPwReduplicationCheck(String pw) {
		return dao.getPwReduplicationCheck(pw);
	}

	/**
	 * ȸ�����̸� true �ƴҰ�� false
	 */
	@Override
	public boolean getAuthorityCheck(String id) {
		return dao.getAuthorityCheck(id);
	}

	@Override
	public void seekerRegister(SeekerVO vo) {
		dao.seekerRegister(vo);

	}


}
