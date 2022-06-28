package ch07;

import java.util.ArrayList;

/*
 * JDK는 Oracle에서 만들고 유지 & 보수 한다.
 * -> 우리 눈에 보이지 않는 숨겨진 로직이 존재 
 * 	-> 우리가 원리를 파고 들어도 알 수 없다.  
 */

class Ch07Ex071Test {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "내가 만든 toString()";
	}
	
}//Ch07Ex071Test

public class Ch07Ex071 {
	public static void main(String[] args) {
		
		String str = new String("hello");
		System.out.println(str);//숨겨진 로직 
		//숨겨진 동작의 진짜 실제 동작코드.
		System.out.println("str.toString() : " + str.toString());
		
		ArrayList<Ch07Ex071Test> list = new ArrayList<Ch07Ex071Test>();
		Ch07Ex071Test test1 = new Ch07Ex071Test();
		Ch07Ex071Test test2 = new Ch07Ex071Test();
		list.add(test1);
		list.add(test2);
		System.out.println(list);
		/*
		 * System.out.println(list)
		 * - ArrayList의 size만큼 for문을 돌면서 
		 * 	-> ArrayList 내부 객체의 toString을 출력한다.
		 * 
		 * [ch07.Ch07Ex071Test@5e91993f, ch07.Ch07Ex071Test@1c4af82c]
		 * 결과값 : Object의 toString 값!! 
		 */
		
	}//main
}//class

