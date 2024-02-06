package com.ict.day16;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
public static void main(String[] args) {
	//Map  : key, value
//             duplicate key X
//	           duplicate value O
	//         key -> value
	//         keySet() 
	//         add() X   =>   put(key, value)
	//         Class => HashMap
	
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	map1.put(0, "한국");
	map1.put(1, "중국");
	map1.put(2, "미국");
	map1.put(3, "태국");
	map1.put(10, "영국");
	map1.put(13, "일본");
	System.out.println(map1);
	
	//키 중복 덮어쓰기 됨
	map1.put(1, "호주");
	// value 중복
	map1.put(16, "호주");
	System.out.println(map1);
	
	//꺼내기 => keySet() 
	// value 만 나옴
	for (Integer k : map1.keySet()) {
		System.out.println(map1.get(k));
	}
	
	Iterator<Integer> it =map1.keySet().iterator();
	while (it.hasNext()) {
		Integer k = (Integer) it.next();
		System.out.println(k); // 키값만 나옴 
		System.out.println(map1.get(k)); // value 
	}
	//value  
	Collection<String> var = map1.values();
	System.out.println(var);
	System.out.println("========================");
	//entrySet() method -> key, value 
	Set<Map.Entry<Integer, String>> set1 =map1.entrySet();
	Iterator<Map.Entry<Integer, String>> it2 = set1.iterator();
	while (it.hasNext()) {
		java.util.Map.Entry<Integer, String> entry = it2.next();
		Integer key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key+":"+value);
		
	}
	// key, value  다나옴
	for (Map.Entry<Integer, String> entry : map1.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key +":" +val);
	}
	
	
	
	
}
}
