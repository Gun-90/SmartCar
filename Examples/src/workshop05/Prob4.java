package workshop05;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr();
		
		mgr.addBook(new Book("Java",1000));
		mgr.addBook(new Book("jsp",3000));
		mgr.addBook(new Book("JDBC",1000));
		mgr.addBook(new Book("EJB",1000));
		mgr.addBook("EJB",1000);
		mgr.printBookList();
		
		
	}

}
