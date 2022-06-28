
public class Start01 {
	//program : 실행계획 
	//programer : 실행계획을 만드는 사람 
	//class : (실행계획의) 설계도
	//pubilc : 보안등급 (public - protected - default - private)
	//Start01 : 이 설계도의 이름 
	//중괄호는 영역의 표시 : { 영역시작, } 영역종료.  
	//:주석(Comment) = 설명달기 
	//주석의 종류 1 : //는 한 줄 주석 
	//주석의 종류 2 : /* 부터 */까지 여러 줄 주석 
	
	/*
	 * 여러줄 주석 
	 * 자바는 주석과 공백을 무한히 허용함 
	 * 가독성(읽기 편한)높은 코드 작성을 권장. 
	 * 주석을 많이 달아야 잘 이해할 수 있음. 
	 */
	
	

	/* public static void main(String[] args) 
	 * : 프로그램 실행의 약속된 출발선
	 * 이름은 main method 
	 * 프로그램이 실행되면 main method에 첫줄에서 마지막 줄까지를 한줄씩 순서대로 수행.
	 * 코딩을 잘하는 방법 : 공백을 여유있게 사용하자. 들여쓰기 잘 하면 코딩실력이 늘어나는데 도움이 됨 
	 * 들여쓰기 / 줄간격 잘 쓰자!! 
	 */
	public static void main(String[] args) {
		//()소괄호 : 데이터를 담는 바구니 역할 
		// 받아들이는건 있는데 () 나가지를 않아요~ void
		
		System.out.println(123); //println : print line new 
		//System.out.println(123); : 화면 출력 메소드(메서드) 
		
		
		
		System.out.print(456);
		System.out.print(789); //정수출력 
		System.out.println(); // 라인변경 (줄 바꿈)
		System.out.println(0.12345); //실수출력 
		System.out.println('A'); //문자출력은 작은 따옴표(문자는 오직 1글자를 의미)
		System.out.println("문자열 출력은 큰 따옴표");
		System.out.println(true); // true, false 논리형 기호 
		
		
		
		/*
		 * System은 현재 컴퓨터를 의미합니다. 
		 * . : 내부, 속한, 가진, 가지고 있는
		 * System.out : 시스템 내부의 out을 의미함 
		 * out.println : out이 가지고 있는 println을 의미함.
		 * out : 컴퓨터 화면으로 출력하려는 자료가 임시로 대기하는 공간 
		 * out.print : 출력 대상 자료를 출력해라. 
		 * print : 화면 출력, println : 화면출력 후 줄 바꿈 (line new)
		 * print() : ()안에 내용을 출력하라. 
		 * ; : semicolon : 한 줄의 코딩이 끝났음을 표시 
		 */
		
	}//end of main

}//end of class

