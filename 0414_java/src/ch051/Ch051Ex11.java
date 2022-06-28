package ch051;
/*
 * polymorphic Argument : 다형성 응용 (편리를 확보)
 * - Arguments의 자리에 부모 타입의 변수를 사용하면,
 * 모든 자식 타입의 객체를 가져올 수 있다. 
 */

class Ch051Print {
	
	
//	void print(Teacher t) {
//		t.print();
//	}//print
//
//	void print(Student s) {
//		s.print();
//	}//print
	
	void print(People p) {
		//부모타입의 변수 p는 자식타입의 객체를 가져올 수 있다. 
		p.print();
	}//print
	
	
}//class

public class Ch051Ex11 {
	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.name = "길동";
		
		Student s = new Student();
		s.name = "감찬";
		
		Ch051Print p = new Ch051Print();
		p.print(t);
		p.print(s);
		
	}//main
}//class
