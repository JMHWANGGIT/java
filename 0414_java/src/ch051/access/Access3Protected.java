package ch051.access;

public class Access3Protected {
	public static void main(String[] args) {
		
		protectedObject obj = new protectedObject();
		System.out.println(obj.protectedStr);
		obj.protectedPrint();
		
	}//main
}//class
