package day02;

public class Work4 {
	public static void main(String[] args) {
		double score = 0;
		String Class = "";
		
		int A = 50;
		int B = 40;
		int C = 80;
		int D = 90;
		int E = 75;
		score = (A+B)/2*60/100+(C+D)/2*20/100+(E*20/100);
		if((score>=90) && (score <= 100)){
			Class ="Gold Class";
		}else if((score>=80) && (score < 90)){
			Class ="Silver Class";
		}else if((score>=70) && (score < 80)){
			Class ="Bronze Class";
		}else{
			Class ="Normal Class";
		}
		
		System.out.printf("평가점수: %f\n", score);

		System.out.printf("Class: %s", Class);
	}
}
