package day08;

import java.util.Scanner;

import day07.ex.BookManager;

public class BookAp {

	public static void main(String[] args) {
		BookManager mgr = new BookManager();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("도서관리 App");
			System.out.println("선택하세요...");
			System.out.println("1. Book 입력...");
			System.out.println("2. Book 삭제...");
			System.out.println("3. Book 검색...");
			System.out.println("4. Book 보기...");
			System.out.println("5. 프로그램 종료");
			System.out.println("선택");
			String input = sc.nextLine();
			
			switch(input.charAt(0)) {
			
			case '1':
				System.out.println("북정보를 입력해주세요");
				System.out.println("입력 예) => title/가격  (jsp/2000)");
				String data = sc.nextLine();
				String[] b = data.split("/");
				String title = b[0];
				int price = Integer.parseInt(b[1]);
				System.out.println("가격을 입력해주세요");
				mgr.addBook(title, price);
				break;
			
			case '2':
				System.out.println("삭제 할 책 제목을 입력하세요");
				data = sc.nextLine();
				mgr.deleteBook(data);
				System.out.println(data+"가 삭제되었습니다.");
				break;
			case '3':
				System.out.println("검색 할 책 제목을 입력하세요");
				data = sc.nextLine();
				mgr.seleteBook(data);
				
				break;
			case '4':
				mgr.bookList();
				break;
			case '5':
				System.out.println("종료합니다");
				return; // 종료
				//System.exit(0);
				//break;
			default:
				System.out.println("다시입력해주세요");
				break;
			}
		}
	}

}
