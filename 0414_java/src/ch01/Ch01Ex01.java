//한 줄 주석 
/*
 * 여러 줄 주석 
 * 자바는 공백과 주석을 무한히 허용 -> 컴파일에서 제거 
 * 주석과 공백을 최대한 활용하여 가독성 높은 (readable, 읽기쉬운)코드를 만들어라 
 */

/*
 * 작성일 : 2022.04.15
 * 작성자 : hwang jae myoung 
 * 클래스개요 : 오버뷰를 확인한다. 
 * 요청자 : 누구냐 넌.... ㅎㅎ
 * 요청 근거 : email, 공문 XX기관 2022-04001호 
 */

package ch01;
/*
 * pakage
 * 소스는 소스끼리, 컴파일 결과 생성되는 class 파일은 class파일끼리 묶어라
 * 패키지 이름은 소문자...
 * 패키지 이름 규칙은 안지켜도 에러는 안나지만, 현장에서 욕을 먹고 고쳐야 함. 
 */

public class Ch01Ex01 {
/*
 * public : 보안등급 (누구나 접근 가능) 
 * public - protected - default - private 
 */

/*
 * class : 설계도 
 * 프로그램(program) : 진행계획, 진행순서. 
 * 프로그래머(programer) : 진행계획이나 진행순서를 짜는(계획하는)사람 
 * class : 우리가 계획하는 진행계획이나 진행 순서를 설계해 놓는 문서. 
 * {} (중괄호) : 영역표시 
 * { : 영역시작
 * } : 영역종료
 * 모든 자바의 코딩은 class 내부에 하여야 함. 
 * 예외는 package, import의 단 두개. 
 */
	
/* 
 * Ch1Ex01 : 이름이 오는 자리, 
 * 여러분 맘대로 지으셔요~. 단 규칙이 있음. 
 * class 이름을 만드는 규칙 (명명규칙) - 파스칼 표기법
 * - 첫문자 대문자
 * - 이어지는 단어의 첫문자도 대문자 
 * - 나머지 소문자 
 * - 숫자 가능하지만, 맨 앞은 안됨.
 * - 특수문자는 $와 _만 가능하지만, 권장하지 않음. 
 * - 파일이름과 class의 이름이 대소문자 포함하여 완전히 일치해야 한다. 
 * - 안지켜도 에러는 안나지만, 현장에서 욕을 먹고 고쳐야함. 
 */
	
/*
 * class의 member (구성요소)
 * - variable (변수) : data. 정적이다.  
 * - method (동작) : 동적이다. 
 */
	public static void main(String[] args) {
		// public static void(사출구) main(String[] args)(투입구)
		// public static void main(String[] args) - 시작점
		// void : 없다. 
		/* 
		 * main : 메소드(메서드)이름 - 시작 메서드의 이름은 반드시 main.
		 * 현재 클래스를 실행하면, 메인의 첫줄에서 마지막 줄까지 한 줄씩 순서대로 수행.
		 * 이것이 시작 메서드의 의미.
		 */
		  
		
		System.out.println(123);
		System.out.print(456);
		System.out.println(789);
		System.out.printf("%d + %d = %d", 1,2,3); //print + format
		/*
		 * System - jdk가 제공.
		 * - 이 코드가 실행되는 컴퓨터를 지칭.
		 * . : ~의 내부에. 
		 * out 
		 * - jdk가 제공. 
		 * - 이 코드가 실행되는 컴퓨터의 out buffer를 지칭. 
		 * print : 화면에 출력. 
		 * println : 화면에 출력한 다음에 줄바꿈을 해라. print + line new.
		 * print() : ()안의 내용을 출력해라. 
		 * ; (semicolon) : 한 줄의 끝을 표시. 안 쓰면 에러. 
		 */
		
		
	}//end of main //main

}// end of class //class
