package day06;

public class Fish extends Animal{
	String name;
	
	public Fish() {
		super("물고기과");
	}
	
	public Fish(String name) {
		super("물고기과");
		this.name = name;
	}

	public void print() {
		// kind를
		System.out.printf("Fish[%s, %s]%n", this.kind, name);
	}
	
	// 오버라이딩 어노테이션은 오버라이딩이 잘됫나 확인해줌 - 잘못되면 오류를 띄워줌
	@Override
	public void breath() {
		System.out.println("아가미~~~");
	}

}
