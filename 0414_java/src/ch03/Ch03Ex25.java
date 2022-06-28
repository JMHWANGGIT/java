package ch03;

import java.util.Scanner;

public class Ch03Ex25 {

		/*
		 *  하이/로우게임
		 *  0 ~ 9까지의 수 중에 
		 *  첫번째 수를 보여주고 
		 *  두번째 수가 첫번째 수보다 
		 *  높은지 낮은지 선택하는 게임  
		 */
		 
	public static void main(String[] args) {
		
		//module1 - 0 ~ 9까지의 수 중에 첫번째 수를 발생시켜 보여준다.
		int fNum = (int) (Math.random()*10);
		System.out.println("첫번째 숫자 :" + fNum);
		
		//module2 - 0 ~ 9까지의 수 중에 두번째 수를 발생시켜 보관한다. 
		int sNum = (int) (Math.random()*10);
		
		//module3 - user의 판단을 입력받는다. 
		System.out.println("당신의 선택은 무엇입니까?");
		System.out.print("두번째 숫자가 높다 1 / 첫번째 숫자가 높다 2 : ");
		Scanner scan = new Scanner(System.in);
		int yourChoice = scan.nextInt();
		scan.close();
		System.out.println("당신의 선택은? : "+ yourChoice);
		System.out.println("두번째 숫자 : "+sNum);
		
		//module4 - 결과를 보여준다. 
		
		
		if (yourChoice >= 1 && yourChoice <= 2) {
			if(fNum == sNum) {
				System.out.println("무승부");
				}else if (yourChoice == 1) {//high
				
				if(fNum < sNum) {
					System.out.println("딩동댕!!");
				} else {
					System.out.println("땡!");
				}//else
				
				} else if(yourChoice == 2) { //Low
					
					if(fNum < sNum) {
						System.out.println("땡!!");
					} else {
						System.out.println("딩동댕!");
					}//else
					
				}//else
			
		}else {
			System.out.println("입력값이 올바르지 않습니다.");
		}

	}//main

}//class
