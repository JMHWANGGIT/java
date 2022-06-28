package ch042;

//멤버변수와 지역변수의 이름이 같을 때, 지역변수를 먼저 적용. 
//사용은 권장하지 않음.

class Ch042Dummy2 {
	
	String memverVar = "멤버 변수";
	
	void print() {
		String memverVar ="지역 변수";
		System.out.println("memberVar : "+ memverVar);
		System.out.println("memberVar 멤버변수 : " + this.memverVar);
		/*
		 * this.memverVar 
		 * ~ . : ~ 의 안에 있다. (a.b : a안에 b있다.) 
		 * - this 안에 memverVar라는 의미 
		 * - 그렇다면 this는? 현재 instance(정확한 의미) 
		 * - 그렇다면 this는? 현재 class(이해를 돕기 위해) 
		 */
	}//print
}//class

public class Ch042Ex07 {
	public static void main(String[] args) {
		
		Ch042Dummy2 dummy = new Ch042Dummy2(); //instance
		dummy.print();
		
		Ch042Dummy2 dummy2 = new Ch042Dummy2(); //instance
		dummy2.memverVar = "더미2 인스턴스";
		dummy2.print();
		
	}//main
}//class
