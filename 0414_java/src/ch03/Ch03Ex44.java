package ch03;

import java.util.Scanner;

public class Ch03Ex44 {
	public static void main(String[] args) {
		//메뉴만들기 : 0: 종료 , 1: 입력, 2: 출력
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		
		while(true) {//0이 입력되면 종료를 시키자. 
			System.out.println("\n0: 종료 , 1: 입력, 2: 출력");
			System.out.println("메뉴선택 : ");
			userInput = scan.nextInt();
			System.out.println("선택된 메뉴 : "+userInput);
			
			if(userInput == 0) {
				System.out.println("프로그램 종료");
				scan.close();
				System.exit(0); //break;
			} else if (userInput == 1) {
				System.out.println("입력");
			} else if (userInput == 2) {
				System.out.println("출력");
			} else {
				System.out.println("입력값이 올바르지 않습니다.");
				System.out.println("다시 입력하세요.");
			} //else
			
		}//while
		
		
	}//main
}//class
