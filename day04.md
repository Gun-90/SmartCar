### 스트링 버퍼의 사용
```java
package day04;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		msg = msg+'a';
		msg = msg+'b';
		msg = msg+'c';
		System.out.println(msg);
	}

}

```

위 같은 코드는 스트링 객체가 여러개 생성되어 성능저하의 원인이 된다. 

따라서 스트링 버퍼를 생성하여 생성하면 이같은 문제의 원인을 해결할 수 있다.

```java
package day04;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "";
		StringBuffer sb = new StringBuffer();
//		msg = msg+'a';
//		msg = msg+'b';
//		msg = msg+'c';
		sb.append('a');
		sb.append('b');
		sb.append('c');
		msg = sb.toString();
		System.out.println(msg);

	}

}

```

스트링객체는 immutable객체(불변이다) 한번 메모리에 올라가면 변경할수 없다.



# 클래스와 객체의 이해

class : 사물 개념을 기술하는 단위 

variable (특성) + method(기능)



객체(object) = instance

프로그램에서 사용하기 위해

어떤 클래스 속성을 갖는 것을 하나 만든것



접근제한자

public, private ...

public class에서public을 빼면 같은 패키지 내에서만 부를 수 있다.



리턴타입

void,  여러 데이터타입

접근지정자

메소드명은 낙타표기법으로 사용



접근지정자 리턴타입 메소드명() {}

ex)

public void account(){}

Ex01.java

```java
package day04;

public class Account {
	//member variable
	String number;
	String name;
	int money;
	
	//입금기능
	
	//출금기능
	
	//정보출력기능
	public void print() {
		System.out.printf("[계좌번호:%s (%s) %d원 ] %n", number, name, money);
	}
	
}

```

Account.java

```java
package day04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.print();
		
		Account a2 = new Account();
		a2.number = "2018-001";
		a2.name = "홍길동";
		a2.money = 7000;
		a2.print();

	}

}

```
![그림1](C:\Users\casio\OneDrive\사진\그림1.png)



인스턴스 variable은 new를해야함
static variable은 new 필요없음



### 캡슐화(Data hidden)



```java
package day04;

public class Account {
	//member variable
    //private은 같은 클래스에서만 접근 가능하다.
	private String number;
	private String name;
	private int money;
	
	//입금기능
	
	//출금기능
	
	//정보출력기능
	public void print() {
		System.out.printf("[계좌번호:%s (%s) %d원 ] %n", number, name, money);
	}
	
}

```



### get, set 메소드 설명

* 이클립스툴에서 생성

* > Source → generate Getters and Setters

```java
package day04;

public class Account {
	// member variable
	private String number;
	// get은 리턴타입 필요
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
        // return; 생략되어 있음
	}

	private String name;
	private int money;
	
	public void setMoney(int money){
		
		if(money<0) return;
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
		return this.name;
	}
	
	// 입금기능
	public void input(int money) {
		System.out.println("입금전: " + this.money);
		this.money += money;
		System.out.printf("입금후: %d%n", this.money);
		
	}
	
	
	// 출금기능
	public void output(int money) {
		System.out.println("인출전: " + this.money);
		this.money -= money;
		System.out.printf("인출후: %d%n", this.money);
		
	}
	// 정보출력기능
	public void print() {
		System.out.printf("[계좌번호:%s (%s) %d원 ] %n", number, name, money);
	}
	
}

```


```java
package day04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.print();
		
		Account a2 = new Account();
		a2.setNumber("2018-001");
		a2.setName("홍길동");
		a2.setMoney(-7000);
		a2.print();
		
		//누구나 접근 가능하다.
		System.out.println(a2.getMoney());
	}
}
```





상속

- java에서는 단일상속

메시지

- 객체간에 서로 통신

다형성

- overloading

- overriding

클래스와 객체의 정의와 용도

- 클래스의 정의 - 클래스란 객체를 정의해 놓은 것이다.

- 클래스의 용도 - 클래스는 객체를 생성하는데 사용된다.

- 객체의 정의 - 실제로 존재하는 것, 사물 또는 개념.

- 객체의 용도 - 객체의 속성과 기능에 따라 다름.

- 객체 = 인스턴스

- 객체는 인스턴스를 포함하는 일반적인 의미

- 책상은 인스턴스다.

- 책상은 객체다.

- 책상은 책상 클래스의 객체다

- 책상은 책상 클래스의 인스턴스다.



### 클래스 변수 설명

* static variable은 인스턴스 명으로 접근 가능하지만 클래스 네임으로 접근 하는게 좋다.

* static 자원은 this. 를 사용하지 못한다 heap 영역에서만 사용가능

* static 자원은 import 구문실행시 메모리영역에 올라감.

* class method  = static method

* 로컬 valuable은 반드시 초기화를 해줘야함

* 멤버 valuable은 초기화를 안해도됨

* static은 클래스 네임으로 접근해야함

  ### 


```java
package day04;

public class Var {
	// new 하지 않는이상 불러올수없음 - 인스턴스 자원
	String name;
	// static은 new 하지 않아도 불러올수 있음 - 공유개념이 큰 자원
	static int number = 99;
	
	private boolean check;
	
	// boolean 타입은 get, set 메소드가 is, set으로 쓰임.
	public boolean isCheck() {
		return check;
	}


	public void setCheck(boolean check) {
		this.check = check;
	}


	public void print() {
		//로컬 variable은 반드시 초기화를 시켜야함
		//member variable은 초기화 시키지 않아도됨
		int n = 0;
		System.out.println(name);
		System.out.println(n);
	}
}

```

```java
package day04;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v = new Var();
		
		
		System.out.println(Var.number);
		System.out.println(v.name);
	}
}
```



### Method overloading

* 동일한 이름의 함수를 만들수 있음

* ex) System.out.println() → 어떤 타입이라도 출력한다.

* 가변인자와 오버로딩

```java
  package utill;
  
  public class Calc {
  	// 항상 같은  나오므로 공유자원의 개념이 크다
  	public static int add(int a, int b) {
  		return a+b;
  		
  	}
  	// 오버로딩
  	public static double add(double a, double b) {
  		return a+b;
  		
  	}
  	
  	// ...은 가변인자
  	public static int add(int ... a) {
  		// 향상된 for문
  		int sum = 0;
  		for(int data :a) {
  			sum += data;
  		}
  		return sum;
  			
  		
  	}
  	public static int multi(int a, int b) {
  		return a*b;
  	}
  	
  
  }
  
```



  ### 생성자

* 생성자는 클래스를 만들때 디폴트 생성자가 자동으로 생성됨

  ```java
  package day04;
  
  public class AccountTest {
  
  	public static void main(String[] args) {
  		// TODO Auto-generated method stub
  		
          // 
  		Account a1 = new Account();
  		a1.print();
  	}
  
  }
  
  ```

자바 doc 파일 생성(사용 설명서)

```shell
$ C:\Users\casio\OneDrive\바탕 화면\temp>javadoc Account.java
```
![그림2](C:\Users\casio\OneDrive\사진\그림2.png)
Account()가 자동 생성됨(디폴트 생성자)

