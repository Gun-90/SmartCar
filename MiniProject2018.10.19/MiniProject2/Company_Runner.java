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
		System.out.println("�α��� ȭ��");
		System.out.println(">>>>>>>>>>>>>>>������");

		System.out.println("1. ȸ������ >>>IDüũ >>>�մ�");
		System.out.println("2. �α��� >> ID �� PWüũ");
		System.out.println("3. ����ȭ�� ����");
		System.out.println("4. �����ñ�˻�");
		System.out.println("5. ȸ���˻�");
		System.out.println("6. ȸ�� Ŭ���� ������");
		System.out.println("7. �� �ֺ������˻�");
		System.out.println("8. ȸ�����ϱ�");
		System.out.println("���ڸ� �Է����ּ���");

		int index = sc.nextInt();

		switch (index) {
		case 1:
			System.out.println("ȸ������������");
			System.out.println("ID�ߺ�üũ�մϴ�");
			System.out.println("�ؽ�Ʈ�Էµ�â����getText�Ѱ� String ����������");
			String id1 = "kim0909";
			if (!cc.idCheck(id1)) {
				System.out.println("id��������");
				SeekerVO svo = new SeekerVO(id1, "seeker_pw", "seeker_final_edu", 30, "seeker_field", "seeker_area", 0);
				cc.seekerRegister(svo);
			} else {
				System.out.println("id�� �̹� �����մϴ�");
			}

			break;
		case 2:
			System.out.println("�α����ҷ��մϴ�~~");
			String id2 = "kim0909";
			String pw = "6666";
			if (cc.idCheck(id2)) {
				if (cc.pwCheck(pw)) {
					System.out.println("�α��μ���~~ ���� �޽���â���� ��ȯ~~~");
				} else {
					System.out.println("pw�� Ʋ���ϴ�. Ȯ�����ּ���");
				}
			} else {
				System.out.println("��ϵ� ID�� �ƴմϴ�. ID�� Ȯ�����ּ���");
			}
			break;
		case 3:
			System.out.println("�α��μ����� ȭ��");
			System.out.println(">>>>>>");
			System.out.println("ȸ���̹���,ȸ��ΰ���");
			list = cc.getScreenList();

			Iterator<CompanyInfoVO> ic = list.iterator();
			while (ic.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic.next();
				System.out.println(ci.getC_name());
			}

			list.clear();
			break;

		case 4:
			System.out.println("�����ñ�˻�");
			System.out.println(">>>>>");
			System.out.println("�����ϰ� �������� ����");
			String start = "20181015";
			String end = "20181016";
			// ����
			list = cc.getStartRecruitmentList(start);
			Iterator<CompanyInfoVO> ic2 = list.iterator();
			while (ic2.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic2.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("��¥ ���� �ִ� ȸ��� list�� ����� ȸ���������~~");
			list.clear();
			break;

		case 5:
			System.out.println("ȸ����� ���Ե� �����ΰ˻�");
			System.out.println(">>>>>");
			System.out.println("ȸ����Է¹���");
			String companyname1 = "��";
			list = cc.getAllCompanyList(companyname1);
			Iterator<CompanyInfoVO> ic3 = list.iterator();
			while (ic3.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic3.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("�˻������Ե�ȸ�縮��Ʈ ���~~");
			list.clear();
			break;

		case 6:
			System.out.println("����ȭ�鿡�� �������� ������ �� ȭ�� �ڼ��� �ߵ�!");
			System.out.println(">>>>>");
			System.out.println("�������̳� �̸�Ŭ�������� �̸� getText�� �ҷ���");
			String companyname2 = "�Ｚ";
			list = cc.getCompanyList(companyname2);
			Iterator<CompanyInfoVO> ic4 = list.iterator();
			while (ic4.hasNext()) {
				CompanyInfoVO ci = (CompanyInfoVO) ic4.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("�ڽ��� ������ ȸ�� ����Ʈ�� ���~~~");
			list.clear();
			break;
		case 7:
			System.out.println("���ֺ������˻�~~");
			System.out.println(">>>>>>");
			System.out.println("");
			String area = "���";
			list2 = cc.getAreaCompanyList(area);
			Iterator<ComSeekVO> ic5 = list2.iterator();
			while (ic5.hasNext()) {
				ComSeekVO ci = (ComSeekVO) ic5.next();
				System.out.println(ci.getC_name() + " " + ci.getC_field() + " " + ci.getC_intro() + " "
						+ ci.getC_recruitment_start() + " " + ci.getC_recruitment_end() + " " + ci.getC_qualification()
						+ " " + ci.getC_area() + " " + ci.getC_talent());
			}
			System.out.println("�ڽ��� ������ ȸ�� ����Ʈ�� ���~~~");
			System.out.println("�ڽ��� ������ó ȸ�� ���~~");
			list2.clear();
			break;
		case 8:
			String id3 = "admin";
			System.out.println("���������� ����");
			if (cc.authorityCheck(id3)) {
				System.out.println("�����ڿ��� ��ư�� ����մϴ�");
				SeekerVO svo = new SeekerVO(id3, "seeker_pw", "seeker_final_edu", 30, "seeker_field", "seeker_area", 1);
				cc.companyRegister(new SeekerVO());
			} else {
				System.out.println("��ư ����Ʈ�� ������");
			}
			break;
		}
	}

}
