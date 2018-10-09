package day03;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 1을 입력하세요");
		int a = sc.nextInt();
		
		System.out.println("숫자를 2를 입력하세요");
		int b = sc.nextInt();
		
		// 두수의 최대 값을 구하시오
		
		if(a > b) {
			System.out.println("첫번째 숫자가 더 큽니다");
			
		}else if(a<b) {
			System.out.println("두번째 숫자가 더 큽니다");
		}else {
			System.out.println("두숫자는 같습니다");
		}
		
//		System.out.println("input Data.." + a);
		sc.close();
		
		

	}

}
