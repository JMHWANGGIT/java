package ch042;
/*
 * method call : 메소드는 다른 메소드를 호출할 수 있다. : 메소드 호출의 흐름.
 * - 메소드 호출의 흐름.  
 */
public class Ch042Ex09 {
	public static void main(String[] args) {
		System.out.println("main start"); //수행순서 1
		Ch042Ex09 test = new Ch042Ex09();// 수행순서 2
		test.worker1();//수행순서 3 
		System.out.println("main end"); //수행순서 9
		
	}//main
	
	
	void worker1() {
		System.out.println("<<<<< worker1 start"); //수행순서 4
		worker2(); //수행순서 5
		System.out.println("<<<<< worker1 end"); //수행순서 8
	}//worker1
	
	
	void worker2() {
		System.out.println("     >>> worker2 start"); //수행순서 6
		System.out.println("     >>> worker2 end"); //수행순서 7
	}//worker2
}//class
