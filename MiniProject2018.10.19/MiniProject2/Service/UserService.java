package MiniProject2.Service;

import MiniProject2.Vo.SeekerVO;

public interface UserService {
	/**
	 * 
	 * @param id
	 * @return �ߺ��� True �ߺ��� �ƴҽ� false
	 */
	public boolean getIdReduplicationCheck(String id);

	/**
	 * PW ������ ����
	 * 
	 * @param pw
	 * @return pw������ True pw�ٸ��� false
	 */
	public boolean getPwReduplicationCheck(String pw);

	/**
	 * 
	 * @param id������
	 * @return ȸ�����̸� true����
	 * 
	 */
	public boolean getAuthorityCheck(String id);

	/**
	 * �������
	 */
	public void seekerRegister(SeekerVO vo);

}
