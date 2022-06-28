package ch052;

/*
 * interface : 특별한 class :  class의 한 종류 
 * - abstract method로만 이루어진 특별한 class
 * - class 대신 interface 선언을 사용 
 * 	-> 예) public interface Saram {}
 * 
 * - 변수는 fanal static 변수만 사용한다. 
 * - 정상적인 일반 메소드는 사용 못한다. 
 * - 메소드는 오직 abstraact method만 사용 가능하다. 
 * - new를 통한 instance 생성이 불가능하다. 
 * - interface를 상속받는 클래스에게 abstract method의 구현을 강제한다. 
 */

/*
 * interface의 탄생 배경
 * - abstract 메소드를 상속시켜서, 상속받는 클래스에게 메소드 구현을 강제하고 싶은데 
 * - 자바는 단일 상속만 가능 
 * - 기능적으로는 abstract class와 같고 
 * - 이미 상속을 받는 클래스에게 intreface를 상속시켜서 
 * 	 상속받는 클래스에게 메소드 구현을 강제하기 위해 만들어짐. 
 */

interface Interface1 {
	public int iVAr1 = 777;// 자동으로 final static
	public int iVAr2 = 888;//final static
	
	
	//public void normalMethod() {}//error
	
	public abstract void abstaractMethod1();// abstract method
	public void abstaractMethod2(); // 자동으로 abstract method1
	
}//interface


public class Ch052Ex11 {
	public static void main(String[] args) {
		
	}//main	
}//class
