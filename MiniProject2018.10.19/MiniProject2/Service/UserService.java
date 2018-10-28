package MiniProject2.Service;

import MiniProject2.Vo.SeekerVO;

public interface UserService {
	/**
	 * 
	 * @param id
	 * @return 중복시 True 중복이 아닐시 false
	 */
	public boolean getIdReduplicationCheck(String id);

	/**
	 * PW 같은지 조사
	 * 
	 * @param pw
	 * @return pw같으면 True pw다르면 false
	 */
	public boolean getPwReduplicationCheck(String pw);

	/**
	 * 
	 * @param id로조사
	 * @return 회사사람이면 true리턴
	 * 
	 */
	public boolean getAuthorityCheck(String id);

	/**
	 * 유저등록
	 */
	public void seekerRegister(SeekerVO vo);

}
