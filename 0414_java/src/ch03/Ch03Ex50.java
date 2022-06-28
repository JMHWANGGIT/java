package ch03;

public class Ch03Ex50 {
	public static void main(String[] args) {
		int line = 1; 
		while(line <= 10) {
			
			int item2 = 10;
			while(item2 >= 1) {
				System.out.print(" ");
				if(line == item2) {
					break;
				}
				item2--;
			}//while2-1
			
			
			int item = 1;
			while(item <= 10) {
				System.out.print("*");
				if(line == item) {
					break;
				}
				item++;
			}//while2-2
			
			System.out.println();//줄바꿈
			line++;
		}//while
	}//main
}//class
