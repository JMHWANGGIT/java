package ch03;

import java.util.Scanner;

public class JO532 {
	public static void main(String[] args) {
		// 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 
		// 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
		// 입력 예) 4.3 3.5
		// 출력 예) B
		
		//두개의 실수를 입력 
		Scanner scan = new Scanner(System.in);
		double fNum = scan.nextDouble();
		double sNum = scan.nextDouble();
		scan.close();
		
		//모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C"
		if (fNum >= 4.0 && sNum >= 4.0) {
			System.out.println("A");
		} else if (fNum >= 3.0 && sNum >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}//else
		
	
	}//main
}//class
