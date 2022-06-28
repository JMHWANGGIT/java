package ch02;


/*
 * WrapperClass : Float, Double
 * - prinitive data type는 전부다 소문자. 
 * - WrapperClass는 첫 글자가 대문자
 */
public class Ch02Ex10 {

	public static void main(String[] args) {
		
		System.out.println(Float.MIN_VALUE + " : " + Float.MAX_VALUE);
		//1.4E-45 : 3.4028235E38 // 1.4 * 10의 -45승 : 3.4 * 10의 38승
		System.out.println(Double.MIN_VALUE + " : " + Double.MAX_VALUE);
		//4.9E-324 : 1.7976931348623157E308
		//4.9 * 10의 -324승 : 1.7* 10의 308승
		
		
		double dVar = 3.14; //double 은 62bit
		//double 의 bit 구성 : 부호비트 1, 지수 11, 가수(소수점)비트 52
		//int iVar = dVar; //int는 32bit
		//long longVar = dVar; //실수와 정수간의 충돌(자료형이 달라요~)
		int iVar = (int) dVar; // 강제적 명시적 변경
		System.out.println(iVar); //3 // 소수점 자르고 나옴 
		
		
		Double wVar = new Double(3.14);
		int iVar2 = wVar.intValue();
		System.out.println(iVar2);
		
	
		
	}//main

}//class
