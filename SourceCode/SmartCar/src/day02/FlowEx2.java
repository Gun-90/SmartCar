package day02;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100���̸�	A
		// 90���̸� 	B
		// 80���̸� 	C
		// 70���̸� 	D
		
		int score = 90;
		String result = "";
		if(score == 100) {
			result = "A";
		}else if(score == 90){
			result = "B";
		}else if(score == 80){
			result = "C";
		}else{
			result = "D";
			
		}
		System.out.println(result);
	}

}
