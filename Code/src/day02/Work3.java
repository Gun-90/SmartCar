package day02;

import java.util.Random;

public class Work3 {
	public static void main(String[] args) {
		//100 ~ 10000000000
			   //9999999999
		Random random = new Random();
		long a = random.nextInt(10000000);
		long chA = a*1000 + random.nextInt(999 - 100 + 1) + 100;
		long b = random.nextInt(10000000);
		long chB = b*1000 + random.nextInt(999 - 100 + 1) + 100;
		long result = chA+chB;
		System.out.println(result);
		if(result % 2 ==0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
	    
	}
}
