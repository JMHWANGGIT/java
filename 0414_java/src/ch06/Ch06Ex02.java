package ch06;

public class Ch06Ex02 {
	public static void main(String[] args) {
		
		String str = null;
		//System.out.println(str.length());
		//NullPointerException ★★★★★
		
		int [] iArr = new int [3];
		//System.out.println(iArr[3]);
		//ArrayIndexOutOfBoundsException ★★★★★
		
		String str2 = new String("hi");
		//System.out.println(str2.charAt(2));
		//StringIndexOutOfBoundsException
		
		System.out.println( 7 / 0); 
		//ArithmeticException
		
		/*
		 * 문법적인 오류가 아니라 실행할 때 오류가 발생한다. 
		 */
		
	}//main
}//class
