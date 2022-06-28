package ch03;

import java.util.Iterator;

/*
 * for : 반복문 (Loop statement)
 * - 초기식, 조건식, 증감식을 한곳으로 모아놓은 형태. 
 * - for(초기식; 조건식; 증감식){수행코드}
 */
public class Ch03Ex40 {
	public static void main(String[] args) {
		
		//0에서 10까지 출력
		for(int endPoint = 0; endPoint <= 10; endPoint++) {
			System.out.print(endPoint + "\t");
		}//for
		
		//10에서 0까지 출력 
		for(int endPoint = 10; endPoint >= 0; endPoint--) {
			System.out.print(endPoint + "\t");
		}//for
		
	}//main
}//class
