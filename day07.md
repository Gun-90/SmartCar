### 예외처리

모든 Exception 최상위 클래스인 Exception을이용해서 예외를 잡을수도 있지만

보통 예상되는 모든 익셉션들을 나열한다.

```java
package day07;

import java.io.IOException;
import org.omg.Messaging.SyncScopeHelper;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		// 문제 발생 temporary 객체
		//throw new Exception("문제 발생"); //checked exception
		try {
			if(msg.length()==0)throw new IOException("문제 발생"); //unchecked exception
			// 문제발생시 catch 블럭으러 감 아래 명령이 실행 되지 않음
			System.out.println("*********************");
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		
        // finally 블럭은 무조건 실행됨
		}finally {
			System.out.println("자원 반납 ~~~");
		}
		
		System.out.println("===== End ====");

	}
}
```



### 제너릭

- 타입에 대해 명시하지 않으면 Object type이라고 인식
- 기본 타입은 적용되지않음(int -> inteager)

```java
package day07;

public class Test02 {
	public static void main(String[] args) {
		Employee<String, String> emp1 = new Employee("홍길동", "001");
		System.out.println(emp1);
		
		Employee<String, Integer> emp2 = new Employee("고길동", 20);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("고길동", 20);
		System.out.println(emp3);
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
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}
}
```



### 컬렉션 프레임워크
데이터를 모아서 관리할경우 배열을 쓴다.
배열의 관리, 데이터 집합 관리(insert, delete, 순서조정, 빈 배열 없애기등....)

- set 과 List는 어느정도 호환가능
- Collection -> 객체의 집합
- Collection 인터페이스의 구성
  - Set 중복불허 순서 없이 객체 삽입
    - HashSet
    - TreeSet
  - List(sequence) 시작과 끝을 가진 선형 구조
    - Vector
    - Stack
    - linkedList
    - ArrayList)
  - Map key와 Value 쌍으로 이루어진 객체 
    - Hashtable

![1004-0](C:\Workspace\SmartCar\image\1004-0.png)





### ArrayList

- 배열 관리 
  - 크기조정
- 중복허용

```java
package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		// ArrayList는 배열을 관리하는 메소드
		List list = new ArrayList<>();
		list.add("홍기동");
		list.add("123");
		list.add("김길동");
		list.add("A");
		list.add(new Account());
		
		// list2에는 String만 들어갈수 있음
		List<String> list2 = new ArrayList<>();
		list2.add("홍기동");
		list2.add("박길동");
		list2.add("박길동");
		list2.add("김길동");
		System.out.println(list2);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).charAt(0)+"**");
			
			
		}
		// 길동이란 사람이 포함되어 있는지
		System.out.println(list2.contains("길동"));
		
		// 왜안되냐
		list2.remove(0);
		System.out.println(list2);
		
		// list2 배열 클리어
		list2.clear();
		System.out.println(list2);
		
		List list3 = new Vector();
		System.out.println("--------set---------");
		Set<String> set = new HashSet<String>();
		set.add("홍기동");
		set.add("박길동");
		set.add("박길동");
		set.add("김길동");
		System.out.println(set);
		
		for(String data :set) {
			System.out.println("**"+data.charAt(data.length()-1));
		}
		
		System.out.println("TreeSet");
		// TreeSet은 자동정렬 해줌
		Set<String> set2 = new TreeSet<String>();
		set.add("홍기동");
		set.add("박길동");
		set.add("박길동");
		set.add("김길동");
		System.out.println(set2);
		
		for(String data :set2) {
			System.out.println("**"+data.charAt(data.length()-1));
		}
	}
}
```



### Iterator

- 컬렉션에 저장된 각 요소에 접근하는 기능을 가짐



자원반납

자원 반납을 하지않으면 lock이 걸려 다른사람이 쓸수 없음.