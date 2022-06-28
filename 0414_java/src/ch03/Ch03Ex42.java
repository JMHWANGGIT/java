package ch03;

public class Ch03Ex42 {
	public static void main(String[] args) {
		//구구단
		
		for(int dan = 2; dan <= 9; dan++) {
			//System.out.println();
			System.out.println("=====" + dan + " 단=====\n");
			
			for(int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d * %d = %d\t",dan,gop,dan*gop);
				if(gop % 3 ==0) System.out.println();
			}//for2
			
			//System.out.println();
		}//for1
	}//main
}//class
