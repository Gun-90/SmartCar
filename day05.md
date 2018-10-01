# 상속

- 필드 값을 찾을시 자식 클래스에서 상위클래스 찾는다.
- 모든 객체의 Data Type은 부모가 될수 있다.
- java의 모든 객체는 java.lang.Object를 상속받는다

Animal class

```java
package day05;

public class Animal {
	
	String kind = "동물의종류";
	public Animal() {
		super();
		System.out.println("animal instance 생성");
	}
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	
	public void breath() {
		System.out.println("페로 숨을쉼");
	}
}


```
Dog class

```java
package day05;

public class Dog extends Animal {
	String kind = "강아지종류";
	String name;
	public Dog() {
		// super();생략되어 있음 
		
	}
	public Dog(String kind) {
		this.kind = kind;
	}

	public Dog(String kind, String name) {
		super();
		// super("강아지과"); 
		super.kind = "강아지과";
		
		this.kind = kind;
		this.name = name;
	}
	public void print() {
		// kind시 앞에 this.생략되어 있음
		// super.를 붙이면 부모의 필드로 접근가능
		System.out.printf("%s, %s, %s, %n",kind, super.kind,name);
	}

}
```

InheritanceTest02

```java
package day05;

public class InheritanceTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Animal 인스턴스 생성 자식 인스턴스인 Dog로 접근 불가
		Animal a = new Animal();
		a.breath();
		System.out.println(a.kind);
		
		// Dog인스턴스생성시  부모인스턴스인 Animal 둘다 생성됨 
		// Animal instance 생성이라는 구문이 출력되는것으로 확인할수있음
		Dog d = new Dog();
		
		d.breath();
		System.out.println(d.kind);
		
		// 부모 형태로 형변환
		System.out.println(((Animal)(d)).kind);
		
		d.print();
		
		// temporary 객체 
		new Dog();
		
		// d2의 데이터 타입은 Dog도 될수 있고 Animal도 될수 있다 is-a 관계
		Dog d2 =new Dog();
	}
}

```

InheritanceTest02

```java
package day05;

public class InheritanceTest02 {
	public static void main(String[] args) {
		new Dog();
		
		// Object는 모든 오브젝트의 부모 클래스로 모든 객체를 담을 수 있다.
		Object obj = new Dog();
		
		// Dog으로 Down casting
		((Dog)obj).print();
		Dog d = (Dog)obj;
		d.breath();
		
		//
		Object obj2 = new String("~~~~");
		// 아래 코드는 컴파일전 오류 표시가 뜨지 않으나 컴파일시 오류가 남
        // 캐스팅시 주의해서 사용해야함
		((Dog)obj2).print();
		
		Object obj3 = new String("~~~~");
		
		// obj3가 Dog클래스의 자식인스턴스 일때만 실행
		if(obj3 instanceof Dog) {
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

```

InheritanceTest03

```java
package day05;

public class InheritanceTest03 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.print();
		
		Dog d2 = new Dog("진돗개", "쫑쫑");
		d2.print();
	}
}
```



d.name 자식 클래스부터 찾는다.

super.kind()와 this.kind()는 서로 다름 (둘은 힙영역에서만 사용가능)



d = Dog타입 일때

((animal)d).kind 하면 부모영역부터 찾음(upcasting)

Animal d = new Animal();  - 부모 객체를 생성하면 자식객체로 접근불가

Dog d = new Dog(); - 자식 객체에선 부모객체 접근 가능







## 생성자란?

- 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
- 리턴타입이 없다
- 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
- first statement? 가뭐야



### 클래스간의 관계

상속 관계 : is a 관계

포함 관계 : has a 관계



## 오버라이딩

상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것을 오버라이딩이라고 한다.



부모타입의 이점

- 오버라이딩한다면 부모영역에서 액세스할수없는 영역을 액세스 할수 있음

- 다운캐스팅 하지 않아도 메소드를 사용할수 있게 해줌





