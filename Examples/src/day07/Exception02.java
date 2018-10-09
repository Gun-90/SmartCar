package day07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(new File("sample.txt"));// 여기서 문제가 생기면 catch 구문으로감
			System.out.println("파일로 부터 READ");
			
			// 라인정보가 있는동안 와일루프 실행
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("sample.txt 파일 확인하세요");
			
		}finally{
			if(sc != null)sc.close();// sample.txt 파일이 없는경우 이코드에서 널포인트 익셉션 발생 
		}
		System.out.println("End");
	}

}
