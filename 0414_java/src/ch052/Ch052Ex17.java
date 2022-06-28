package ch052;

/*
 * inner class : class 안에 class 있다
 *  - class 내부에 class 선언이 가능하다
 *  - 굳이??? -> 특수한 상황에서 사용한다 (일반적으로 많이 사용 되지는 않는다)
 *     -> 클래스가 일회용으로 사용되는 경우
 * 
 * instance inner class : member inner class
 *  - class의 멤버가 위치한 자리에 선언되는 inner class
 *  - new를 통해 객체 생성
 *  - 일반적인 class를 class 내부로 옮긴 형태를 갖는다
 *  - 외부 클래스를 생성한 후에 inner class를 생성한다
 *     예) OuterClass out = new OuterClass();
 *         -> OuterClass.InnerClass in = out.new InnerClass();
 * 
 * static inner class : static member inner class
 *  - instance inner class를 static로 선언한 것
 *  - new 없이 자유로운 접근 가능
 * 
 * local inner class
 *  - instance inner class를 메소드 안에 선언한 것
 *  - 메소드가 실행되는 동안만 존재
 *  - 메소드가 종료되면 없어진다
 * 
 * anonymous inner class
 *  - 이름이 없는 inner class
 *  - 이름이 없으므로, 재 사용 불가
 *  - 일회용
 */

//static class StaticClass {}//error//inner class가 아니면, static class 불가능

public class Ch052Ex17 {

	public static class StaticInner {
		public static String staticInStr = "hello";//static 영역
		public static void printStr() {//static 영역
			System.out.println("staticInStr : " + staticInStr);
		}
		public static int staticInIVar = 999;//static 영역
		public static void printInt() {//static 영역
			System.out.println("staticInIVar : " + staticInIVar);
		}
	}//static class StaticInner

	public static void main(String[] args) {

		//static inner class는 접근(호출) 방법에 주의를 요함!!!
		Ch052Ex17.StaticInner.printInt();
		Ch052Ex17.StaticInner.staticInStr = "nice to meet you.";
		Ch052Ex17.StaticInner.printStr();

	}//main

}//class