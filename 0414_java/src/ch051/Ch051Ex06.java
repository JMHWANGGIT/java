package ch051;

import java.util.Scanner;

public class Ch051Ex06 {
	public static void main(String[] args) {
		
		People [] peoples = new People[10];
		Scanner scan = new Scanner(System.in);
		//0: 종료 , 1: 입력, 2: 출력
		//11: teacher 입력, 12: student 입력 
		
		int mainMenuNo = 0, subMenuNo = 0, arrIndex = 0;
		
		while(true) {
			System.out.println("\n=== 학교 인사 관리 시스템 ===");
			System.out.print("0: 종료 , 1: 입력, 2: 출력, 선택하세요 : ");
			mainMenuNo = scan.nextInt(); 
			if(mainMenuNo == 0) {
				System.out.println("===학교 인사 관리 시스템을 종료합니다.===");
				scan.close(); 
				break;
			} else if(mainMenuNo == 1) {
				System.out.print("11: teacher 입력, 12: student 입력, 선택하시오! : ");
				subMenuNo = scan.nextInt(); //숫자입력 + 엔터키 누름 
				scan.nextLine();
				if(subMenuNo == 11) {
					Teacher t = new Teacher();
					System.out.print("familyname : ");
					t.familyName = scan.nextLine();
					System.out.print("name : ");
					t.name = scan.nextLine();
					System.out.print("subject : ");
					t.subject = scan.nextLine();
					System.out.print("payaccount : ");
					t.payAccount = scan.nextLine();
					peoples[arrIndex] = t;
					arrIndex ++;
				} else if(subMenuNo == 12) {
					Student s = new Student();
					System.out.print("familyname : ");
					s.familyName = scan.nextLine();
					System.out.print("name : ");
					s.name = scan.nextLine();
					System.out.print("grade : ");
					s.grade = scan.nextLine();
					System.out.print("ban : ");
					s.ban = scan.nextLine();
					peoples[arrIndex] = s;
					arrIndex ++;
				} else {
					System.out.println("=== wrong input. try again!! ===");
				}
				
			} else if(mainMenuNo == 2) {
				for (int i = 0; i < arrIndex; i++) {
					peoples[i].print();
				}//for
			} else {
				System.out.println("=== wrong input. try again!! ===");
			}
		}//while
		
	}//main
}//class
