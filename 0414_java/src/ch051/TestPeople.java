package ch051;
/*
 * OOP의 3대특징 
 * - inheritance : 상속 (다른 클래스를 복제) : 설계 개념 
 * - polymorphism : 상속의 부모 변수는 자식 instance의 주소를 가질 수 있다. : 설계 개념  
 * - incapsulation : 은형성 (코드를 숨긴다) : 단순 테크닉 
 * 우리가 직접만든 메소드가 아니더라도 return된 argumemt, name만 알아도 적용가능?  
 * - jdk : 상속과 다형성 기반으로 만들어짐 : 사용법은 은형성을 참고 
 * - 단일 상속 : 상속의 모호성을 제거하기 위해 (다른 랭귀지는 가능 하지만 java는 안됨) 
 */

class TestTeacher extends TestPeople {
	String subject;
	String payAccount;
}//class

//people을 확장한 것이 student이다.(범위가 더 넓다.)
class TestStudent extends TestPeople {
	String grade;
	String ban;
}//class

public class TestPeople {
	
	String firstName;
	String name;
	String tel;
	String address;
	
}//class
