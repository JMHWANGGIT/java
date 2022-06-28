package ch051.access;

public class DefaultObject {

	String defaultStr = "String of default modifiers";
	
	public String defaultStr2 = "String of public modifiers";
	
	
	void defaultPrint() {
		System.out.println("defaultStr : " + defaultStr);
	}//defaultPrint
	
	public void defaultPrint2() {
		System.out.println("defaultStr2 : " + defaultStr2);
	}//defaultPrint2
	
}//class
