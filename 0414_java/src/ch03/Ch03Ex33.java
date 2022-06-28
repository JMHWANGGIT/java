package ch03;
/*
 * while (~하는 동안) : 반복문(Loop statement) 
 * while(반복 조건) {수행 코드} 
 * - (반복 조건)이 true인 동안, {수행 코드}를 계속 수행.
 * - (반복 조건)은 true/false를 나타내는 표현식이 들어간다.   
 */
public class Ch03Ex33 {

	public static void main(String[] args) {
		
		/*
		
		while (false) { //실행하지 않는다. while의 false는 실행하지 않는다. 
		 	//false를 만들었다는 자체. 죽은(쓰레기)코드를 만들었다는 뜻. 자동적으로 돌리지 않는다. 
		 	//원래 코드였으면 삭제해야하는 코드. 
		 	
			System.out.println("여기는 false");
			
		}//while 
		
		*/
		
		while(true) {// 무한루프(무한Loop) : 강제 종료 : 이것도 올바르지 않은 코드.
			System.out.println(1);
			System.out.println(2222222);
			System.out.println(333333333333L);
		}//while

	}//main

}//class
