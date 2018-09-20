package day02;

public class FlowEx1 {
	public static void main(String[] args) {
		//입력 받은 두수의 값이
		//모두 짝수이면 OK
		//아니면 FAIL을 출력 하시오
		
		int i = 10;
		int j = 10;
		String result = "";
		if((i%2 == 0) && ( j%2 == 0)) {
			result = "OK";
			
		}else {
			result = "FAIL";
			
		}
		System.out.println("결과:" + result);
	}

}
