package day06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Animal a = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÀÔ·ÂÇÏ¼¼¿ä");
		System.out.println("d ¶Ç´Â f");
		String read = sc.nextLine();
		
		if(read.equals("d")) {
			a = new Dog("Áøµ¾°³","ÂÐÂÐ");
		}
		if(read.equals("f")) {
			a = new Fish("ÄíÇÇ");
		}
		
		a.breath();
		
		Animal[] animals = new Animal[3];
		
	}
}
