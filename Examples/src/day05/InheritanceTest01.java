package day05;

public class InheritanceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Animal 인스턴스 생성 자식 인스턴스인 Dog로 접근 불가
		Animal a = new Animal();
		a.breath();
		System.out.println(a.kind);
		
		// Dog인스턴스생성시  부모인스턴스인 Animal 둘다 생성됨 
		// Animal instance 생성이라는 구문이 출력되는것으로 확인할수있음
		Dog d = new Dog();
		
		d.breath();
		System.out.println(d.kind);
		
		// 부모 형태로 형변환
		System.out.println(((Animal)(d)).kind);
		
		d.print();
		
		
		// temporary 객체 
		new Dog();
		
		// d2의 데이터 타입은 Dog도 될수 있고 Animal도 될수 있다 is a 관계
		Dog d2 =new Dog();
		
		

	}

}
