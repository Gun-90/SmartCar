package day04;

public class Account {
	//member variable
	private String number;
	
	public Account() {
		System.out.println("Account() 생성");
	}
	
	public Account(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
		
		
	}
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	private String name;
	private int money;
	
	public void setMoney(int money){
		
		if(money<0) return;
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return this.name;
	}
	/**
	 * 입금기능
	 * @author 이건우
	 * @since 2018.8.22
	 * @param money 입금액
	 */
	//입금기능
	public void input(int money) {
		System.out.println("입금전: " + this.money);
		this.money += money;
		System.out.printf("입금후: %d%n", this.money);
		
	}
	/**
	 * 출금 기능
	 * @author 이건우
	 * @since 2018.8.22
	 * @param money
	 */
	
	//출금기능
	public void output(int money) {
		System.out.println("인출전: " + this.money);
		this.money -= money;
		System.out.printf("인출후: %d%n", this.money);
		
	}
	//정보출력기능
	public void print() {
		System.out.printf("[계좌번호:%s (%s) %d원 ] %n", number, name, money);
	}
	
}
