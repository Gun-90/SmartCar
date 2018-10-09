package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {
		// map은 key, value 형태
		// 키값은 중복 불허
		Map<String, String> map = new HashMap<>();
		map.put("010-2222-3333", "김씨");
		map.put("010-2222-3333", "홍씨");
		map.put("010-2222-3333", "박씨");
		map.put("010-2222-3333", "고씨");
		map.put("010-2222-3333", "최씨");
		
		// key 값이 중복되면 마지막 키값만 저장됨
		System.out.println(map);
		
		map.put("010-2222-3333", "김씨");
		map.put("010-22122-3333", "홍씨");
		map.put("010-212-3333", "박씨");
		map.put("010-22242-3333", "고씨");
		map.put("010-2221-3333", "최씨");
		
		// 키값이 달라야 저장가능
		System.out.println(map);
		
		// 해시맵 구조가 데이터를 찾을때 가장빠른 자료구조이다.
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
