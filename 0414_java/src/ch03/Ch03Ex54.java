package ch03;

/*
 * do ~ while문
 * - while문은 false이면 수행안함. 
 * - do ~ while문은 false이어도 최초 1회 수행하는 문장. 
 */
public class Ch03Ex54 {
	public static void main(String[] args) {
		
		/*
		while(false) {
			System.out.println("실행 불가 코드");
		}//while
		*/
		
		do {
			System.out.println("최초 1행 시행 후, (조건 비교)실행");
		}while(false);
		
	}//main
}//class
