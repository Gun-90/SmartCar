package day06;

public class Dog extends Animal {
	String kind = "����������";
	String name;
	public Dog() {
		// �����Ǿ� ����
		super();
		
	}
	public Dog(String kind) {
		this.kind = kind;
	}

	public Dog(String kind, String name) {
		super();
		
		// super("��������"); 
		super.kind = "��������";
		
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		// kind�� �տ� this.�����Ǿ� ����
		// super.�� ���̸� �θ��� �ʵ�� ���ٰ���
		System.out.printf("%s, %s, %s, %n",kind, super.kind,name);
	}
	@Override
	public void breath() {
		System.out.println("�� ~~~~����");
	}

}
