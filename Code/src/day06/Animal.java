package day06;

public abstract class Animal {
	protected String kind = "����������";
	public Animal() {
		super();
		//System.out.println("animal instance ����");
	}


	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	public abstract void breath();
	public void print() {	}
	
}
