package ch03;

public class Ch03Ex49 {
	public static void main(String[] args) {
		
		for(int line = 1; line <= 10; line++) {
			
			System.out.printf("%d 라인 : ", line);
			
			for(int item = 10; item >= 1; item--) {
				
				System.out.print("*");
				
				if(line == item) {
					break;
				}//if
				
			}//for2
			
			System.out.println();
			
		}//for1
		
	}//main
	
}//class
