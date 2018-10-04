package day07;

public class Test01 {
	public static void main(String[] args) {
		String s1 = new String("hello java");
		String s2 = new String("hello java");
		System.out.println(s1); // s1.tostring() 생략되어있음
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		Book b1 = new Book("SQL", 100);
		Book b2 = new Book("SQL", 100);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1 == b2);
		
	}
}

class Book extends Object{
	
	String title;
	int price;
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public Book() {	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price =price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) return false;			
		Book b = (Book)obj;
		boolean flag = false;
		if(title.equals(b.title) && price == b.price){
			flag = true;
			
		}
		
		return flag;
		
	}
	
}