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
		// ArrayList�� �迭�� �����ϴ� �޼ҵ�
		List list = new ArrayList<>();
		list.add("ȫ�⵿");
		list.add("123");
		list.add("��浿");
		list.add("A");
		list.add(new Account());
		
		// list2���� String�� ���� ����
		List<String> list2 = new ArrayList<>();
		list2.add("ȫ�⵿");
		list2.add("�ڱ浿");
		list2.add("�ڱ浿");
		list2.add("��浿");
		System.out.println(list2);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i).charAt(0)+"**");
			
			
		}
		// �浿�̶� ����� ���ԵǾ� �ִ���
		System.out.println(list2.contains("�浿"));
		
		
		list2.remove(0);
		System.out.println(list2);
		
		// list2 �迭 Ŭ����
		list2.clear();
		System.out.println(list2);
		
		List list3 = new Vector();
		System.out.println("--------set---------");
		Set<String> set = new HashSet<String>();
		set.add("ȫ�⵿");
		set.add("�ڱ浿");
		set.add("�ڱ浿");
		set.add("��浿");
		System.out.println(set);
		
		for(String data :set) {
			System.out.println("**"+data.charAt(data.length()-1));
		}
		
		System.out.println("---------TreeSet-------");
		// TreeSet���� ��������
		Set<String> set2 = new TreeSet<String>();
		set2.add("ȫ�⵿");
		set2.add("�ڱ浿");
		set2.add("�ڱ浿");
		set2.add("��浿");
		System.out.println(set2);
		
		for(String data :set2) {
			System.out.println("**"+data.charAt(data.length()-1));
		}
		
		System.out.println("============Iterator==========");
		Iterator<String> si = set2.iterator();
		while(si.hasNext()) {
			String data = si.next();
			if(data.equals("�ڱ浿")) {
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
