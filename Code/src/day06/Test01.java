package day06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Animal a = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��ϼ���");
		System.out.println("d �Ǵ� f");
		String read = sc.nextLine();
		
		if(read.equals("d")) {
			a = new Dog("������","����");
		}
		if(read.equals("f")) {
			a = new Fish("����");
		}
		
		a.breath();
		
		Animal[] animals = new Animal[3];
		
	}
}
