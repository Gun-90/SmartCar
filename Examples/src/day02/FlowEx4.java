package day02;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90�ʰ� 100���� A
		// 80�ʰ� 90���� B
		// 70�ʰ� 80���� C
		// 60�ʰ� 70���� D
		// 60���� F
		int a = 65;
		String result = "";
		
		if((90 < a)&&(a <= 100)) {
			result = "A";
		}else if((80 < a)&&(a <= 90)){
			result = "B";
		}else if((70 < a)&&(a <= 80)){
			result = "C";
		}else if((60 < a)&&(a <= 70)){
			result = "D";
		}else {
			result = "F";
		}
		System.out.println(result);
	}

}
