package ch052;

/*
 * final : 최종적인 : 변경불가능 : 수정불가능
 * - final variable : 변경 불가능한 변수 : 상수  
 * - final method : 변경 불가능한 메소드 : override 불가 (덮어쓸수 없다)  
 * - final class : 변경 불가능한 클래스 : 상속불가 
 */

/*
 * final variable : 변경 불가능한 변수 : 상수
 * 예) final int iVar = 77; //변수의 상수화 
 * 주의! 1. 선언할 때 1번만 대입 연산 가능 : final int iVar; iVar = 77; -> 두줄이상으로 만드면 에러.
 * 주의! 2. 일반적으로 public static 으로 사용한다. 
 * 주의! 3. 상수 이름 : 모두 대문자 + 단어가 이어질 때는 _ : 예) MAX_INT 등 
 */


class Ch052Parent1 {
	public final void finalMethod() {
		System.out.println("finalMethod");
	}
}

class Ch052Child1 {
	public final void finalMethod() {} 
}


public class Ch052Ex02 {
	
	
	public static final int TMP_INT_TEST = 777;
//	public final int TMP_INT_TEST2; //error
//	TMP_INT_TEST2 = 777;
	
	
	public static void main(String[] args) {
		
		System.out.println(Ch052Ex02.TMP_INT_TEST);
		
	}//main
}//class
