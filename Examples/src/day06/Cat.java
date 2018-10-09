package day06;


public class Cat extends day05.Animal {
	String name;
	@Override
	public void print() {
		
		// 아래 같은 코드는 kind를 불러오지 못한다 kind접근지정자를 명시하지않아  
		// default(같은 패키지에서만 불러올수있음)이기 때문에 animal의 kind를 public으로 바꿔줘야함
		System.out.println(kind+", "+name);
		
	}
}
