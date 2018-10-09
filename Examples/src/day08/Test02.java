package day08;

import java.util.Calendar;
import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		Date d2 = new Date(2018,10,5);
		System.out.println(d2);
		
		//캘린더 함수는 생성자를 통해서 생성 불가
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		c.set(2018, 10,5);
		System.out.println(c);
		
		
	}

}
