package ch03;

/*
 * if : 분기문 (branch statement)
 * - 조건에 따라 수행하거나 수행하지 않는 코드 블럭을 만든다. 
 * - if(수행조건) {수행코드}
 * - (수행조건)이 true면 {수행코드}를 수행 
 * - (수행조건)이 false면 {수행코드}를 수행하지 않는다.   
 */
public class Ch03Ex17 {
	public static void main(String[] args) {
		
		
		//놀이동산 티켓에 대한 내용 
		int ticket = 1; // 0:없음, 1:종일권
		
		if(ticket == 1) {
			System.out.println("놀이동산에 오신 것을 환영합니다.");
		}
		//티켓이 있다면, 환영해라. 
		
		
	}//main
	
}//class