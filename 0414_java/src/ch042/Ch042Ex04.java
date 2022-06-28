package ch042;
/*
 * 멤버 변수 : class를 구성하는 변수 : class의 속성 예) 사람(class)의 이름(멤버변수)처럼.   
 * 지역 변수 : 메소드의 작업에 필요한 변수 : (), {}내부에 존재하는 변수 
 * 	      : 메소드가 실행될때만 만들어졌다가, 메소드가 종료되면 사라진다.
 * 		  : 지역변수는 선언된 (),{}를 벗어나면 밖에서는 접근이 안된다.  
 * - 멤버변수와 지역변수는 같은 이름을 사용할 수 있으나, 일반적으로 같은 변수명은 피함. 
 * - 멤버변수와 지역변수의 이름이 같을때, 지역 변수를 먼저 적용. 
 */
//멤버변수는 파랑색, 지역변수는 갈색. 

class LocalVarTest {
	int memberInt = 999;
	void print() {
		int localInt = 333;//print() 실행 시에만 생성되는 지역변수. 
		System.out.println("locaiInt : " + localInt);
		int memberInt = 555;
		System.out.println("local memberInt : " + memberInt);//멤버변수, 지역변수 이름이 같을때! 지역변수 우선! 
		System.out.println("this.memberInt : " + this.memberInt);//this : 나 자신(현재 class를 지칭)
	}//print
}
public class Ch042Ex04 {
	public static void main(String[] args) {
		
		{
			int iVar1 = 777;//지역변수 : 자신을 선언한 {} 밖에서는 접근이 안됨 
			System.out.println("main의 지역변수 : " + iVar1);
		}
		//System.out.println(iVar1);
		LocalVarTest test = new LocalVarTest();
		test.print();
		
		
	}//main
}//class
