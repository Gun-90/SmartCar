package day05;

public class InheritanceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Animal �ν��Ͻ� ���� �ڽ� �ν��Ͻ��� Dog�� ���� �Ұ�
		Animal a = new Animal();
		a.breath();
		System.out.println(a.kind);
		
		// Dog�ν��Ͻ�������  �θ��ν��Ͻ��� Animal �Ѵ� ������ 
		// Animal instance �����̶�� ������ ��µǴ°����� Ȯ���Ҽ�����
		Dog d = new Dog();
		
		d.breath();
		System.out.println(d.kind);
		
		// �θ� ���·� ����ȯ
		System.out.println(((Animal)(d)).kind);
		
		d.print();
		
		
		// temporary ��ü 
		new Dog();
		
		// d2�� ������ Ÿ���� Dog�� �ɼ� �ְ� Animal�� �ɼ� �ִ� is a ����
		Dog d2 =new Dog();
		
		

	}

}
