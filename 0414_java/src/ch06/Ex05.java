package ch06;

public class Ex05 {
	
	//class 내부 : 생성자, 메소드, 변수 
	public static void main(String[] args) {
		
		System.out.println("main 메소드");
		//해당 클래스안에 존재하는 메소드를 사용하기 위해서 
		//해당 클래스를 객체로 만들었다. 
		Ex05 test = new Ex05();
		test.add();
		System.out.println("add() 호출 후 : " + test);
		int k = test.sub();
		System.out.println("sub() 호출 후 : " + k);
	}//main
	
	
	//메소드는 원래 있던 곳으로 되돌아간다. 
	//되돌아갈때 쓰는 자료형 
	//void는 호출한 곳으로 되돌아가지만 아무것도(값도)가지고 가지 않는다. 
	public void add() {
		System.out.println("합은 20입니다.");
	}
	
	// 반환형은 호출한 곳으로 되돌아 가면서 반환형에 맞는 자료나 값이나 데이터나 변수를 가지고 간다. 
	public int sub() {
		int su = 20;
		
		//return 20;
		return su;
	}
	
}//class
