package day06.inner;

import day06.Animal;

public class Test04 {
	public static void main(String[] args) {
		// 어노미너스 클래스 (이름없는 클래스) 사용
		Animal a= new Animal() {

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("아가미로 동작~~~~");
			
			} 
			
		};
		a.breath();
	}

}

class Dog extends Animal{
	@Override
	public void breath() {
		System.out.println("~~~~동작");
	}
}