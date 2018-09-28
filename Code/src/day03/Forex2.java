package day03;

import java.util.Scanner;
import java.util.Random;

public class Forex2 {

	public static void main(String[] args) {
		// 정수를 입력 받는다.
//		정수의 범위 10~100 까지의 정수
//		만약 범위에서 넘어가면 프로그램 종료
//		입력 받은 숫자까지에서 난수를 발생 시킨다.
//		난수 까지의 합과 평군을구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10 ~ 100의 정수를 입력하세요");
		int num = sc.nextInt();
		
		Random rd = new Random();
		
		num = rd.nextInt(num);
		System.out.println(num);
		int i=0 ,sum =0;
		while(i<num+1) {
			i++;
			sum += i;
		}
		double average = sum / num;
		System.out.println(sum);
		System.out.println(average);
		sc.close();
		
	}

}
