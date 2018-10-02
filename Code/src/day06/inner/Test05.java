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
		
		
		System.out.println("원하는 작업을 선택하세요");
		System.out.println("1. insert");
		System.out.println("2. delete");
		System.out.println("3. update");
		System.out.println("4. 종료");
		
		insert.exec();
		
		
		// insert, delete 를 바인딩 시킬수 있다
		Command cmd = delete;
		cmd.exec();
		
		
	}

}

interface Command{
	void exec();
}