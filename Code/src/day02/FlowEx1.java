package day02;

public class FlowEx1 {
	public static void main(String[] args) {
		//�Է� ���� �μ��� ����
		//��� ¦���̸� OK
		//�ƴϸ� FAIL�� ��� �Ͻÿ�
		
		int i = 10;
		int j = 10;
		String result = "";
		if((i%2 == 0) && ( j%2 == 0)) {
			result = "OK";
			
		}else {
			result = "FAIL";
			
		}
		System.out.println("���:" + result);
	}

}
