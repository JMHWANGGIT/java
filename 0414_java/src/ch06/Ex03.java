package ch06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 다중 catch문 : try문의 예외 발생이 여러 종류의 예외가 발생한 경우 
 * 주의사항 : catch문에 Exception을 사용할 때에는 반드시 아래쪽 맨 아래쪽 catch문에서 사용해야 한다.
 * if문처럼 쓸수 있음. (분기해서 사용할 수 있음) 
 * 어떠한 값을 저장할때는 반드시 변수화를 시켜야 함. 
 * 자바는 레고블록! 
 * 자바를 잘 하려면 API를 잘 연구해야 함.   
 */
public class Ex03 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		try {
			//
			int var = 50;
			System.out.print("정수입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : "+ (var/su));
			
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해 주세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수가 없습니다.");
		}
		
		System.out.println("수고하셨습니다.");
		
		
	}//main
}//class
