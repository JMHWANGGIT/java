package ch042;
/*
 * OOP : Object oriented programming : 객체지향 프로그래밍 
 * - 현실을 모델링 하여 프로그램을 만들자. (비즈니스프로세스)
 * - 병원차트, 학교 학생부. 
 * - 모델링의 예 : 지도 
 * - 프로그래밍의 모델링 : 개념을 찾아라(개념모델링) -> 찾은 개념들을 정리해라(논리모델링) -> 프로그램의 형태로 바꿔라(물리모델링)
 * - 프로그래밍의 모델링 : 객체지향 프로그래밍의 과정 
 * - 프로그래밍의 모델링 : 현실에서 필요한 부분만 발췌하라. 예) 사람 - 환자와 의사 
 * - 환자 : 이름, 나이, 혈압, 혈액형, 간수치, 당수치, 병이름, 입원기록....
 * - 의사 : 전공, 면허(자격증), 계좌번호(월급)... 
 * - 자바가 만드는 물리 모델링의 결과는 class (~.java 파일)
 */

/*
 * class
 * - class는 프로그램 실행의 단위 : class 단위로 메모리를 잡는다. : class가 통째로 메모리에 올라간다.  
 * - class : 설계도 : 아파트 설계도 한 장이면 무한대로 건설할 수 있다.
 * - class : 붕어빵 틀 (붕어빵 틀 하나면 무한대로 붕어빵 제조가 가능하다.) 
 * - ex) String str1, str2, str3....;
 * - new를 통해 메모리에 올라간다.(load)   
 */

/*
 * class의 구성요소 
 * - class는 프로그램 실행의 단위이기 때문에, 모든 코드는 class내부에 와야 한다. 
 * - 예외) 폴더구조 : pakage, import. 
 * - pakage : class(~.java파일)을 컴파일한 결과가 들어가는 폴더의 위치. 
 * - pakage : 하나의 ~.java 파일에 하나의 표현만 온다. 
 * - import : 사용하기 위해 필요한 class파일(~.class파일)이 어디에 있는지 가져올 위치를 지정. 
 * - import : 필요한 만큼 선언가능 
 * - pakage, import선언 방법 : 상위 폴더.하위폴더 : 폴더 이름은 소문자를 권장. (현장에서 안지키면 욕먹는다)
 * - member 변수 : class의 구성 요소 중, 데이터적 요소.
 * - member method : class의 구성 요소 중, 동작/행위적 요소.
 * - 하나의 ~.java파일에는 여러 클래스(class)선언가능. 
 * - 하나의 ~.java파일에는 단 하나의 public class만 선언(존재) 가능. 
 * - 하나의 ~.java파일에 있는 public class의 이름으로 자바 파일의 이름을 선언해야 한다. 
 */




class Ch042Saram {
	
	String firstName;
	String lastName;
	String socialSequrityNumber;
	String phoneNumber; //데이터적 요소 
	
	void sayHello() {
		System.out.println("안녕하세요. " + firstName + lastName + " 입니다.");
	}//행위적 요소 
}//class





public class Ch042Ex02 {
	public static void main(String[] args) {
		
		//String class 하나로 여러개의 문자열 객체를 만들 수 있다. 
		String str1 = new String ("hi");
		String str2 = new String ("hello");
		System.out.println(str1);
		System.out.println(str2);
		
		//new : class를 메모리에 올리라는 명령어(표현)
		//. : ~의 내부에 존재하는 
		
		//Ch042Saram class 하나로 여러 명의 사람 객체를 만들 수 있다.  
		Ch042Saram saram1 = new Ch042Saram();
		saram1.firstName = "바";
		saram1.lastName = "다";
		saram1.sayHello();
		Ch042Saram saram2 = new Ch042Saram();
		saram1.firstName = "하";
		saram1.lastName = "늘";
		saram1.sayHello();
		//Ch042Saram class를 설계도로, 메모리에 Ch042Saram 객체를 만든다. 
		
		
	}//main
}//class
