package day07;

public class Exception03 {
	
	// 원래 이렇게 하면 자바 가상머신에게 익셉션을 처리해달라고 하는것과 같다 ( 사용하면 안되는 코드 )
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("start");
		
		Thread.sleep(5000);
		
		System.out.println("end");
		
	}

}
