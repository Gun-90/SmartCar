package day03;

import java.util.Scanner;
import java.util.Random;

public class Forex2 {

	public static void main(String[] args) {
		// ������ �Է� �޴´�.
//		������ ���� 10~100 ������ ����
//		���� �������� �Ѿ�� ���α׷� ����
//		�Է� ���� ���ڱ������� ������ �߻� ��Ų��.
//		���� ������ �հ� �������Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10 ~ 100�� ������ �Է��ϼ���");
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
