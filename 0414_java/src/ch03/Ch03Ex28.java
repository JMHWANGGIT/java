package ch03;

/*
 * switch ~ case : 분기문 (branch statement)
 * - 단순 비교
 * - switch(비교하려는 값) {case 값 : 값이 같으면 수행;}
 * - (비교하려는 값)에는 byte, short, int, long, char, string만 들어감. 
 */
public class Ch03Ex28 {
	
	
	public static void main(String[] args) {
	
		
		//switch ~ case의 문제점과 해결.
		//switch ~ case의 문제점 : break; 가 없다. (해당되는 부분부터 아래라인 전부를 실행) 
		
		//문제점
		System.out.println("break 이전 =================");
		switch(1) {
		case 0 : System.out.println("switch의 값이 case 값이 다르다");
		case 1 : System.out.println("switch의 값이 case 값이 같다");
		case 2 : System.out.println("switch의 값이 case 값이 다르다2");
		}//switch
		
		System.out.println("break 이후 =================");

		//switch ~ case의 문제점의 해결방법 : break; 를 달아준다. (해당되는 부분만 실행)
		switch(1) {
		case 0 : System.out.println("switch의 값이 case 값이 다르다"); break;
		case 1 : System.out.println("switch의 값이 case 값이 같다"); break;
		case 2 : System.out.println("switch의 값이 case 값이 다르다2"); break;
		}//switch
		
		
	}//main
}//class


