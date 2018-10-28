package MiniProject2.Service;

import java.util.List;

import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;

public interface CompanyInfoService {

	/**
	 * DB 회사이름만
	 * 
	 * @return 회사이름
	 */
	public List<CompanyInfoVO> getScreenList();

	/**
	 * 시작일 부터 모집시기검색
	 * 
	 * @param start 시작일
	 * @return 시작일부터 종료일 사이에있는 리스트
	 */
	public List<CompanyInfoVO> getStartRecruitmentList(String start);

	/**
	 * 선택한 종료일까지 모집시기검색
	 * 
	 * @param end 종료일
	 * @return 오늘부터 종료일까지 사이에있는 리스트
	 */
	public List<CompanyInfoVO> getEndRecruitmentList(String end);

	/**
	 * 검색명이 포함된 회사명검색
	 * 
	 * @param name 회사검색할 검색명
	 * @return 회사이름이포함된 리스트
	 */
	public List<CompanyInfoVO> getAllCompanyList(String name);

	/**
	 * 검색명인 회사검색
	 * 
	 * @param name 회사이름
	 * @return 회사이름의 리스트
	 */
	public List<CompanyInfoVO> getCompanyList(String name);

	/**
	 * 나의 주소가 회사의 근무지역이 같은 지역검색
	 * 
	 * @param area 내가사는곳으로 검색
	 * @return 나의 주소가 회사의 근무지역인 리스트
	 */
	public List<ComSeekVO> getAreaCompanyList(String area);
}
