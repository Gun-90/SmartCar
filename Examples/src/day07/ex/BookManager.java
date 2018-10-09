package day07.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class BookManager {
	List<Book> books = new ArrayList<Book>();
	
	public BookManager() {	}
	
	// ���, ����, ����, �˻�, ��ȸ
	public void addBook(String title, int price) {
		Book book = new Book(title,price);
		books.add(book);
		
	}
	public void deleteBook(String title) {
		Iterator<Book> ib = books.iterator();
		
		while(ib.hasNext()) {
			Book book = (Book)ib.next();
			if(book.getTitle().equals(title)) {
				ib.remove();
				
			}
		}
	}
	public void seleteBook(String title) {
		Iterator<Book> ib = books.iterator();
		
		while(ib.hasNext()) {
			Book book = (Book)ib.next();
			if(book.getTitle().equals(title)) {
				System.out.println(ib);
			}
		}
	}
	public void bookList() {
		Iterator<Book> ib = books.iterator();
		
		while(ib.hasNext()) {
			Book book = (Book)ib.next();
			System.out.println("["+book.getTitle() +" / "+ book.getPrice()+"]" );
		}
	}
}
