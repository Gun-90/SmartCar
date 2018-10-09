package workshop05;

public class BookMgr {
	
	Book[] booklist = new Book[100];
	public BookMgr() {	}
	int count=0;
	
	public void addBook(Book book) {
		this.booklist[count++] = book;
	}
	public void addBook(String title, int price) {
		this.booklist[count++] = new Book(title, price);
	}
	
	public void printBookList() {
		for(int i=0;i<count;i++) {
			System.out.printf("[%10s] price: %d%n", booklist[i].getTitle(), booklist[i].getPrice());
		}
	}
	

}
