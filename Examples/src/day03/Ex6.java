package day03;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 1�� �Է��ϼ���");
		int a = sc.nextInt();
		
		System.out.println("���ڸ� 2�� �Է��ϼ���");
		int b = sc.nextInt();
		
		// �μ��� �ִ� ���� ���Ͻÿ�
		
		if(a > b) {
			System.out.println("ù��° ���ڰ� �� Ů�ϴ�");
			
		}else if(a<b) {
			System.out.println("�ι�° ���ڰ� �� Ů�ϴ�");
		}else {
			System.out.println("�μ��ڴ� �����ϴ�");
		}
		
//		System.out.println("input Data.." + a);
		sc.close();
		
		

	}

}
