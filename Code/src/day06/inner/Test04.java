package day06.inner;

import day06.Animal;

public class Test04 {
	public static void main(String[] args) {
		// ���̳ʽ� Ŭ���� (�̸����� Ŭ����) ���
		Animal a= new Animal() {

			@Override
			public void breath() {
				// TODO Auto-generated method stub
				System.out.println("�ư��̷� ����~~~~");
			
			} 
			
		};
		a.breath();
	}

}

class Dog extends Animal{
	@Override
	public void breath() {
		System.out.println("~~~~����");
	}
}