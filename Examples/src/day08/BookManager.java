package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookManager {
	//Book[] books;
	//컬렉션 프레임 웍 사용
	private List<Book> books = new ArrayList<>();


	public BookManager() {}
	
	
	//1. Book 입력
	public void addBook(String title, int price) {
		Book b = new Book(title,price);
		books.add(b);
	}
	
	//2. Book 삭제
	public void deleteBook(Book b) {
		Iterator<Book> ib = books.iterator();
		while(ib.hasNext()) {
			Book book = (Book) ib.next();
			if(b.equals(book.getTitle())) {
				ib.remove();
			}
		}
	}
	
	// Book 검색
	public List<Book> searchBook(String title){
		List<Book> result = new ArrayList<>();
		Iterator<Book> ib = books.iterator();
		while(ib.hasNext()) {
			Book book = (Book) ib.next();
			if(book.getTitle().contains(title)) {
				result.add(book);
			}
			
		}
		
		return result;
	}
	
	public void dataLoad() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("sample.txt"));
		
		
		
	}
	
	public List<Book> getBookList(){
		return books;
	}
	
	
	
	
}
