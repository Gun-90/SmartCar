package day04;

public class Var {
	// new ���� �ʴ��̻� �ҷ��ü����� - �ν��Ͻ� �ڿ�
	String name;
	// static�� new ���� �ʾƵ� �ҷ��ü� ���� - ���������� ū �ڿ�
	static int number = 99;
	
	private boolean check;
	
	// boolean Ÿ���� get set �޼ҵ尡 is set���� ����.
	public boolean isCheck() {
		return check;
	}


	public void setCheck(boolean check) {
		this.check = check;
	}


	public void print() {
		//���� variable�� �ݵ�� �ʱ�ȭ�� ���Ѿ���
		//member variable�� �ʱ�ȭ ��Ű�� �ʾƵ���
		int n = 0;
		System.out.println(name);
		System.out.println(n);
	}
}
