package ch07;

import java.util.HashMap;

/*
 * Map
 * - interface : 객체 생성(new)불가
 * - 자료저장구조에 대한 정의
 * - key-value 한쌍으로 정리 (이름 - 내용물)
 * - 순서필요 없음 : key에 따라 저장하고, key에 따라 출력 
 * - 저장 key의 중복은 안됨!!! 저장 내용의 중복은 허용
 * - sub class : HashMap... 
 * 
 * HashMap
 * - 최근 추세는 Generic이 대세. 
 * 
 */
public class Ch07Ex03 {
	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
		map1.put("first", 1); //put : 데이터 저장
		map1.put("second", 3.14);
		map1.put("third", 'A');
		map1.put(4, true);
		map1.put(4, false); //같은키로 두번 들어가면, 뒤의 값으로 덮어써진다. 
		map1.put(5, "hello");
		map1.put(6, 3.14);
		
		System.out.println("size() : " + map1.size()); //size : 저장된 객체의 개수 
		System.out.println(map1); //순서없이 저장, key 중복 허용 안함. 
		System.out.println("keySet() : " + map1.keySet());//keySet : 키만 가져온다.
		System.out.println("values() : " + map1.values());//values : 내용만 가져온다. 
		
		System.out.println(map1.get("third"));
		System.out.println("get(5) : " + map1.get(5)); // get : 이름(key)을 통해 내용(value)을 가져온다.
		
		Object obj = map1.clone();
		HashMap map2 = (HashMap) obj;
		System.out.println("map2 : " + map2);
		
		System.out.println("isEmpty() : " + map2.isEmpty()); //isEmpty() : 비어있는가?
		map2.remove("third"); //remove : 이름을 통해 삭제
		map2.remove(5); 
		System.out.println("remove map2 : " + map2);
		map2.clear(); //clear : 모두 삭제
		System.out.println("clear after map2 : " + map2);
		
		
		
	}//main
}//class
