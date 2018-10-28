package MiniProject2.Service;

import java.util.List;

import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;

public interface CompanyInfoService {

	/**
	 * DB ȸ���̸���
	 * 
	 * @return ȸ���̸�
	 */
	public List<CompanyInfoVO> getScreenList();

	/**
	 * ������ ���� �����ñ�˻�
	 * 
	 * @param start ������
	 * @return �����Ϻ��� ������ ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getStartRecruitmentList(String start);

	/**
	 * ������ �����ϱ��� �����ñ�˻�
	 * 
	 * @param end ������
	 * @return ���ú��� �����ϱ��� ���̿��ִ� ����Ʈ
	 */
	public List<CompanyInfoVO> getEndRecruitmentList(String end);

	/**
	 * �˻����� ���Ե� ȸ���˻�
	 * 
	 * @param name ȸ��˻��� �˻���
	 * @return ȸ���̸������Ե� ����Ʈ
	 */
	public List<CompanyInfoVO> getAllCompanyList(String name);

	/**
	 * �˻����� ȸ��˻�
	 * 
	 * @param name ȸ���̸�
	 * @return ȸ���̸��� ����Ʈ
	 */
	public List<CompanyInfoVO> getCompanyList(String name);

	/**
	 * ���� �ּҰ� ȸ���� �ٹ������� ���� �����˻�
	 * 
	 * @param area ������°����� �˻�
	 * @return ���� �ּҰ� ȸ���� �ٹ������� ����Ʈ
	 */
	public List<ComSeekVO> getAreaCompanyList(String area);
}
