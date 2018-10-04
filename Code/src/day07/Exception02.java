package day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(new File("sample.txt"));// ���⼭ ������ ����� catch �������ΰ�
			System.out.println("���Ϸ� ���� READ");
			
			// ���������� �ִµ��� ���Ϸ��� ����
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("sample.txt ���� Ȯ���ϼ���");
			
		}finally{
			if(sc != null)sc.close();// sample.txt ������ ���°�� ���ڵ忡�� ������Ʈ �ͼ��� �߻� 
		}
		System.out.println("End");
	}

}
