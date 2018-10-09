package day07;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		// 문제 발생 temporary 객체
		//throw new Exception("문제 발생"); //checked exception
		try {
			if(msg.length()==0)throw new IOException("문제 발생"); //unchecked exception
			// 문제발생시 catch 블럭으러 감 아래 명령이 실행 되지 않음
			System.out.println("*********************");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}finally {// finally 블럭은 무조건 실행됨
			System.out.println("자원 반납 ~~~");
		}
		
		System.out.println("===== End ====");

	}

}
