package day06;

public class Fish extends Animal{
	String name;
	
	public Fish() {
		super("������");
	}
	
	public Fish(String name) {
		super("������");
		this.name = name;
	}

	public void print() {
		// kind��
		System.out.printf("Fish[%s, %s]%n", this.kind, name);
	}
	
	// �������̵� ������̼��� �������̵��� �ߵ̳� Ȯ������ - �߸��Ǹ� ������ �����
	@Override
	public void breath() {
		System.out.println("�ư���~~~");
	}

}
