package ch07;

import java.util.TreeSet;

public class Ch07Ex08 {
	public static void main(String[] args) {
		//나중에 시간되면 Comparable 알려주세요!! 
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(555);
		set.add(999);
		set.add(111);
		set.add(333);
		set.add(777);
		
		System.out.println(set);
		//data중심 정렬
		
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("i");
		set2.add("am");
		set2.add("a");
		set2.add("boy");
		set2.add("hi");
		set2.add("you");
		set2.add("girl");
		System.out.println(set2);
		
	}//main
}//class
