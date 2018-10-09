package day06.inner;

public class Test05 {
	public static void main(String[] args) {
		
		Command insert = new Command() {
			
			@Override
			public void exec() {
				System.out.println("insert~~~");
				
			}
		};
		
		Command delete = new Command() {
			
			@Override
			public void exec() {
				System.out.println("update~~~");
				
			}
		};
		
		
		System.out.println("���ϴ� �۾��� �����ϼ���");
		System.out.println("1. insert");
		System.out.println("2. delete");
		System.out.println("3. update");
		System.out.println("4. ����");
		
		insert.exec();
		
		
		// insert, delete �� ���ε� ��ų�� �ִ�
		Command cmd = delete;
		cmd.exec();
		
		
	}

}

interface Command{
	void exec();
}