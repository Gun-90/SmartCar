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
			System.out.println( i+1 + "��° ���ڸ� �Է��ϼ���");
			selectNum[i]= sc.nextInt();
		}
		
		// ��û��ȣ ����
		for(int i=0;i<6;i++){
			luckyNumber[i] = r.nextInt(45) + 1;
			for(int j=0;j<i;j++) {
				if(luckyNumber[i]==luckyNumber[j]) {
					i--;
					break;
				}
				
			}
		}
		System.out.printf("�� ��ȣ  ");
		for(int i=0;i<6;i++) {
			System.out.printf("\t%d ",selectNum[i]);
		}
		System.out.printf("\n��÷��ȣ  ");
		for(int i=0;i<6;i++) {
			System.out.printf("\t%d ",luckyNumber[i]);
		}
		
		
		
		// ��� üũ
		int score = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(selectNum[i] == luckyNumber[j]) {
					score += 1;
					
				}
						
			}
		
		}
		
		//��÷�� ���� 10000 ~ 10000000000
		long a = r.nextInt(100000);
		long chA = a*100000 + r.nextInt(99999 - 10000 + 1) + 10000;
		System.out.println("\n");
		switch(score){
			case 6 :{ System.out.println("1�� " + a*50/100+"�� ��÷!");} break;
			case 5 :{ System.out.println("2�� " + a*30/100+"�� ��÷!");} break;
			case 4 :{ System.out.println("3�� " + a*10/100+"�� ��÷!");} break;
			case 3 :{ System.out.println("4�� " + a*5/100+"�� ��÷!");} break;
			case 2 :{ System.out.println("5�� " + a*2/100+"�� ��÷!");} break;
			default :{ System.out.println("��");} break;
			
			
		}
		

	}

}
