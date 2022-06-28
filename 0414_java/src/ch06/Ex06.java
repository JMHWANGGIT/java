package ch06;

import java.util.Scanner;

/*
 * throw 예약어 : (예외양도, 예외전가) 
 * - 예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달 하는 것. 
 * - 반환형(void) 메소드(인자) throws 예외객체 {}
 * - 나중에라도 예외처리(try ~ catch)를 하는 것이 좋다. 
 * 
 * 예약어 : JAVA에서 미리 지정해서 쓰는 단어 (자줏빛) 
 * 첫글자 대문자 : class
 * 
 */
public class Ex06 {
	
	public void setData(String msg) {
		if(msg.length() >= 1) {//1글자 이상이냐? 
			String str = msg.substring(0,1);
			try {
				prnData(str);				
			} catch (Exception e) {
				System.out.println("첫글자는 숫자여야 한다.");
			}//try~catch
		}//if
	}//setData
	
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
		System.out.println(dan + " 단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}//for
		
	}//prnData
	
	public static void main(String[] args) {
		
		
		Ex06 test = new Ex06();
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		String msg = scan.next();
		test.setData(msg);
		
	}//main
}//class	
