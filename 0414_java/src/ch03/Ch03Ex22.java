package ch03;

/*
 * if : 분기문 (branch statement)
 * - 조건에 따라 수행하거나 수행하지 않는 코드 블럭을 만든다. 
 * - if(수행조건) {수행코드}
 * - (수행조건)이 true면 {수행코드}를 수행 
 * - (수행조건)이 false면 {수행코드}를 수행하지 않는다.
 * 
 * if ~ else  
 * - if (수행조건) {수행코드} ~ else {수행코드}
 * - (수행조건)이 true면 {수행코드}를 수행.
 * - (수행조건)이 false면 else {수행코드}를 수행.   
 */
/*
 * if ~ else if ~ else
 * - if (수행조건) {수행코드} 
 *   else if (else if 수행조건) {else if 수행코드}
 *   else {else 수행코드}
 * - (수행조건)이 true면 {수행코드}를 수행.
 * else if (수행조건)이 true면 else if {수행코드}를 수행.
 * (수행조건)도 false이고 else if (수행조건)도 false면, {else 수행 코드}를 수행. 
 */

//else if는 무한대로 추가 가능. 
//if는 무한대로 중첩이(if내부에 if) 가능.

public class Ch03Ex22 {
	public static void main(String[] args) {
		
		
		//놀이동산 티켓에 대한 내용 
		int ticket = 2; // 0:없음, 1:종일권, 2:오전권, 3:오후권, 4:야간권.
		
		
		if(ticket >= 1 && ticket <= 4) {
			
			if(ticket == 1) {
				System.out.println("놀이동산에 오신 것을 환영합니다.");
			} else if (ticket == 2) {
				System.out.println("오후 3시에 퇴장을 안내한다.");
			} else if (ticket == 3) {
				System.out.println("오후 3시에 입장을 안내한다.");
			} else { // ticket == 4
				System.out.println("오후 6시에 입장을 안내한다");
			}//else
			
		} else {
			
			if(ticket == 0) {
				System.out.println("매표소를 안내한다.");
			} else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.");
			}//else
			
		}//else
				
	}//main
	
}//class
