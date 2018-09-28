package day04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.print();
		
		Account a2 = new Account();
		a2.setNumber("2018-001");
		a2.setName("홍길동");
		a2.setMoney(-7000);
		a2.print();
		
		//누구나 접근 가능하다.
		System.out.println(a2.getMoney());
	}

}
