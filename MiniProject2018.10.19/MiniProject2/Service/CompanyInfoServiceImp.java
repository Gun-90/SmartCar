package MiniProject2.Service;

import java.util.List;

import MiniProject2.DAO.CompanyInfoDAO;
import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;

public class CompanyInfoServiceImp implements CompanyInfoService {

	private CompanyInfoDAO ci_dao = null;

	public CompanyInfoServiceImp() {
	}

	public CompanyInfoServiceImp(CompanyInfoDAO ci_dao) {
		this.ci_dao = ci_dao;
	}

	public CompanyInfoDAO getC_dao() {
		return ci_dao;
	}

	public void setC_dao(CompanyInfoDAO ci_dao) {
		this.ci_dao = ci_dao;
	}

	@Override
	public List<CompanyInfoVO> getScreenList() {
		return ci_dao.getScreenList();
	}

	@Override
	public List<CompanyInfoVO> getStartRecruitmentList(String start) {
		return ci_dao.getStartRecruitmentList(start);
	}

	@Override
	public List<CompanyInfoVO> getEndRecruitmentList(String end) {
		return ci_dao.getEndRecruitmentList(end);
	}

	@Override
	public List<CompanyInfoVO> getAllCompanyList(String name) {
		return ci_dao.getAllCompanyList(name);
	}

	@Override
	public List<CompanyInfoVO> getCompanyList(String name) {
		return ci_dao.getCompanyList(name);
	}

	@Override
	public List<ComSeekVO> getAreaCompanyList(String area) {
		return ci_dao.getAreaCompanyList(area);
	}

}
