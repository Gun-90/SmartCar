package day06;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class ExcetionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------main start------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/점수/점수/점수 입력하세요");
		System.out.println("예) 홍길동/99/66/77");

		
		String data =sc.nextLine();
		if(data.length()==0){
			System.out.println("정확한 데이터를 입력해주세요");
			return;
		}
		String[] d = data.split("/");
		int sum = 0;
		
		try {
			for(int i=1;i<d.length;i++) {
				//parseInt => int로 변환 // trim() => 공백 제거
				sum += Integer.parseInt(d[i].trim());
			}
		}catch(NumberFormatException e) {
			System.out.println("점수를 제대로 입력하세요");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		double avg = sum/3.;
		System.out.printf("학생명 %s : 평균 %5.2f %n",d[0],avg);
		
		System.out.println("---------main end---------");

	}

}
