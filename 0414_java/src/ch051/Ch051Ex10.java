package ch051;
/*
 * method override(ing) ★★★★★ (기술면접!) (method overload와 비교해서 물어봄)
 * method override(ing) : 메소드 덮어쓰기 : 메소드 재정의  
 * - 부모 타입에 선언된 메소드를 자식 타입에서 재정의하는 것 
 * - 부모 타입에 선언된 메소드와 이름, arguments 같아야 한다. 
 * - method override(ing)된 메소드는 호출 될 때, 자식 타입에 재정의된 메소드가 호출된다. 
 * 
 * method override(ing)을 사용하는 이유? 장점. 
 * - 자식타입의 객체에 통일된 메소드를 두어서, 부모 타입에서도 자식 타입 고유의 메소드를 실행할 수 있다. 
 * - 부모 타입의 변수로 접근 불가능한 자식 타입의 고유 영역에 접근 가능. 
 */

/*
 * Method Overload(ing) ★★★★★ (기술면접)
 * - 하나의 class에 arguments가 다르고, 이름은 동일한 메소드를 여러개 선언 가능하다.
 * - 기능적으로 같으나, 수행을 위해 받는 데이터가 다른 경우. 
 * - 예 ) System.out.println("문자열"); System.out.println(123);
 * - 동일한 기능을 수행 한다면, 다루는 데이터가 다르더라도, 
 * 하나의 통일된 이름으로 접근하는 것이 복잡도를 낮춘다.(편리하다)
 *     
*/

class Ch051Parent2 {
	String parentVar = "parent";
	void print() {} //부모 타입 변수의 인식범위를 넓힘.(확장) 
}//class

class Ch051Child2 extends Ch051Parent2 {
	String childVar = "child";
	
	void print() {
		System.out.println(childVar);
	}//print
}//class

public class Ch051Ex10 {
	public static void main(String[] args) {
		
		Ch051Parent2 p = new Ch051Child2();
		System.out.println(p.parentVar);
		//System.out.println(p.childVar); //error
		p.print(); //error
		/*이유 : p는 자신을 선언한 Ch051Parent2의 멤버만 참고 가능. 
		*		-> child class의 멤버는 참고 불가능. -> 당연함.
		*  -> 극복방법 존재 : method override : method overriding
		*  		-> p의 인식범위를 넓혀준다. 
		*  		-> 자식에 선언된 메소드와 같은 이름 + 같은 arguement의 메소드를 부모에 선언   
		*/
	}//main
}//class
