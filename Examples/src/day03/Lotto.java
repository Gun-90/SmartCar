package day03;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int luckyNumber[] = new int[6];
		
		int selectNum[] = new int[6];
		for(int i=0; i<6; i++) {
			System.out.println( i+1 + "번째 숫자를 입력하세요");
			selectNum[i]= sc.nextInt();
		}
		
		// 당청번호 생성
		for(int i=0;i<6;i++){
			luckyNumber[i] = r.nextInt(45) + 1;
			for(int j=0;j<i;j++) {
				if(luckyNumber[i]==luckyNumber[j]) {
					i--;
					break;
				}
				
			}
		}
		System.out.printf("내 번호  ");
		for(int i=0;i<6;i++) {
			System.out.printf("\t%d ",selectNum[i]);
		}
		System.out.printf("\n당첨번호  ");
		for(int i=0;i<6;i++) {
			System.out.printf("\t%d ",luckyNumber[i]);
		}
		
		
		
		// 등수 체크
		int score = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(selectNum[i] == luckyNumber[j]) {
					score += 1;
					
				}
						
			}
		
		}
		
		//당첨금 생성 10000 ~ 10000000000
		long a = r.nextInt(100000);
		long chA = a*100000 + r.nextInt(99999 - 10000 + 1) + 10000;
		System.out.println("\n");
		switch(score){
			case 6 :{ System.out.println("1등 " + a*50/100+"원 당첨!");} break;
			case 5 :{ System.out.println("2등 " + a*30/100+"원 당첨!");} break;
			case 4 :{ System.out.println("3등 " + a*10/100+"원 당첨!");} break;
			case 3 :{ System.out.println("4등 " + a*5/100+"원 당첨!");} break;
			case 2 :{ System.out.println("5등 " + a*2/100+"원 당첨!");} break;
			default :{ System.out.println("꽝");} break;
			
			
		}
		

	}

}
