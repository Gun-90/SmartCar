package day06.inner;

public class Test03 {
	public static void main(String[] args) {
		A a = new A();
		A.B b = new A().new B();
		b.print();
		
		
	}
}
//----------
class A{
	String name = "A";
	class B{
		void print() {
			System.out.println(name);
		}
	}
	
}

