package day04;

public class Var {
	// new 하지 않는이상 불러올수없음 - 인스턴스 자원
	String name;
	// static은 new 하지 않아도 불러올수 있음 - 공유개념이 큰 자원
	static int number = 99;
	
	private boolean check;
	
	// boolean 타입은 get set 메소드가 is set으로 쓰임.
	public boolean isCheck() {
		return check;
	}


	public void setCheck(boolean check) {
		this.check = check;
	}


	public void print() {
		//로컬 variable은 반드시 초기화를 시켜야함
		//member variable은 초기화 시키지 않아도됨
		int n = 0;
		System.out.println(name);
		System.out.println(n);
	}
}
