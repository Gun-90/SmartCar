package day06;

public class Dog extends Animal {
	String kind = "강아지종류";
	String name;
	public Dog() {
		// 생략되어 있음
		super();
		
	}
	public Dog(String kind) {
		this.kind = kind;
	}

	public Dog(String kind, String name) {
		super();
		
		// super("강아지과"); 
		super.kind = "강아지과";
		
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		// kind시 앞에 this.생략되어 있음
		// super.를 붙이면 부모의 필드로 접근가능
		System.out.printf("%s, %s, %s, %n",kind, super.kind,name);
	}
	@Override
	public void breath() {
		System.out.println("폐 ~~~~동작");
	}

}
