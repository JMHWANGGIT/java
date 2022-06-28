package ch03;

public class Ch03Ex38 {
	public static void main(String[] args) {
		//구구단
		
		int dan = 2; //초기식1 : 2단부터 
		while (dan <= 9) {//조건비교식1 : 9단까지  
			
			System.out.println("=====" + dan + "단 =====");
			
			int gop = 1; //초기식2 : 1부터 
			while(gop <= 9) {//조건비교식 : 곱할값 9까지 
				System.out.printf("%d * %d = %d\t", dan, gop, dan*gop);
				gop++;//증감식2
			}
			
			System.out.println(); //줄바꿈
			dan++; //증감식1
		}//while
		
	}//main
}//class
