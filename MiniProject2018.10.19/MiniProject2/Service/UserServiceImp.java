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
	 * ID중복체크 메소드 UserServiceDAO에게 요청 중복시 True 중복이 아닐시 false
	 */
	@Override
	public boolean getIdReduplicationCheck(String id) {

		return dao.getIdReduplicationCheck(id);

	}

	/**
	 * pw같으면 True pw다르면 false
	 */
	@Override
	public boolean getPwReduplicationCheck(String pw) {
		return dao.getPwReduplicationCheck(pw);
	}

	/**
	 * 회사사람이면 true 아닐경우 false
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
