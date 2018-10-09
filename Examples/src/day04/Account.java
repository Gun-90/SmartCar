package day04;

public class Account {
	//member variable
	private String number;
	
	public Account() {
		System.out.println("Account() ����");
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
	 * �Աݱ��
	 * @author �̰ǿ�
	 * @since 2018.8.22
	 * @param money �Աݾ�
	 */
	//�Աݱ��
	public void input(int money) {
		System.out.println("�Ա���: " + this.money);
		this.money += money;
		System.out.printf("�Ա���: %d%n", this.money);
		
	}
	/**
	 * ��� ���
	 * @author �̰ǿ�
	 * @since 2018.8.22
	 * @param money
	 */
	
	//��ݱ��
	public void output(int money) {
		System.out.println("������: " + this.money);
		this.money -= money;
		System.out.printf("������: %d%n", this.money);
		
	}
	//������±��
	public void print() {
		System.out.printf("[���¹�ȣ:%s (%s) %d�� ] %n", number, name, money);
	}
	
}
