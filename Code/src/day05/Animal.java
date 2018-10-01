package day05;

public class Animal {
	
	String kind = "동물의종류";
	public Animal() {
		super();
		System.out.println("animal instance 생성");
	}


	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	

	
	
	
	public void breath() {
		System.out.println("페로 숨을쉼");
		
	}
	public void print() {
		
	}
}
