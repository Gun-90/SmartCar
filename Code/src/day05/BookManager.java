package day05;

public class BookManager {
	Book[] books = new Book[1000];
	int count = 0;
	public BookManager() {
		
	}
	public BookManager(Book[] books) {
		this.books = books;
	}

	
	// 등록, 삭제, 수정, 검색, 조회
	public void addBook(String title, int price) {
		books[count++] = new Book(title, price);
	}
	public void bookList() {
		for(int i=0;i<count;i++) {
			books[i].print();
		}
	}
	
	
	
}
