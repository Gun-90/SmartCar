package day07;

public class Test02 {
	public static void main(String[] args) {
		Employee<String, String> emp1 = new Employee("홍길동", "001");
		System.out.println(emp1);
		
		Employee<String, Integer> emp2 = new Employee("고길동", 20);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("고길동", 20);
		if(emp3.name instanceof String)
			System.out.println(((String)emp3.name).charAt(0)+"**");
	}
}

// 런타임시 V, T가 무었인지 알려준다는 표시
class Employee<V,T>{
	V name;
	T number;
	
	public Employee() {}
	
	public Employee(V name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	
	public V getName() {
		return name;
	}

	public void setName(V name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
	
}
