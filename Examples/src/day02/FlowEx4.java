package day02;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90초과 100이하 A
		// 80초과 90이하 B
		// 70초과 80이하 C
		// 60초과 70이하 D
		// 60이하 F
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
