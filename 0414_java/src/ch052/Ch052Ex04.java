package ch052;

/*
 * static area 
 * - static로 선언된 변수들, 메소드들이 생성되는 메모리 공간
 * - 일반 객체가 instance가 생성되는 공간(heap area)과 다르다. 
 * 
 * static : static에 대한 부분을 JRE에게 즉시 메모리에 올릴 것을 명령하는 문법 
 * - static 선언된 변수들과 메소드들은 new 없이 메모리(static area)에 load 된다. 
 * (일반적인 객체들이 올라가는 영역과는 다른 영역이다!)
 * - static area : 언제든 실행 가능한 영역을 의미한다.  
 */

public class Ch052Ex04 {
	
	public int nonStaticInt = 777;
	//nonStaticInt는 아직 메모리에 올라가지 않은 것으로 생각할 수 있다. 
	public static int StaticInt = 888;
	//staticInt는 메모리에 이미 올라간 것으로 생각할 수 있다. 
	
	
	public static void main(String[] args) {
		
		//System.out.println(nonStaticInt); //아직 메모리에 올라가지 않음. new 없이 올라갈수 없음. 
		System.out.println(StaticInt); //메모리에 이미 올라갔음
		System.out.println(Ch052Ex04.StaticInt);
		//그래서 static는 변수 없이, class이름을 통해 접근한다. 단, main 메소드는 예외. 
		
	}//main
}//class

