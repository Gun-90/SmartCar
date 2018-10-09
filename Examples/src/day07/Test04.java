package day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		Book[]	books = new Book[100];
//		books[0] = new Book();
		
		List<Book> booklist = new ArrayList<>();
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("sample.txt"));
			while(sc.hasNextLine()) {
				String read =sc.nextLine();
				String[] data= read.split("/");
				String title = data[0].trim();
				int price = Integer.parseInt(data[1].trim());
				
				Book book = new Book(title, price);
				booklist.add(book);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(sc != null)sc.close();
		}
		// 목록 출력
		System.out.println("****** Book 정보 출력 *****");
		Iterator<Book> ib = booklist.iterator();
		while(ib.hasNext()) {
			Book book = (Book)ib.next();
			System.out.println(book);
		}
		System.out.println("*******************");
		
		// 검색 가격 > 30000
		System.out.println(" 가격 > 30000 인 정보 검색 결과 리스트");
		
		ib = booklist.iterator();
		while (ib.hasNext()) {
			Book book = (Book) ib.next();
			if(book.price > 30000) {
				System.out.println(book);
			}
		}
		System.out.println(" 삭제  title = SQL");
		ib = booklist.iterator();
		while(ib.hasNext()) {
			Book book = (Book) ib.next();
			System.out.println(book);
			
		}
		// 목록 출력
		System.out.println("****** Book 정보 출력 *****");
		ib = booklist.iterator();
		while(ib.hasNext()) {
			Book book = (Book)ib.next();
			System.out.println(book);
		}
		System.out.println("*******************");
		
		
	}
}
