package ch03;

import java.util.Scanner;

public class JO537 {
	//100이하의 양의 정수만 입력된다. 
	//while문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오. 
	public static void main(String[] args) {
		
	System.out.print("100이하의 양의 정수를 입력하시오 : " );
	Scanner scan = new Scanner(System.in);
	int iVar = scan.nextInt();
	scan.close();
	if(iVar > 0 && iVar <= 100) {
		
		int sum = 0;
		int loofCnt = 1;
		while(loofCnt <= iVar ) {
			sum = sum + loofCnt;
			loofCnt++;
			
		}//while
		System.out.println(sum);
	} else {
		
		System.out.println("양의 정수가 아닙니다.");
		System.out.println("시스템을 종료합니다.");
		scan.close();
		System.exit(0);
		
		}//if
	}//main
}//class
