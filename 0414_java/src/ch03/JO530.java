package ch03;
/*
 * 1. 나이를 입력받아
 * 2. 20살 이상이면 "adult"라고 출력하고 
 * 3. 그렇지 않으면 몇 년 후에 성인이 되는지를 "o years later"라는 메시지를 출력하는 프로그램 
 */
import java.util.Scanner;

public class JO530 {

	public static void main(String[] args) {
		
		//1. 나이를 입력받아
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		//2. 20살 이상이면 "adult"라고 출력하고
		if (age >= 20) {
			System.out.println("adult");
		//3. 그렇지 않으면 몇 년 후에 성인이 되는지를 "o years later"라는 메시지를 출력
		} else {
			int year = 20 - age;
			System.out.printf("%d years later", year);
		}
		
	}//main

}//class
