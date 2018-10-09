package day03;

import java.util.Random;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int [6];
		Random r = new Random();
		for(int i = 0;i<6;i++) {
			nums[i] = r.nextInt(45)+1;
			
		}
		
		for(int a:nums) {
			System.out.println(a);
		}

	}

}
