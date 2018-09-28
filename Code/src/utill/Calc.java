package utill;

public class Calc {
	// 항상 같은  나오므로 공유자원의 개념이 크다
	public static int add(int a, int b) {
		return a+b;
		
	}
	// 오버로딩
	public static double add(double a, double b) {
		return a+b;
		
	}
	
	// ...은 가변인자
	public static int add(int ... a) {
		// 향상된 for 문
		int sum = 0;
		for(int data :a) {
			sum += data;
		}
		return sum;
			
		
	}
	public static int multi(int a, int b) {
		return a*b;
	}
	

}
