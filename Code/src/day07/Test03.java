package day07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
		
		System.out.println("---------TreeSet-------");
		// TreeSet은동 정렬해줌
		Set<String> set2 = new TreeSet<String>();
		set2.add("홍기동");
		set2.add("박길동");
		set2.add("박길동");
		set2.add("김길동");
		System.out.println(set2);
		
		for(String data :set2) {
			System.out.println("**"+data.charAt(data.length()-1));
		}
		
		System.out.println("============Iterator==========");
		Iterator<String> si = set2.iterator();
		while(si.hasNext()) {
			String data = si.next();
			if(data.equals("박길동")) {
				si.remove();
			
			}
		}
		System.out.println(set);
		
		Iterator<String> li = list.iterator();
		while(li.hasNext()) {
			String data= li.next();
			System.out.println(data+" , ");
		}
		
	}
	
}
