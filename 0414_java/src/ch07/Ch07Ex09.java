package ch07;

import java.util.TreeMap;

public class Ch07Ex09 {
	public static void main(String[] args) {
		//나중에 시간되면 Comparable 알려주세요!! 
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(5, "no5");
		map1.put(9, "999");
		map1.put(1, "first");
		map1.put(7, "seven");
		System.out.println(map1);
		//key 중심으로 정리한다 
		
		
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		map2.put("nice", "no5");
		map2.put("to", "999");
		map2.put("meet", "first");
		map2.put("you", "seven");
		System.out.println(map2);
		
		
		
	}//main
}//class
