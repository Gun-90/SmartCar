package day08;

import java.util.Scanner;

import day07.ex.BookManager;

public class BookAp {

	public static void main(String[] args) {
		BookManager mgr = new BookManager();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�������� App");
			System.out.println("�����ϼ���...");
			System.out.println("1. Book �Է�...");
			System.out.println("2. Book ����...");
			System.out.println("3. Book �˻�...");
			System.out.println("4. Book ����...");
			System.out.println("5. ���α׷� ����");
			System.out.println("����");
			String input = sc.nextLine();
			
			switch(input.charAt(0)) {
			
			case '1':
				System.out.println("�������� �Է����ּ���");
				System.out.println("�Է� ��) => title/����  (jsp/2000)");
				String data = sc.nextLine();
				String[] b = data.split("/");
				String title = b[0];
				int price = Integer.parseInt(b[1]);
				System.out.println("������ �Է����ּ���");
				mgr.addBook(title, price);
				break;
			
			case '2':
				System.out.println("���� �� å ������ �Է��ϼ���");
				data = sc.nextLine();
				mgr.deleteBook(data);
				System.out.println(data+"�� �����Ǿ����ϴ�.");
				break;
			case '3':
				System.out.println("�˻� �� å ������ �Է��ϼ���");
				data = sc.nextLine();
				mgr.seleteBook(data);
				
				break;
			case '4':
				mgr.bookList();
				break;
			case '5':
				System.out.println("�����մϴ�");
				return; // ����
				//System.exit(0);
				//break;
			default:
				System.out.println("�ٽ��Է����ּ���");
				break;
			}
		}
	}

}
