package ch03;

/*
 * 논리연산자 -> 결과값이 true, false.
 * & (and) : 그리고,(좌/우가 모두 참(true)일때만 참(true))
 * | (or)  : 또는, 좌/우 중 하나가 참(true)이면 참(true) -> 하나만 참이면 참!
 * JAVA에서는 하나짜리 잘 안씀. 거의 두개짜리를 씀.  
 */
public class Ch03Ex03 {
	
	public static void main(String[] args) {
		
		
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		System.out.println(true | true); //true
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
		
		
		//논리 연산의 Short Circuit Logic 1.
		//& : & 앞(좌측)의 값이 이미 거짓이면, & 뒤(우측)의 값과 상관없이 이미 거짓.
		//   -> & 뒤(우측)의 값을 검사할 필요가 없다. -> &&
		
		System.out.println( 1 > 10 & 10 < 100);
		//& : 1 > 10 검사 + 10 < 100 검사 -> 결과 false
		
		System.out.println( 1 > 10 && 10 < 100);
		//&& : 1 > 10 검사 -> 결과 false //Short Circuit Logic 
		
		
		
		//논리 연산의 Short Circuit Logic 2.
		//| : | 앞(좌측)의 값이 이미 참이면, & 뒤(우측)의 값과 상관없이 이미 참.
		//   -> | 뒤(우측)의 값을 검사할 필요가 없다. -> ||
		
		System.out.println( 10 < 100 | 1 > 10); //true
		//| : 10 < 100 검사 + 1 > 10 검사 -> 결과 true
		
		System.out.println( 10 < 100 || 1 > 10); //true
		//|| : 10 < 100 검사 -> 결과 : true //Short Circuit Logic 
		
		
		
		
		
	}//main
}//class
