package day07;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		// ���� �߻� temporary ��ü
		//throw new Exception("���� �߻�"); //checked exception
		try {
			if(msg.length()==0)throw new IOException("���� �߻�"); //unchecked exception
			// �����߻��� catch ������ �� �Ʒ� ����� ���� ���� ����
			System.out.println("*********************");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}finally {// finally ���� ������ �����
			System.out.println("�ڿ� �ݳ� ~~~");
		}
		
		System.out.println("===== End ====");

	}

}
