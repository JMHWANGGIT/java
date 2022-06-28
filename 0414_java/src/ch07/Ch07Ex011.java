package ch07;

import java.util.ArrayList;

class Ch07Test1 {}

public class Ch07Ex011 {//주제! : Object.
	public static void main(String[] args) {
		
		Ch07Test1 test = new Ch07Test1();
		System.out.println(test.toString());
		
		
		/*
		 *  왜 Ch07Test1 class에 메소드가 안보이는데 toString 값이 나오는가? 
		 *  -> Object를 자동 상속했더라~!
		 *  Object - 모든 class의 super class이다. (최상위 class) 단군할아버지!! 
		 *  -> Collection API의 정체 : Object의 Heterogeneous Collection.
		 *  	-> ArrayList == Object []
		 *  		-> ArrayList.clone() ===> Object[]
		 *  		-> ArrayList.toArray() ===> Object[]
		 */
		
		ArrayList list = new ArrayList();
		list.add("hi");
		//String imsiStr = list.get(0); //error
		Object ob = list.get(0);
		String tmpStr = (String)ob;
		
		
		Ch07Parent1[] pArr = new Ch07Parent1[2];
		pArr[0] = new Ch07Child1();//부모타입의 배열에 자식 객체 연결. 
		
		//Ch07Child1 c1 = pArr[0];//error
		Ch07Child1 c2 = (Ch07Child1)pArr[0];
		
	}//main
}//class


class Ch07Parent1 {}

class Ch07Child1 extends Ch07Parent1{}

