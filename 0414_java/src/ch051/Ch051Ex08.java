package ch051;

import java.util.Scanner;

public class Ch051Ex08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int mainMenuNo = 0, subMenuNo = 0; 
		
		while(true) {
			System.out.print("0:종료, 1:입력, 2:출력, 선택 : ");
			mainMenuNo = scan.nextInt();
			if(mainMenuNo == 0) {
				System.out.println("bye~");
				scan.close();
				break;
			} else if (mainMenuNo == 1) {
				System.out.print("11: teacher, 12: student, 선택 : ");
				subMenuNo = scan.nextInt();
				if(subMenuNo == 11) {
					System.out.println("Teacher : 공사중");
				}else if (subMenuNo == 12) {
					System.out.println("student : 공사중");
				} else {
					System.out.println("잘못된 입력 다시해보슈! ");
					continue;
				}//if2
			} else if (mainMenuNo == 2) {
				System.out.println("출력 : 공사중");
			} else {
				System.out.println("잘못된 입력이오~! 다시 입력하시오! ");
				continue;
			}//if
		}//while
		
	}//main
}//class