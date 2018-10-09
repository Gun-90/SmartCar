package day06;

public abstract class Animal {
	protected String kind = "동물의종류";
	public Animal() {
		super();
		//System.out.println("animal instance 생성");
	}


	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	public abstract void breath();
	public void print() {	}
	
}
