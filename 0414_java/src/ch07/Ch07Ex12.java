package ch07;


/*
 *  Ch07Ex11Test의 장점 
 *  - 어떤 형태의 객체도 변수가 될 수 있다. 
 *  
 *  Ch07Ex11Test의 단점
 *  - 아무형태의 객체도 변수가 될 수 있다. 
 *  
 *  Ch07Ex11Test의 단점 극복 
 *  - T를 제한하자!! 
 *  
 *  <T extends 특정 클래스> 
 *  -특정클래스를 상속받은 클래스들만 <>에 들어갈 수 있다. 
 */

class Ch07Person {
	String name;
	Ch07Person(String name){
		this.name = name;
	}//Ch07Person()
	@Override
	public String toString() {
		return this.name;
	}//toString()
}//Ch07Person


class Male extends Ch07Person {
	Male(String name) {
		super(name);
	}//Male()
}//Male

class Female extends Ch07Person {
	Female(String name) {
		super(name);
	}//Female()
}//Female


class Ch07Ex12Test<T extends Ch07Person> {// new Ch07Ex12Test<>();
	private T name;
	private String str;
	
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	
}//Ch07Ex11Test

public class Ch07Ex12 {
	public static void main(String[] args) {
		//Ch07Ex12Test<Integer> test1 = new Ch07Ex12Test<Integer>();
		//Ch07Ex12Test<String> test2 = new Ch07Ex12Test<String>();
		Ch07Ex12Test<Male> test3 = new Ch07Ex12Test<Male>();
		Ch07Ex12Test<Female> test4 = new Ch07Ex12Test<Female>();
	}//main
}//class

