package day02;

import java.util.Random;

public class Op1 {
	public static void main(String[] args) {
		double d1 = 1.44;
		double d2 = 1.7;
		int result = (int)d1 + (int)d2;
		System.out.println(result);
		
		// 반올림
		int result2 = (int)Math.round( d1 + d2 );
		System.out.println(result2);
		
		// random
		// 0.0 <= x < 1.0
		// 1 ~ 10 난수를 발생 시키시오
		double r1 = Math.random();
		System.out.println(r1);
		
		double r2 = Math.random() * 10;
		System.out.println((int)(r2)+1);
		
		Random random = new Random();
		int r3 = random.nextInt();
		System.out.println(r3);

	}
}
