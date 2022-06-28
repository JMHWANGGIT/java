package ch06;

/*
 * throw : 예외를발생시키는(활동시키는)표현(문법, 키워드)
 */

public class Ch06Ex061 {
	public static void main(String[] args) {
		
		new NullPointerException(); //예외객체를 생성했음. 활동은 아직.(표현이 안됨, 바이러스잠복기) 
		System.out.println("after new Null Pointer Exception");
		throw new StringIndexOutOfBoundsException();//예외객체 생성 미 활동시작.
		//System.out.println("after new StringIndexOutOfBoundsException");
		
		
	}//main
}//class
