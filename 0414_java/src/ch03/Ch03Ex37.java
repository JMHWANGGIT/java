package ch03;

public class Ch03Ex37 {
	public static void main(String[] args) {
		//while문에 중첩 : 기억할 점! 위치!(초기식, 증감식, 조건비교식)를 꼭 기억하라! 
		
		int hak = 1; //학년 (초기식1) 
		while(hak <= 3) {//조건 비교식1
			System.out.println(hak + "학년");
			//학년별 10반까지 출력해라.
			
			int ban = 1;// 초기식2 : 1반부터
			while(ban <= 10) {//조건비교식2 : 10반까지 
				System.out.print("\t" + ban + " 반");
				ban++;//증감식2
			}//while2
			
			System.out.println();
			hak++; //증감식1
		}//while
		
		
		
		
	}//main
}//class
