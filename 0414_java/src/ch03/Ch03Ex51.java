package ch03;

public class Ch03Ex51 {
	public static void main(String[] args) {
		
		for(int line =1; line <= 10; line++) {
			for(int item2 = 10; item2 >=1; item2--) {
				System.out.print(" ");
				if(line == item2) break;
			}//for2-1
			
			
			for (int item = 1; item <= 10; item++) {
				System.out.print("*");
				if(line == item) break;
			}//for 2-2
			
			System.out.println();
		
		}//for1
	}//main
}//class
