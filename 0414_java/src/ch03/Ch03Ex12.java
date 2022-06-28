package ch03;

import java.util.Scanner;
//내가 원하는 class 파일의 위치를 지정하는 것. 
//java폴더 내부에 util 폴더 안에 Scanner.class라는 파일을 가져온다는 표현. 

/*
 * Scanner - JDK가 제공하는 입력기
 * Scanner scan = new Scanner(System.in);
 * System.in : 키보드에서 입력받는 값들이 저장되는 입력 버퍼(메모리)
 * 키보드 입력하면 입력 버퍼의 중간 저장. -> Scanner를 통해 중간 저장된 값을 읽어온다. 
 * 
 */
public class Ch03Ex12 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0에서 21억 미만의 정수를 입력하세요~ :");
		int iVar = scan.nextInt();
		System.out.println("your input : " + iVar);
		
		
		
		System.out.println("실수를 입력하셔요 :");
		Double dVar = scan.nextDouble();
		System.out.println("your input : " + dVar);
		
		
		System.out.println("단어를 입력하셔요 :");
		String str1 = scan.next();
		System.out.println("your input : " + str1);
		
		
		scan.nextLine();
		
		System.out.println("문장을 입력하셔요 :");
		String str2 = scan.nextLine();
		System.out.println("your input : " + str2);
		
		scan.close(); //반드시! 안하고 축적되면 컴퓨터 다운됨 
		

	}//main

}//class
