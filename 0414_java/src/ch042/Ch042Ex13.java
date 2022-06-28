package ch042;

/*
 * this를 통한 생성자 접근(호출)
 * - 생성자 내부에서 this가 소괄호()와 함께 쓰이면, 
 * - 현재 객체 내부의 또다른 생성자를 호출한다. 
 *  주의사항 
 * - 반드시 생성자의 첫 라인에서 호출해야 한다. 
 */
class Ch042Dummy7 {
	public Ch042Dummy7() {
		//System.out.println(); //this()를 통한 생성자 호출은 반드시 생성자의 첫 라인!!! 
		this("HOW "); // -> 17라인 호출 (문자열 하나 받는 생성자를 찾아라)
	}
	
	public Ch042Dummy7(String str1) {
		this(str1, "ARE "); // -> 21라인 호출 (문자열 2개를 받는 생성자를 찾아라)
	}
	
	public Ch042Dummy7(String str1, String str2) {
		this(str1, str2, "You:"); // -> 25라인 호출  (문자열 3개를 받는 생성자를 찾아라)
	}
	
	public Ch042Dummy7(String str1, String str2, String str3) {
		System.out.println(str1 + str2 + str3); // 그리고 결과값을 출력해라. 
		
	}
}//class


public class Ch042Ex13 {

	public static void main(String[] args) {
		
		
		Ch042Dummy7 dummy = new Ch042Dummy7(); //수행 1 

	}//main

}//class
