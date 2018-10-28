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
	 * @return id중복됫으면 true 중복이아니면 false
	 */
	public boolean idCheck(String id) {
		// 중복시 True 중복이 아닐시 false
		if (us_s.getIdReduplicationCheck(id)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param pw
	 * @return pw같으면 true pw다르면 false
	 */
	public boolean pwCheck(String pw) {
		if (us_s.getPwReduplicationCheck(pw)) {
			return true;
		}
		return false;
	}

	/**
	 * 관리자인지 아닌지 권한 체크
	 * 
	 * @param id를 통해 비교
	 * @return 회사관리자이면 true , 손님이면 false
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
	 * DB 회사이름,로고 보여주기위한메소드
	 * 
	 * @return 회사이름
	 */
	public List<CompanyInfoVO> getScreenList() {

		return ci_s.getScreenList();
	}

	/**
	 * 시작일부터모집시기검색
	 * 
	 * @param start 시작일
	 * @return 시작일부터 종료일 사이에있는 리스트
	 */
	public List<CompanyInfoVO> getStartRecruitmentList(String start) {
		return ci_s.getStartRecruitmentList(start);
	}

	/**
	 * 종료일까지 모집시기검색
	 * 
	 * @param end 종료일
	 * @return 당일부터 종료일 사이에있는 리스트
	 */
	public List<CompanyInfoVO> getEndRecruitmentList(String end) {
		return ci_s.getEndRecruitmentList(end);
	}

	/**
	 * 검색명이 포함된 회사명검색
	 * 
	 * @param name 회사검색할 검색명
	 * @return 회사이름이포함된 리스트
	 */
	public List<CompanyInfoVO> getAllCompanyList(String name) {
		return ci_s.getAllCompanyList(name);
	}

	/**
	 * 검색명인 회사검색
	 * 
	 * @param name 회사이름
	 * @return 회사이름의 리스트
	 */
	public List<CompanyInfoVO> getCompanyList(String name) {
		return ci_s.getCompanyList(name);
	}

	/**
	 * 나의 주소가 회사의 근무지역이 같은 지역검색
	 * 
	 * @param area 내가사는곳으로 검색
	 * @return 나의 주소가 회사의 근무지역인 리스트
	 */
	public List<ComSeekVO> getAreaCompanyList(String area) {
		return ci_s.getAreaCompanyList(area);
	}

}
