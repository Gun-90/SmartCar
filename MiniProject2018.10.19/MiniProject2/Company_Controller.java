package MiniProject2;

import java.util.List;

import MiniProject2.DAO.CompanyInfoDAO;
import MiniProject2.DAO.UserServiceDAO;
import MiniProject2.Service.CompanyInfoService;
import MiniProject2.Service.CompanyInfoServiceImp;
import MiniProject2.Service.UserService;
import MiniProject2.Service.UserServiceImp;
import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;
import MiniProject2.Vo.SeekerVO;

public class Company_Controller {
	private UserServiceDAO usdao = new UserServiceDAO();
	private UserService us_s = new UserServiceImp(usdao);
	private CompanyInfoDAO cidao = new CompanyInfoDAO();
	private CompanyInfoService ci_s = new CompanyInfoServiceImp(cidao);

	/**
	 * 
	 * @param id
	 * @return id�ߺ������� true �ߺ��̾ƴϸ� false
	 */
	public boolean idCheck(String id) {
		// �ߺ��� True �ߺ��� �ƴҽ� false
		if (us_s.getIdReduplicationCheck(id)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param pw
	 * @return pw������ true pw�ٸ��� false
	 */
	public boolean pwCheck(String pw) {
		if (us_s.getPwReduplicationCheck(pw)) {
			return true;
		}
		return false;
	}

	/**
	 * ���������� �ƴ��� ���� üũ
	 * 
	 * @param id�� ���� ��
	 * @return ȸ��������̸� true , �մ��̸� false
	 */
	public boolean authorityCheck(String id) {
		if (us_s.getAuthorityCheck(id)) {
			return true;
		}
		return false;
	}

	public void companyRegister(SeekerVO vo) {
		us_s.seekerRegister(vo);
	}

	public void seekerRegister(SeekerVO vo) {
		// TODO Auto-generated method stub
		us_s.seekerRegister(vo);
	}

	// ========================================CompanyInfoServiceImp

	/**
	 * DB ȸ���̸�,�ΰ� �����ֱ����Ѹ޼ҵ�
	 * 
	 * @return ȸ���̸�
	 */
	public List<CompanyInfoVO> getScreenList() {

		return ci_s.getScreenList();
	}

	/**
	 * �����Ϻ��͸����ñ�˻�
	 * 
	 * @param start ������
	 * @return �����Ϻ��� ������ ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getStartRecruitmentList(String start) {
		return ci_s.getStartRecruitmentList(start);
	}

	/**
	 * �����ϱ��� �����ñ�˻�
	 * 
	 * @param end ������
	 * @return ���Ϻ��� ������ ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getEndRecruitmentList(String end) {
		return ci_s.getEndRecruitmentList(end);
	}

	/**
	 * �˻����� ���Ե� ȸ���˻�
	 * 
	 * @param name ȸ��˻��� �˻���
	 * @return ȸ���̸������Ե� ����Ʈ
	 */
	public List<CompanyInfoVO> getAllCompanyList(String name) {
		return ci_s.getAllCompanyList(name);
	}

	/**
	 * �˻����� ȸ��˻�
	 * 
	 * @param name ȸ���̸�
	 * @return ȸ���̸��� ����Ʈ
	 */
	public List<CompanyInfoVO> getCompanyList(String name) {
		return ci_s.getCompanyList(name);
	}

	/**
	 * ���� �ּҰ� ȸ���� �ٹ������� ���� �����˻�
	 * 
	 * @param area ������°����� �˻�
	 * @return ���� �ּҰ� ȸ���� �ٹ������� ����Ʈ
	 */
	public List<ComSeekVO> getAreaCompanyList(String area) {
		return ci_s.getAreaCompanyList(area);
	}

}
