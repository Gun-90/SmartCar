package op;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 32bit 영역에 40억이 들어가서 -294967296이 출력됨
		int a = 2000000000;
		int b = 2000000000;
		long result = (long) (a + b);
		long result2 = (long)a + b;
		
		System.out.println(result);
		System.out.println(result2);
		
		int c = 5;
		int d = 2;
		
		int result3 = c % d;
		System.out.println(result3);
		

	}

}
