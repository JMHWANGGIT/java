package ch041;

import java.util.Arrays;

public class Ch041Ex056 {
	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		for (int i = 0; i < lotto.length; i++) {
			//임시값을 만들자! 
			int tmp = (int)(Math.random()*45+1);
			//중복을 제거 로직이 필요함! 
			
			
			//i = 0; -> 중복 비교대상이 없기 때문에 그냥 수를 입력해도 됨. 
			if(i == 0) lotto[i] = tmp;
			
			
			//i = 1; -> k = 0번지 값과 비교. 
			//i = 2; -> k = 0, 1번지 값과 비교.
			//i = 3; -> k = 0, 1, 2번지 값과 비교.
			//i = 4; -> k = 0, 1, 2, 3번지 값과 비교.
			//i = 5; -> k = 0, 1, 2, 3, 4번지 값과 비교.
			String dublication = "no"; 
			for(int k = 0; k < i; k++) {
				
				if(lotto[k] == tmp) {//지금 발생한 tmp 값은 이미 있는 값이다. // 중복되었음. 
					dublication = "yes";
					break; //입력 안하고 지나간다. 
				}//if
				
			}//for
			
			
			if(dublication.equals("no")) {//비교 결과, 같은 값이 없으면 값을 대입.
				lotto [i] = tmp;				
			} else {//비교 결과, 같은 값이 있으면 pass.-> 대입을 안했는데 i는 증가. -> i--;
				i--;
			}//if
			
			
		}//for
		
		Arrays.sort(lotto); 
		System.out.println("그냥 : "+lotto);
		System.out.println("array.tostring : " + Arrays.toString(lotto));
	}//main
}//class
