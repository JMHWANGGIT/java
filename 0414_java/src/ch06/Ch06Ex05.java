package ch06;

import java.util.Scanner;
/*
 * java의 error
 * - compile error : 컴파일 시에 나타나는 오류, 조치를 취하지 않으면 아예 실행이 불가. 
 * - runtime error : 실행 시에 나타나는 오류, 치명 오류와 예외사항으로 나누어진다. 
 * 					 치명적 오류는 코딩에서는 논의 대상 자체가 아님. 
 * 					 치명적 오류 - 하드디스크 손상, 메모리 부족. (코딩으로 해결할 수 없는 오류) 
 * 
 * Exception : 예외 상황 : 프로그램을 만들면서 의도하지 않은 상황을 말함. 
 * 				예) 인터넷 접속중에니다 어머니ㅏ 청소기를 돌리다가 인터넷선을 뽑았다. 
 * 
 * Exception 처리 : Exception handling 
 *  - 상기 예와 같이 의도하지 않은 상황이 발생했을 때, 
 *  	-> 사용자에게 알림을 발생시키거나 
 *  	-> 안전하게 프로그램을 종료시키는 등의 처리를 말한다. 
 *  	-> 이것이 java exception 교육의 목표. 
 */

/*
 * finally 
 * - try ~ catch의 뒷처리 담당 
 * - exception의 발생 여부와 관계없이 try문의 다음에는 반드시 실행되는 코드블럭 {}
 * - 예외(exception)가 발생해도 실행되고 예외(exception)가 없어도 실행되는 코드가 위치하는곳. 
 *   
 */
public class Ch06Ex05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int userInput = 0;
		try {//포위망 // 문제가 발생하면 처리할 수 있는 공간을 설정 
			
			userInput = scan.nextInt();
			System.out.println("userInput : " + userInput);
			
		} catch (Exception e) {
			
			System.out.println("wrong input. try again.");
			//e.printStackTrace(); // exception을 확인하고 싶을때 사용. 
		} finally {//finally : 뒷정리를 해주는 부분! 
			scan.close();
		}
		
		
	}//main
}//class

