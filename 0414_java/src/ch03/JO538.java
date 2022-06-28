.
abstract ch03;

import java.util.Scanner;

public class JO538 {
	public static void main(String[] args) {
		//한 개의 정수를 입력받아 
		//양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 
		//0이 입력되면 종료하는 프로그램을 작성하시오.
		
		System.out.print("수를 입력하세요. : ");
		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		while(true) {
			userInput = scan.nextInt();
			if(userInput == 0) {
				System.out.println("프로그램을 종료합니다.");
				//scan.close();
				//System.exit(0);
				break;
			} else if (userInput > 0) {
				System.out.println("positive integer ");
			} else if (userInput < 0) {
				System.out.println("negative number ");
			}//else 			
		}//while
		scan.close();
	}//main
}//class
