package ch03;

import java.util.Scanner;

public class Ch03Ex32 {
	
	
	public static void main(String[] args) {
		//Ch03Ex31 정수 계산기의 switch문을 if문을 사용하여 만들어보자. 
		
		
		// 계산기를 만들어보자 
		// 계산기의 작동순서 : 정수 입력, 기호 입력, 정수 입력, 결과 변수.
		// 1. 입력 
		// 2. 계산 - if
		
		
		
		
		// module 1. 정수, 기호(+,-,*,/), 정수의 순서로 값을 입력 받는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int fNum = scan.nextInt();
		System.out.print("+,-,*,/ 중 하나의 부호를 입력하세요~! : ");
		String giho = scan.next();
/*		
		if (!(giho.equals("+") ||giho.equals("-") ||giho.equals("*") ||giho.equals("/"))) {
			System.out.println("입력오류!! 제대로 입력해주세요~! ");
			System.out.println("입력이 제대로 되지 않아 시스템을 종료합니다.");
			System.exit(0);//프로그램 종료
		}
*/		

		System.out.print("정수입력 : ");
		int sNum = scan.nextInt();
		scan.close();
		
		
		//module 1 test
		//System.out.printf("%d %s %d\n", fNum, giho, sNum);
				
				
		// module 2. 기호(+,-,*,/)에 따라 연산을 수행하여 그 결과 값을 출력한다.
		
/*
 
		if (giho.equals("+")) {
			int res = fNum + sNum;
			System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		} else if (giho.equals("-")) {
			int res = fNum - sNum;
			System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		} else if (giho.equals("*")) {
			int res = fNum * sNum;
			System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		} else if (giho.equals("/")) {
			int res = fNum / sNum;
			System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}//else
		
*/		
		int res = 0;
		
		if (giho.equals("+")) {
			res = fNum + sNum;
			
		} else if (giho.equals("-")) {
			res = fNum - sNum;
			
		} else if (giho.equals("*")) {
			res = fNum * sNum;
			
		} else if (giho.equals("/")) {
			res = fNum / sNum;
			
		} else {
			System.out.println("입력된 값이 올바르지 않습니다.");
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}//else
		
		System.out.printf("%d %s %d = %d", fNum, giho, sNum, res);
		
	}//main
}//class
