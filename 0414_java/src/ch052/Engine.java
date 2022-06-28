package ch052;
/*
 * 상속 구조 ====> Ch052Ex14 참고하시오!
 * - 이미 extends를 통해 상위 클래스를 상속받는 class들에게 
 * 	-> implements를 통해 interface를 상속 가능 
 */
public interface Engine {

	public void StartEngine();
	
	public void StopEngine();
	
}//interface

class Wheel {}
class Wing {}
class FloatWater {}

class Car extends Wheel implements Engine {
	@Override
	public void StartEngine() {
		System.out.println("Car - startEngine");
	}
	@Override
	public void StopEngine() {
		
		
	}
}
class Airplane extends Wing implements Engine {
	@Override
	public void StartEngine() {
		System.out.println("Car - startEngine");
	}
	@Override
	public void StopEngine() {
		// TODO Auto-generated method stub
		
	}
}
class Ship extends FloatWater implements Engine {
	@Override
	public void StartEngine() {
		System.out.println("Car - startEngine");
	}
	@Override
	public void StopEngine() {
		// TODO Auto-generated method stub
		
	}
}


