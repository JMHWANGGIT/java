package ch06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 처리할때 사용. 
 * 			(DB, I/O, 네트워크에서 주로 사용)
 * try {
 * 		예외 발생 가능한 문장들;
 * } catch(예외객체 e) {
 * 		예외 발생 시 처리할 문장들;
 * } catch(예외객체 e) {
 * 		예외 발생 시 처리할 문장들;
 * }finally {
 * 		예외 처리와 상관없이 무조건 실행해야 하는 문장들 
 * }
 */
public class Ex04 {
public static void main(String[] args) {
		
		int k = 100;
		Scanner scan = new Scanner(System.in);
		
		try {
			//
			int var = 50;
			System.out.print("정수입력 : ");
			int su = scan.nextInt();
			System.out.println("정답 : "+ (var/su));
			k = k + 10;
			return;
			
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수가 없습니다.");
			k = k + 100;
			return;
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			k = k + 1000;
			return;
		} finally {
			System.out.println("반드시 실행해야 할 문장");
			//return은 만나도 finally는 하고 간다. 
		}
		//System.out.println("k = "+ k);
		//System.out.println("수고하셨습니다.");
		//한 블록의 return 밑에는 명령어를 쓸수 없음. 
		
	}//main
}//class

/*
 * 메소드는 다 리턴됨 자기가 호출된 곳으로!! void는 리턴이 생략될 뿐... 
 * void : return에가다가 값을 보내주지 않는다. (값은 return 된다)
 */

