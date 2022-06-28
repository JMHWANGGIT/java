package ch051;
/*
 * 상속을 사용하는 이유 & 장점 ★★★★★ (기술면접 단골) 
 * - 구조가 간단해진다. 
 * - 코드 재사용성 높아진다. 
 * - 추가개발 또는 수정 쉬워진다.(프로그램의 유연성이 좋아진다.)
 * - 프로그램의 확장과 관리도 쉬워진다. 
 */

public class People {

	String familyName;
	String name;
	String address; 
	String tel;
	void print() {}
	
}//class

class Teacher extends People{
	
	String subject;//과목
	String payAccount;//급여계좌
	void print() {
		System.out.println(familyName + " : " + name + " : " + address + " : " + tel + " :" 
	+ subject + " : " + payAccount);
	}
}//class

class Student extends People{
		
	String grade;//학년
	String ban;//반
	//String bohojaTel;//보호자 전화번호
	void print() {
		System.out.println(familyName + " : " + name + " : " + address + " : " + tel + " :" 
	+ grade + " : " + ban);
	}	
}//class

