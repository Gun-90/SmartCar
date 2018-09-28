package day04;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v = new Var();
		
		//static variable은 인스턴스 명으로 접근 가능하지만 클래스 네임으로 접근 하는게 좋다.
		System.out.println(Var.number);
		System.out.println(v.name);
	}

}
