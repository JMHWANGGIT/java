package ch06;

/*
 * return 
 * - 일반적인 사용법 : 메소드에서 수행결과를 메소드를 호출한 곳으로 보낼 때. 
 * - 특별한 사용법 : return 혼자 사용할 때는 메소드 종결(마침)의 의미. 
 */

public class Ch06Ex082 {
	
	public static int plus(int a, int b) {
		
		return a + b; //return의 일반적인 사용법 
		
	}//plus
	
	public static void returnTest() {
		
		return;//return이 홀로 쓰이면, 메소드 수행을 여기서 멈춰라 라는 의미가 된다. 
		//System.out.println();//실행되지 않는 코드; unrechable code
		/*
		 * 메소드는 다 리턴됨 자기가 호출된 곳으로!! void는 리턴이 생략될 뿐... 
		 * void : return에가다가 값을 보내주지 않는다. (값은 return 된다)
		 * 따라서 return에 값을 넣어주면 오류. 반면 return만 쓰면 값을 보내지 않고 멈추는 기능만 제공하기 때문에 사용가능. 
		 */
		
	}//returnTest()
	
	public static void main(String[] args) {
		
		int res = plus(7, 8);  //int res = 15;
		System.out.println(res);
		
		
		
		
	}//main
}//class
