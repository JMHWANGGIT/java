package ch07;

/*
 * 다이아몬드 지시자 : <>
 * 와일드카드 : <E>, <K,V> / <>안에 들어간 요소.
 * - E : Element : 클래스 내부에서 사용되는 요소 
 * - K : Key
 * - V : Value
 * - T : Type : 외부에서 입력하는 클래스의 타입 -> 클래스 내부에서 사용되는 타입. 
 * - N : Number 
 * - ? : 모든 클래스 - Object. 
 * 
 * 자료형 매개변수 T
 * - 자료형 매개변수 : 여러 참조자료형으로 대체될 수 ㅣㅆ는 부분을 하나의 문자로 표현한 것. 
 * - T : data type을 의미. 
 */

class Ch07Ex11Test<T> {// new Ch07Ex11Test<>();
	private T name;
	private String str;
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	
}//Ch07Ex11Test


class Ch07MyGObj {
	
	String message;
	Ch07MyGObj(String msg) {
		this.message = msg;
	}//Ch07MyGObj()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.message;
	}//toString()
	
}//Ch07MyGObj

public class Ch07Ex11 {
	public static void main(String[] args) {
		
		
		Ch07Ex11Test<Integer> test1 = new Ch07Ex11Test<Integer>();
		test1.setName(777);
		System.out.println(test1.getName().toString());
		
		Ch07Ex11Test<String> test2 = new Ch07Ex11Test<String>();
		test2.setName("hello");
		System.out.println(test2.getName().toString());
		
		Ch07Ex11Test<Ch07MyGObj> test3 = new Ch07Ex11Test<Ch07MyGObj>();
		test3.setName(new Ch07MyGObj("Victory!!!"));
		System.out.println(test3.getName().toString());
	}//main
}//class
