package ch051;

/*
 * Inheritance : 상속, 설계개념 
 * - 하나의 class의 유전적 특징 (멤버 메소드, 멤버 변수)를 또다른 class에 이식하는 방법 
 * - 유전적 특징을 주는 class : parent, super, 상위, 부모 class
 * - 유전적 특징을 받는 class : child, sub, 하위, 자식 class
 * - extends : 상속을 만드는 문법 : 확장한다는 의미 
 * - Child extends parent : Child는 Parent를 확장했다. (뿌리가 Parent)
 * - Parent : family name(성씨 홍), child : name(이름, 길동) 
 * - JAVA에서는 단일 상속만 지원 : extends 뒤에 단 하나의 class만 온다.
 * - 상속 : is a relationship : 자식은 일종의 부모이다. 꺼꾸로 뒤집으면 안됨. 
 * - 박찬호는 투수다 0, 류현진은 투수다 0, 
 * -> 박찬호는 일종의 투수이다. 0,  류현진은 일종의 투수이다. 0 
 * - 투수는 류현진이다. X, -> 투수는 일종의 류현진이다. X 
 * - 박찬호는 류현진이다. X -> 박찬호는 일종의 류현진이다. X
 * - parent는 상위개념, child는 하위개념. 
 * 
 * - 하위 class는 상위 class의 일종이다. 
 */

class Ch051Parent {
	String familyname;
	void printParent() {
		System.out.println(familyname);
	}
}//class
/* Polymorphism : 다형성 : 다양한 형태를 갖는 성질 
* - 상속받은 개체(child)의 내부에는 부모객체가(parent)가 있다. 0 
*/
class Ch051Child extends Ch051Parent{
	String name;
	void printChild() {
		System.out.println(familyname + " " + name);
	}
}//class

public class Ch051Ex01 {
	public static void main(String[] args) {
		
		Ch051Child child = new Ch051Child();
		child.familyname = "Hong";
		child.printParent();
		child.name = "gil dong";
		child.printChild();
		
	}//main
}//class
