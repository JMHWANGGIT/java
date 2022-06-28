package ch03;

import java.util.Scanner;

public class JO632 {
	public static void main(String[] args) {
		/*
		 * 3개의 정수를 입력받아 
		 * 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
		 * 입력 예) 18 -5 10
		 * 출력 예) -5
		 */
		
		Scanner scan = new Scanner(System.in);
		int fNum = scan.nextInt();
		int sNum = scan.nextInt();
		int tNum = scan.nextInt();
		
		scan.close();
/*
		int min;
		
		min = (fNum < sNum) ? fNum : sNum; 
		min = (min < tNum) ? min : tNum; 
		
		System.out.println(min);
*/		
		
		
		int min;
		
		if (fNum > sNum) {
			min = sNum;
		}else {
			min = fNum;
		}
		//min = (fNum < sNum) ? fNum : sNum;
		
		
		if (min > tNum) {
			min = tNum;
		}
		//min = (min < tNum) ? min : tNum; 
		
		
		System.out.println(min);
		
		
	}//main-
}//class
