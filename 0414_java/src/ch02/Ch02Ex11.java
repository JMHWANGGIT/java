package ch02;

public class Ch02Ex11 {

	public static void main(String[] args) {
		
		
		float fVar; // 32bit 실수 타입의 공간을 만들어라. + 이름은 fVar
		fVar = 3.14F; // 우항의 값을 좌항에 담아라. 
		double dVar; // 64bit 실수 타입의 공간을 만들어라. + 이름은 dVar
		dVar = fVar; // 32 -> 64로 가는 것이니 ok!! //자동 변수 타입변경
		System.out.println(dVar);
		
		
		
		double dVar2; // 64bit 실수 타입의 공간을 만들어라. + 이름은 dVar2
		dVar2 = 3.14;
		float fVar2; // 32bit 실수 타입의 공간을 만들어라. + 이름은 fVar 
		// fVar = dVar2; // 64 -> 32 // java가 거부 
		fVar2 = (float) dVar2; //강제적 명시적변경 
		System.out.println(fVar2);
		
		
		
	}//main

}//class
