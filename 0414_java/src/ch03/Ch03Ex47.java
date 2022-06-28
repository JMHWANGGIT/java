package ch03;

public class Ch03Ex47 {
	public static void main(String[] args) {
		//Ch46을 for문으로 변경하라. 
		for(int dan = 1; dan <= 10; dan++) {
			
			for(int gop = 1; gop <= 10; gop++) {
				System.out.print("*");
				if(dan == gop) {
					break;
				}//if
			}//for2
			
			System.out.println("");
		}//for1
		
		
	}//main
}//class

