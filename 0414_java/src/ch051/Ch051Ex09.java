package ch051;

import java.util.Scanner;

public class Ch051Ex09 {
	public static void main(String[] args) {
		
		People [] peoples = new People [10]; //추가
		int arrayIndex= 0; //추가 (몇개의 손님을 받았는지 카운트 해보자!)
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
					
					Teacher t = new Teacher();
					
					System.out.print("familyname : ");
					t.familyName = scan.next();
					System.out.print("name : ");
					t.name = scan.next();
					System.out.print("address : ");
					t.address = scan.next();
					System.out.print("tel : ");
					t.tel = scan.next();
					System.out.print("subject : ");
					t.subject = scan.next();
					System.out.print("payAccount : ");
					t.payAccount = scan.next();
					peoples[arrayIndex] = t;//arrayindex 0번지의 teacher의 data를 채워라
					arrayIndex++; //arrayindex에 더해라 
				}else if (subMenuNo == 12) {
					System.out.println("student : 공사중");
				} else {
					System.out.println("잘못된 입력 다시해보슈! ");
					continue;
				}//if2
			} else if (mainMenuNo == 2) {
				for (int i = 0; i < arrayIndex; i++) {
					peoples[i].print();
				}
			} else {
				System.out.println("잘못된 입력이오~! 다시 입력하시오! ");
			}//if
		}//while
		
	}//main
}//class