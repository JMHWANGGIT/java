package ch051;

import ch051.access.protectedObject;

public class Access3Protected3 extends protectedObject {
	public static void main(String[] args) {
		
		protectedObject obj = new protectedObject();
		//System.out.println(obj.protectedStr); //protected 변수는 다른 폴더에서는 접근 불가능 
		//obj.protectedStr;//protected 메소드는 다른 폴더에서는 접근 불가능
		
		Access3Protected3 test = new Access3Protected3();
		test.protectedStr = "protected 변수는 상속 후 접근 가능"; //protected 변수는 상속 후 접근 가능
		test.protectedPrint();//protected 메소드도 상속 후 접근 가능
		
		
	}//main
}//class
