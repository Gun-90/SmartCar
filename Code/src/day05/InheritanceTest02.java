package day05;

public class InheritanceTest02 {
	public static void main(String[] args) {
		new Dog();
		
		// Object는 모든 오브젝트의 부모 클래스로 모든 객체를 담을 수 있다.
		Object obj = new Dog();
		
		// Dog으로 Down casting
		((Dog)obj).print();
		Dog d = (Dog)obj;
		d.breath();
		
		
		//
		Object obj2 = new String("~~~~");
		// 아래 코드는 오류 표시가 뜨지 않으나 컴파일시 오류가 남 - 캐스팅시 주의해서 사용해야함
		((Dog)obj2).print();
		
		Object obj3 = new String("~~~~");
		
		// obj3가 Dog클래스의 자식인스턴스 일때만 실행
		if(obj3 instanceof Dog)
		{
			((Dog)obj3).print();
			Dog d2 = (Dog)obj3;
			d2.breath();
		}
		if(obj3 instanceof String) {
			String s = (String)obj;
			System.out.println(s.length());
		}
		
		
		
		
		
	}

}
