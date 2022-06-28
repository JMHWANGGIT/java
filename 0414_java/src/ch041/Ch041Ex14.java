package ch041;

import java.util.Arrays;

public class Ch041Ex14 {
	public static void main(String[] args) {//9 * 9 단 
		
		int [][] str = new int [10][10];//index : 0 ~ 8까지 // 1 ~ 9가 편하다.
		for(int i = 1; i < str.length; i++ ) {
			
			for (int j = 1; j < str.length; j++) {
				str [i][j] = i * j;
			}//for2
			
		}//for
		
		for(int k = 0; k < str.length; k++) {
			System.out.println(Arrays.toString(str[k]));
			}
		
	}//main
}//class
