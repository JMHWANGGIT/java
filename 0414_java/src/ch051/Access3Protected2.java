package ch051;

import ch051.access.protectedObject;

public class Access3Protected2 {
	public static void main(String[] args) {
		
		protectedObject obj = new protectedObject();
		//System.out.println(obj.protectedStr); //protected 변수는 다른 폴더에서는 접근 불가능
		//obj.protectedPrint(); //protected 변수는 다른 폴더에서는 접근 불가능
		
	}//main
}//class
