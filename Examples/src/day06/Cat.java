package day06;


public class Cat extends day05.Animal {
	String name;
	@Override
	public void print() {
		
		// �Ʒ� ���� �ڵ�� kind�� �ҷ����� ���Ѵ� kind���������ڸ� ��������ʾ�  
		// default(���� ��Ű�������� �ҷ��ü�����)�̱� ������ animal�� kind�� public���� �ٲ������
		System.out.println(kind+", "+name);
		
	}
}
