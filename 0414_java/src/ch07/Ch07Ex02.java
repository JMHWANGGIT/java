package ch07;

import java.util.ArrayList;

/*
 * List 
 * - interface : 객체생성(new)불가
 * - 자료저장 구조에 대한 정의.
 * - 순서 있음. 순서에 따라 저장하고, 순서에 따라 출력한다. 
 * - 저장 내용의 중복을 허용함. 
 * - 길이 개념 size()
 * - 주소 개념은 0부터 시작. size() - 1 에서 종료 
 * - subclass : ArrayList, LinkedList, Vector...  
 * 
 * ArrayList 
 * - 최근 추세는 Generic이 대세. 
 * - Generic의 탄생배경을 알려면, Generic 없는 ArrayList를 알아야 함. 
 */

public class Ch07Ex02 {
	public static void main(String[] args) {
		
		
		ArrayList<String> listGStr = new ArrayList<String>(); //Generic Type
		//listGStr.add(1);//error
		//listGStr.add(3.14); //error
		//listGStr.add('A'); //error
		//listGStr.add(true); //error
		listGStr.add("hi");
		
		ArrayList list1 = new ArrayList();
		/*
		 * ArrayList의 일반적인 사용법은 다양한 데이터를 담을 수 있지만,
		 * 원하지 않는 데이터가 섞일 수 있는 의도치 않는 상황이 발생할 수 있다. 
		 * - Generic Type의 탄생 배경 
		 * Generic Type은 저장할 수 있는 형태를 제한한 용법. 
		 */
		list1.add(1);//add : data를 추가한다. 
		list1.add(3.14);
		list1.add('A');
		list1.add(true);
		list1.add("hi");
		
		System.out.println("size : " + list1.size()); // size : ArrayList의 길이.
		System.out.println("get(0) : " + list1.get(0)); //get : data 추출
		System.out.println("get(1) : " + list1.get(4));
		
		
		/*
		 * clone이랑 toArray가 ArrayList가 아니라 Object라는게 무슨 뜻인가요?무슨 차이인가요?
		 * java.lang.Object : 모든 class는 Object를 자동상속
		 * ArrayList : Object [] (Object의 배열이었다.)
		 * Object[0] = new String("hi");
		 * String str = (String) Object[0]; 
		 * 예제를 참고하자!! Ch07Ex011 참조 
		 */
		
		Object obj = list1.clone(); //clone : 복사. 결과물이 Object다. 
		ArrayList list2 = (ArrayList) obj;
		//ArrayList list2 = (ArrayList)list1.clone();
		
		Object[] objArr = list2.toArray();
		
		System.out.println("objArr[4] : " + objArr[4]);
		//isEmpty : 비어있는 ArrayList인가?
		System.out.println("list2.isEmpty() : " + list2.isEmpty()); 
		list2.clear(); //clear : 비워라
		System.out.println("clear after list2.isEmpty() : " + list2.isEmpty());
		
		//indexOf : 특정 값의 index 위치(앞에서 검색)
		System.out.println("indexOf : " + list1.indexOf('A')); 
		
		//lastIndexOf : 특정 값의 index 위치.(뒤에서 검색)
		System.out.println("lastIndexOf : " + list1.lastIndexOf(3.14));
		
		System.out.println(list1);
		list1.remove(3); //remove(3); : 3번지 삭제 
		list1.remove(3.14); //remove(3.14) : 'A' 삭제
		System.out.println(list1);
		
	}//main
}//class

