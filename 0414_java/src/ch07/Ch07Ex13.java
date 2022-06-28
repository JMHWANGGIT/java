package ch07;

//생성자를 통해 T의 값을 대입
class Ch07Ex13Test<T> {
	private T var;
	Ch07Ex13Test(T t){ //생성자에서의 제네릭.
		this.var = t;
	}//Ch07Ex13Test()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.var.toString();
	}
}//Ch07Ex13Test<T> class

public class Ch07Ex13 {
	public static void main(String[] args) {
		Ch07Ex13Test<Integer> test1 = new Ch07Ex13Test<Integer>(777);
		System.out.println(test1.toString());
		
		Ch07Ex13Test<String> test2 = new Ch07Ex13Test<String>("nice shot!");
		System.out.println(test2.toString());
		
		Ch07Ex13Test<Ch07MyGObj> test3 = new Ch07Ex13Test<Ch07MyGObj>(new Ch07MyGObj("good day!"));
		System.out.println(test3.toString());
	}//main
}//class
