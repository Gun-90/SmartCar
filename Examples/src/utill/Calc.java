package utill;

public class Calc {
	// �׻� ����  �����Ƿ� �����ڿ��� ������ ũ��
	public static int add(int a, int b) {
		return a+b;
		
	}
	// �����ε�
	public static double add(double a, double b) {
		return a+b;
		
	}
	
	// ...�� ��������
	public static int add(int ... a) {
		// ���� for ��
		int sum = 0;
		for(int data :a) {
			sum += data;
		}
		return sum;
			
		
	}
	public static int multi(int a, int b) {
		return a*b;
	}
	

}
