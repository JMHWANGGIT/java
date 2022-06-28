package ch03;

import java.util.Scanner;

public class JO539 {
	public static void main(String[] args) {
		//정수를 계속 입력받다가 (힌트 : 정수, 반복문)
		//100이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 (힌트 : 종료조건 - 100이상의 수 입력)
		//합계와 평균을 출력하는 프로그램을 작성하시오.(힌트 : 합계, 평균)
		//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0, sum = 0, loopCnt =0;
		double  avg = 0.0, dLoofCnt = 0.0;
		//이부분에서 0으로 초기화 시켜주는 이유는 뭔가요?
		/*
		 * 답 : 변수의 법칙에서 초기화 안한 변수를 선언할 수 없다. 
		 */
		
		while(true) {
			userInput = scan.nextInt();
			sum = sum + userInput;
			loopCnt++;
			
			if(userInput >= 100) break;
		}//while
		
		//자바는 소수점 몇째자리에서 반올림 하는 개념이 없다. 
		//자바는 반올림하면 무조건 정수. 
		dLoofCnt = loopCnt;
		avg = sum / dLoofCnt * 10; //소수점 첫째자리 : 내가원하는 반올림 자리수로 * 10 
		avg = Math.round(avg);
		avg = avg / 10; // 내가원하는 반올림 자리수로 소수점 출력을 위해 다시 /10
		System.out.println("합계 :"+ sum);
		System.out.println("평균 :"+ avg);
		scan.close();
		
	}//main
}//class
