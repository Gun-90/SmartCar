package day05;

public class InheritanceTest02 {
	public static void main(String[] args) {
		new Dog();
		
		// Object�� ��� ������Ʈ�� �θ� Ŭ������ ��� ��ü�� ���� �� �ִ�.
		Object obj = new Dog();
		
		// Dog���� Down casting
		((Dog)obj).print();
		Dog d = (Dog)obj;
		d.breath();
		
		
		//
		Object obj2 = new String("~~~~");
		// �Ʒ� �ڵ�� ���� ǥ�ð� ���� ������ �����Ͻ� ������ �� - ĳ���ý� �����ؼ� ����ؾ���
		((Dog)obj2).print();
		
		Object obj3 = new String("~~~~");
		
		// obj3�� DogŬ������ �ڽ��ν��Ͻ� �϶��� ����
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
