package MiniProject2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import MiniProject2.UI.LoginGUI;
import MiniProject2.Vo.ComSeekVO;
import MiniProject2.Vo.CompanyInfoVO;
import MiniProject2.Vo.SeekerVO;

public class Company_Runner {

	private Scanner sc = new Scanner(System.in);
	private Company_Controller cc = new Company_Controller();
	private List<CompanyInfoVO> list = new ArrayList<CompanyInfoVO>();
	private List<ComSeekVO> list2 = new ArrayList<ComSeekVO>();
	private LoginGUI loginGUI;

	public Company_Runner() {
		loginGUI = new LoginGUI();
	}

	public void start() {
		System.out.println("로그인 화면");
		System.out.println(">>>>>>>>>>>>>>>진행중");

		System.out.println("1. 회원가입 >>>ID체크 >>>손님");
		System.out.println("2. 로그인 >> ID 및 PW체크");
		System.out.println("3. 메인화면 보기");
		System.out.println("4. 모집시기검색");
		System.out.println("5. 회사명검색");
		System.out.println("6. 회사 클릭후 상세정보");
		System.out.println("7. 내 주변지역검색");
		System.out.println("8. 회사등록하기");
		System.out.println("숫자를 입력해주세요");

		int index = sc.nextInt();

		switch (index) {
		case 1:
			System.out.println("회원가입프레임");
			System.out.println("ID중복체크합니다");
			System.out.println("텍스트입력된창에서getText한값 String 변수로저장");
			String id1 = "kim0909";
			if (!cc.idCheck(id1)) {
				System.out.println("id생성가능");
				SeekerVO svo = new SeekerVO(id1, "seeker_pw", "seeker_final_edu", 30, "seeker_field", "seeker_area", 0);
				cc.seekerRegister(svo);
			} else {
				System.out.println("id가 이미 존재합니다");
			}

			break;
		case 2:
			System.out.println("로그인할려합니다~~");
			String id2 = "kim0909";
			String pw = "6666";
			if (cc.idCheck(id2)) {
				if (cc.pwCheck(pw)) {
					System.out.println("로그인성공~~ 메인 메시지창으로 전환~~~");
				} else {
					System.out.println("pw가 틀립니다. 확인해주세요");
				}
			} else {
				System.out.println("등록된 ID가 아닙니다. ID를 확인해주세요");
			}
			break;
		case 3:
			System.out.println("로그인성공후 화면");
			System.out.println(">>>>>>");
			System.out.println("회사이미지,회사로고만뜸");
			list = cc.getScreenList();

			Iterator<CompanyInfoVO> ic = list.iterator();
			while (ic.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic.next();
				System.out.println(ci.getC_name());
			}

			list.clear();
			break;

		case 4:
			System.out.println("모집시기검색");
			System.out.println(">>>>>");
			System.out.println("시작일과 종료일을 받음");
			String start = "20181015";
			String end = "20181016";
			// 시작
			list = cc.getStartRecruitmentList(start);
			Iterator<CompanyInfoVO> ic2 = list.iterator();
			while (ic2.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic2.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("날짜 범위 있는 회사들 list에 저장된 회사정보출력~~");
			list.clear();
			break;

		case 5:
			System.out.println("회사명이 포함된 값으로검색");
			System.out.println(">>>>>");
			System.out.println("회사명입력받음");
			String companyname1 = "삼";
			list = cc.getAllCompanyList(companyname1);
			Iterator<CompanyInfoVO> ic3 = list.iterator();
			while (ic3.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic3.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("검색어포함된회사리스트 출력~~");
			list.clear();
			break;

		case 6:
			System.out.println("메인화면에서 아이콘을 눌렀을 때 화면 자세히 발동!");
			System.out.println(">>>>>");
			System.out.println("아이콘이나 이름클릭했을때 이름 getText로 불러옴");
			String companyname2 = "삼성";
			list = cc.getCompanyList(companyname2);
			Iterator<CompanyInfoVO> ic4 = list.iterator();
			while (ic4.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic4.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("자신이 선택한 회사 리스트만 출력~~~");
			list.clear();
			break;
		case 7:
			System.out.println("내주변지역검색~~");
			System.out.println(">>>>>>");
			System.out.println("");
			String area = "경기";
			list2 = cc.getAreaCompanyList(area);
			Iterator<ComSeekVO> ic5 = list2.iterator();
			while (ic5.hasNext()) {
				ComSeekVO ci = (ComSeekVO) ic5.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("자신이 선택한 회사 리스트만 출력~~~");
			System.out.println("자신의 지역근처 회사 출력~~");
			list2.clear();
			break;
		case 8:
			String id3 = "admin";
			System.out.println("관리자인지 조사");
			if (cc.authorityCheck(id3)) {
				System.out.println("관리자여서 버튼을 등록합니다");
				SeekerVO svo = new SeekerVO(id3, "seeker_pw", "seeker_final_edu", 30, "seeker_field", "seeker_area", 1);
				cc.companyRegister(new SeekerVO());
			} else {
				System.out.println("버튼 디폴트로 못누름");
			}
			break;
		}
	}

}
