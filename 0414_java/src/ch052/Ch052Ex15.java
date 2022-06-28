package ch052;
/*
 * inner class : class안에 class가 있다. 
 * - class 내부에 class선언이 가능하다. 
 * - 굳이??? -> 특수한 상황에서 사용한다. (일반적으로 많이 사용되지는 안한다) 
 * 		-> 특수한 상황 : 클래스가 1회용으로 사용되는 경우
 *  
 * instance inner class : member inner class
 * - class에 멤버가 위치한 자리에 선언되는 inner class
 * - new를 통해 객체 생성 
 * - 일반적인 class를 class 내부로 옮긴 형태를 갖는다 
 * - 외부 클래스를 생성한 후에 inner class를 생성한다. 
 * 	예 ) OuterClass out = new OuterClass();
 * 		-> OuterClass.InnerClass in = out.new.InnerClass();
 * 
 * static inner class  : static member inner class
 * - instance inner class를 static으로 선언한 것. 
 * - new 없이 자유로운 접근 가능 
 * 
 * local inner class 
 * - instance inner class를 메소드 안에 선언한 것 
 * - 메소드가 실행되는 동안만 존재 
 * - 메소드가 종료되면 없어진다 
 * 
 * anonymous inner class 
 * - 이름이 없는 inner class 
 * - 이름이 없으므로, 재사용 불가. 
 * - 일회용 
 * 
 */
public class Ch052Ex15 {
	
	//instance inner class : member inner class
	
	protected class InnerB {}//class InnerB
	
	class InnerC {}//class InnerC
	
	private class InnerD {}//class InnerD
	
	public abstract class InnerE {}//abstract class InnerE
	
	public interface InnerF {}
	public interface InnerG {}
	public interface InnerH extends InnerG{}
	
	public class InnerI extends InnerB implements InnerF, InnerG {}
	
	public class InnerA {
		public String inStr = "inner class A";
		private int inIVar;
		public InnerA () {
			this.inIVar = 777; //this 주의! : 자신이 사용된 곳을 의미 (Innerclass만을 지칭) 
		}
		private void printInnerA() {
			System.out.println("inStr : " + inStr);
		}
		
		public String getInStr() {
			return inStr;
		}
		public void setInStr(String inStr) {
			this.inStr = inStr;
		}
		public int getInIVar() {
			return inIVar;
		}
		public void setInIVar(int inIVar) {
			this.inIVar = inIVar;
		}
		
	}//class InnerA
	
	public static void main(String[] args) {
		Ch052Ex15 test = new Ch052Ex15();
		InnerA inA = test.new InnerA();
		inA.printInnerA();
		inA.setInIVar(999);
		System.out.println(inA.getInIVar());
		
	}//main
	
}//class
