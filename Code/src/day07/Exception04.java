package day07;

public class Exception04 {
	public static void main(String[] args) {
		try {
			Account a1 =new Account("2017-001","홍길동",-5000);
			a1.print();
			
			Account a2 =new Account("2017-002","고길동",5500);
			a2.print();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("----------end----------");
	}
	
}
