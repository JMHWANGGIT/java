package ch06;

public class Ex02 {
	public static void main(String[] args) {
		
			
			String year = "1994";
			int age = 2022 - Integer.parseInt(year);
			System.out.println("나이 :"+age);
			System.out.println("======================");
			
		try {
				
			String year2 = "1994년";
			int age2 = 2022 - Integer.parseInt(year2);
			System.out.println("나이 :"+age2);
			
		} catch (NumberFormatException e) {
			System.out.println(" 에러발생~! ");
		}
		//정상종료 가능.
		System.out.println("수고하셨습니다.");
		
		
		
		
	}//main
}//class
