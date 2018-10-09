package day02;

public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 100점이면	A
		// 90점이면 	B
		// 80점이면 	C
		// 70점이면 	D
		
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
