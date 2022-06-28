package ch03;

import java.util.Scanner;
//import : 가져와라 : 왜? 내가 필요하니까!  
//java.util.Scanner : Scanner class file의 위치 
// java 폴더 안에 util 폴더 안에 Scanner class file 위치 

public class Ch03Ex13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Scanner : 손쉽게 키보드입력을 받아 준다. 
		//System.in : 입력 버퍼 : 키보드에서 입력된 값들이 대기하는 곳 
		//scan.nextInt() : 정수 가져오기 
		//scan.nextDouble() : 실수 가져오기
		//scan.next() : 단어 가져오기
		//scan.nextLine() : 문장 가져오기 : 엔터값을 가져온다. : 버려진 엔터값도 가져온다. 
		
		System.out.print("정수(0~21억) 입력 : ");
		int iVar = scan.nextInt();
		System.out.println("your Input : " + iVar);
		
		
		scan.nextLine(); //버려진 엔터값을 받아서 사라지는 문장을 추가.
		String sentence = scan.nextLine();
		System.out.println("sentence : [" +sentence +"]");
		
		
		scan.close(); // 반드시 close.//안하면 현장에서 욕먹음. 
	}//main
}//class
