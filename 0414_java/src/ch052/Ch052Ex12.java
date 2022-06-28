package ch052;
/*
 * interface간의 상속 
 * - extends를 사용
 * - interface는 다중 상속이 가능하다.(다중상속 지원)
 * 	-> 메소드의 구현부가 없다.
 * 	-> 일반변수 없다.
 * 	-> 일반 메소드 없다. 
 * 		-> 다중 상속의 모호성이 없음.  
 */

interface Interface2 {
	public abstract void absMethod1();
}

interface Interface3 {
	public abstract void absMethod2();
}

interface Interface4 extends Interface2{} //interface간에 상속이 가능하다. 

interface Interface5 extends Interface1, Interface2, Interface3{
	//interface는 다중 상속이 가능하다. 
}

public class Ch052Ex12 {
	public static void main(String[] args) {
		
	}//main
	
}//class
