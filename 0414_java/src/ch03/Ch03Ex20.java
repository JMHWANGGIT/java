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

public class Ch03Ex20 {
	public static void main(String[] args) {
		
		
		//놀이동산 티켓에 대한 내용 
		int ticket = 2; // 0:없음, 1:종일권, 2:오전권, 3:오후권, 4:야간권.
		
		if(ticket == 1) {//티켓이 있다면, 환영해라. 
			System.out.println("놀이동산에 오신 것을 환영합니다.");
		} else if (ticket == 2){//티켓이 오전권이면 오후3시에 퇴장을 안내해라.
			System.out.println("오후 3시에 퇴장을 안내한다.");
		} else if (ticket == 3){
			System.out.println("오후 3시에 입장을 안내한다.");
		} else if (ticket == 4){
			System.out.println("오후 6시에 입장을 안내한다");
		} else {//나머지는 매표소로 안내해라
		
			System.out.println("매표소를 안내한다.");
		}
		
		
		
	}//main
	
}//class
