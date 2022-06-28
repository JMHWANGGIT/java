package ch03;

public class Ch03Ex35 {
	public static void main(String[] args) {
		//break; 를 사용하여 while문을 종료시키자. 
		
		int loofCount = 0; //초기식
		
		while(true) { //0 1 2 
			System.out.println("반복문");
			
			if (loofCount == 2) break; //조건비교식 // if문의 내용이 딱 한 줄일때만 중괄호 생략 가능. 
			
			loofCount++; //증감식
			
		}//while
		
		
	}//main
}//class
