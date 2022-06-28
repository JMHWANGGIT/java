package ch051;

/*
 * Polymorphism : 다형성 : 다양한 형태를 갖는 성질 
 * - 상속받은 개체(child)의 내부에는 부모객체가(parent)가 있다. 0 
 * - 부모타입의 변수는 자식타입의 객체가 있는 메모리 주소를 가질 수 있다. 0
 * 메모리 주소는 가지고 데이터(자식 고유데이터)는 받지 못함. 
 * - 그리스어 poly(많은) + morphos(형태)
 * - 상속관계(is a relationship)에서만 성립함. 
 */

/*
 * Polymorphism 사용이유 ? 장점
 * - Heterogeneous Collection : 이종배열 : 상속개념에서 다른 데이터 타입도 다 들어가는 배열 
 * - Polymorphic Arguments
 * - 코딩이 쉬워짐. 
 */
public class Ch051Ex02 {
	public static void main(String[] args) {
		
		People p1 = new People();
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		//=======================================
		People p2 = new Teacher(); //부모타입의 변수는 자식타입의 객체 주소를 가질 수 있다. 
		//p2는 people의 변수.people이 가진 내용만 알고 있음. 자신이 선언한 데이터 타입만 알고 있음.  
		p2.familyName = "홍";
		p2.name = "길동";
		p2.address = "신수동";
		p2.tel = "010";
		//p2.subject = "java"; //error 
		//p2.payAccount = "Kb"; //error
		//People 타입의 변수 p2는 Teacher의 고유영역에 뭐가 있는 지 모른다.(Polymorphism 한계)
		
		
		Teacher t4 = (Teacher)p2; //Object Data type Casting // 객체타입 변경 (형변환)
		//class단위의 접근
		t4.subject = "java";
		t4.payAccount = "Kb";
		 
		People p3 = new Student();
		
		//=======================================
		//Teacher t2 = new People(); //error 자식타입의 변수는 부모타입의 객체 주소를 가질 수 없다
		//Student s2 = new People(); //error
		//Teacher t3 = new Student(); //error
		//Student s3 = new Teacher(); //error 
		//=======================================
		
		
		
	}//main
}//class
