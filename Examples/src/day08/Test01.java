package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		// map�� key, value ����
		// Ű���� �ߺ� ����
		Map<String, String> map = new HashMap<>();
		map.put("010-2222-3333", "�达");
		map.put("010-2222-3333", "ȫ��");
		map.put("010-2222-3333", "�ھ�");
		map.put("010-2222-3333", "��");
		map.put("010-2222-3333", "�־�");
		
		// key ���� �ߺ��Ǹ� ������ Ű���� �����
		System.out.println(map);
		
		map.put("010-2222-3333", "�达");
		map.put("010-22122-3333", "ȫ��");
		map.put("010-212-3333", "�ھ�");
		map.put("010-22242-3333", "��");
		map.put("010-2221-3333", "�־�");
		
		// Ű���� �޶�� ���尡��
		System.out.println(map);
		
		// �ؽø� ������ �����͸� ã���� ������� �ڷᱸ���̴�.
		System.out.println(map.get("010-2222-3333"));
		
		Set<String> names = map.keySet();
		Iterator<String> in = names.iterator();
		
		while(in.hasNext()){
			String key = (String) in.next();
			System.out.println(key+" : " +map.get(key));
		}
		//map.keySet();
	}

}
