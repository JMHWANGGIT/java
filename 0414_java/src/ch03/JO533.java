package ch03;

import java.util.Scanner;

public class JO533 {
	public static void main(String[] args) {
		//남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
		//성별('M', 'F')과 나이를 입력받아 
		//"MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 
		//출력하는 프로그램을 작성하시오.
		// 입력 예 ) F 15
		// 출력 예 ) Girl 
		
		Scanner scan = new Scanner(System.in);
		String male = scan.next();
		int age = scan.nextInt();
		
		if (age >= 18) {
			
			if (male.equals("M")) {
				System.out.println("MAN");
			}else if (male.equals("F")) {
				System.out.println("WOMAN");
			}else {
				System.out.println("잘못입력하셨습니다.");
				System.exit(0);
			}//else
			
		} else {
			
			if (male.equals("M")) {
				System.out.println("BOY");
			}else if (male.equals("F")) {
				System.out.println("GIRL");
			}else {
				System.out.println("잘못입력하셨습니다.");
				System.exit(0);
			}//else
			
		}//else
		
	}//main
}//string
