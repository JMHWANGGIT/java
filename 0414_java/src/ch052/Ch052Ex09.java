package ch052;
/*
 * abstract class : 추상클래스 
 * - 하나이상의 abstract(추상) 메소드를 가진 클래스
 * - 정상적인 형태의 메소드를 가질 수 있다. 
 * - instance 생성 불가능(new  불가능) 
 * 
 * - 상속을 받는 class에게 추상 메소드의 구현을 강제한다. ★★★★★
 * - 상속을 받는 class는 추상 메소드를 반드시 구현해야 한다. 
 * 	-> 그렇지 않으면 instance 생성 불가.(new가 안되니깐)  ★★★★★
 * 
 * - polymorphism 적용이 가능하다. 
 * 	-> Heterogeneous Collection, Polymorphic Arguments
 * 	-> Object Data type Casting, instanceof 등
 */
public abstract class Ch052Ex09 {

	//public abstract int iVar = 777; //error //abstract 변수는 없다. 
	public int normalVar = 777;  // 정상적인 멤버변수를 가질 수 있다.
	public static int staticVar = 777; //정상적인 static 멤버변수를 가질 수 있다. 
	public final static int finalVar = 777; //정상적인 final 멤버변수를 가질 수 있다. 
	
	
	public abstract void abstractMethod(); 
	
	public void normalMethod() {} 
	//abstract class는 정상적인 형태의 메소드를 가질 수 있다. 
		
}//class
