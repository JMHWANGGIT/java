package ch03;

public class Ch03Ex57 {
	public static void main(String[] args) {
		//홀수출력
		//짝수출력 
		//1~100까지!
		
		for (int i = 1; i <= 100; i++) {
			//홀수출력 1 
			if(i % 2 == 1 ) System.out.print(i + "\t");
		}//for
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if(i %2 == 0) continue;
			System.out.print(i + "\t");
		}//for
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if(!(i % 2 == 0)) 
			System.out.print(i + "\t");
		}//for
		System.out.println();
		//1에서 100까지 짝수출력 
		for (int i = 1; i <= 100; i++) {
			if( i % 2 == 0 ) System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if(i %2 == 1) continue;
			System.out.print(i + "\t");
		}//for
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			if(!(i % 2 == 1)) 
			System.out.print(i + "\t");
		}//for
		System.out.println();
	}//main
}//class
