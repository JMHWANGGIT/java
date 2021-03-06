package ch052;

/*
 * static initializer
 * - static은 class load할 때 최초의 1번만 실행된다. 
 * - class load할 때, 최초의 1번만 실행하고 싶은 부분이 있다면?
 * 	-> static initializer를 사용해라.
 * 주의!! 
 * -> 서버 프로그램을 짜면 static의 존재는 서버를 끄기 전까지 살아있음. 
 * 	-> 남발하면 서버성능 저하. 
 */
public class Ch052Ex07 {
	
	public static int staticInt1;
	public static int staticInt2;
	
	static {
		staticInt1 = 777;
		System.out.println("Ch052Ex07의 class가 load되고 있습니다.");
	}
	
	public static void main(String[] args) {
		
		System.out.println(staticInt1);
		System.out.println(staticInt2);
		
	}//main
}//class
