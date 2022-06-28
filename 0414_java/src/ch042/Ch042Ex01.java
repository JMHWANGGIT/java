package ch042;
/* 객체지향 프로그래밍 : Object Oriented Programming : OOP 
 * - 대상을 바라보고 코딩하는 방법 
 * - 현실세계의 사물을 모델링하여, 컴의 세계에서 구현하는 것. 
 * 
 * modeling (모델링) : 내가 필요한 것만 최소화해서 정보화 하는것.
 * - 주체가 누구냐에 따라 같은 사물을 모델링해도 형태가 달라질 수 있음. 
 * - 사람 모델링에서 반드시 사람의 모든 것을 모델링해야 한다. x
 * - 사람 모델링에서 우리가 필요한 부분만 선별적으로 모델링 할 수 있다. o
 * ex> 사람 - 수강과목, 성적, 수강 년도, 수강 학기. 
 *     사람 - 혈액형, 간수치, 몸무게, 당수치... 
 *     
 * modeling의 종류 
 * - 개념 모델링 : 모델링 하고자 하는 대상의 개념을 찾아가는 과정  
 * - 논리 모델링 : 모델링 하고자 하는 대상의 개념을 논리적으로 정리하는 과정
 * - 물리 모델링 : 프로그래밍에 필요한 형태로 논리 모델링 결과를 변환하는 것. 
 * - 순서 : 개념 -> 논리 -> 물리 
 * 
 * - 사람을 개념모델링 한 결과.
 * : 이름,나이,키,몸무게,혈액형,직업,최종학력,자격증,주소,전화번호... 
 * 
 * - 사람을 논리모델링 : 논리적으로 필요한 것만 골라 내야 합니다. 
 * - 이력서의 사람 
 * : 이름,생년월일, 최종학력, 경력, 자격증,주소,전화번호
 * 
 * - 자바에서 이력서의 사람을 물리 모델링한 결과 생성되는 산출물(나오는것) 
 * -> public class saram{멤버변수, 멤버 메소드}
 * 
 * ex> 
 * public class saram{
 * 			String name;
 * 			String birthday;
 * 			String address;
 * 			String phonenumber;
 * 			..........................;
 * }
*/

/*
 * 멤버 변수 : class 내부에 선언된 변수 
 * 지역 변수 : 메서드(메소드) 내부에 선언된 변수 
 */

/*
 * class : 현실 세계를 모델링한 결과를 프로그램의 세계에 적용하기 위하여 만드는 자바 설계도. 
 * ~.java 파일 내부에 있는 class 선언은 new를 통해 메모리에 로드(load)된다.(메모리에 올라간다.)
 * 메모리에 올라간 class를 instance라고 부른다. 
 * class는 붕어빵 틀! instance는 붕어빵.
 * 하나의 클래스는 무한대의 instance 생성 가능.
 * String s1 = new String ("hi"); String s2 = new String ("hi"); String s3, s4, s5 .....
 * 자바에서 현실세계 모델링 -> class파일을 설계하는 것. 
 * 그래서 class 파일의 구성요소들을 알아야 한다. 
 * - pakage, import, 멤버변수, 멤버 메소드, 생성자(특수한 메소드).     
 */

/*
 * 메소드란? 
 * - 멤버 변수는 정적인 data 부분을 의미합니다. 
 * - 멤버 메소드는 동적인 수행을 담당. 
 * - 접근 제한자 + 리턴 타입 + 메소드 이름 + 파라미터(arguments) 
 * - 리턴타입 : 이 메소드의 수행 결과 나오는 데이터가 어떤 변수타입인지 알려주는 기능. : 자판기의 제품목록 
 * - (arguments): 이 메소드를 수행하기 위해 필요한 데이터를 입력받는 공간. : 자판기의 돈투입구 
 * - return : 메소드의 수행결과를 준다 : 자판기의 제품 출구
 * - 어떤 목적을 '수행'하기 위해, class의 내부에 선언된 코드블럭  
 */
public class Ch042Ex01 {
	
	public String name;
	public int age;
	public double height;
	public double weight;
	public char bltype; //멤버변수 : 멤버 메소드와 함께 class의 구성요소. 
	
	
	
	public static void main(String[] args) {
		//static이 선언된 부분은 즉시 메모리 load.
		//main은 static이기 때문에 new없이 바로 메모리 load.
		//print();//error //print가 메모리에 올라가지 않았다. 
		
		//class가 메모리에 올라가기 위해서는 new를 받아야 한다.
		Ch042Ex01 test = new Ch042Ex01();
		test.print();
		test.plus(777, 8);
		boolean imsi = test.compareStringLength("hi", "hello");
		System.out.println(imsi);
		
	}//main
	
	
	public void print() {
		//void : 없다. : 리턴타입이 없다.(실행만 할 뿐, 나에게 값을 돌려주지 않는다.)
		System.out.println("출력 메소드");
	}//print
	
	
	public void plus(int iVar1, int iVar2) {
		//arguments : 메소드가 수행하기 위해 필요한 데이터를 받는 곳. 
		System.out.println(iVar1 + iVar2);
	}//plus
	
	public boolean compareStringLength(String str1, String str2) {
		if(str1.length() == str2.length()) return true;
		else return false;
	}//compareStringLength
	
}//class
