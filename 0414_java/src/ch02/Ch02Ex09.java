package ch02;


// 정수 primitive data type casting(변경)
public class Ch02Ex09 {

	public static void main(String[] args) {
		
		
		byte byteVar; //변수선언 //메모리에 8bit 정수공장 만들어라 + 이름은 byteVar다. 
		byteVar = 127; //변수 초기화 //우항의 값을 좌항에 담아라, 127을byteVar에 담는다. 
		
		int intVar; //메모리에 32bit 정수공간을 만들어라 + 이름은 intVar 
		intVar = byteVar; // 작은그릇의 정수를 큰 그릇으로 옮겨라 
		//-> ok! 문제없이 되니까, 자동으로 datatype 변경 
		//auto casting, 묵시적 casting(컴에게 바꿔달라고 말 안해도 변경), promotion. 
		
		
		long longVar; //메모리에 64bit 정수공간을 만들어라 + 이름은 longVar
		longVar = 22000000000L;
		
		short shortVar; // 메모리에 16bit 정수공간을 만들어라 + 이름은 shortVar
		//shortVar = longVar;// 큰그릇의 정수를 작은 그릇으로 옮겨라 
		// -> 자바 거부 : 강제적으로 변경, 코딩에다가 변경을 씀(명시함). 
		
		shortVar = (short) longVar; // short로 바꿔!! //바꾸려는 data type를 적어주기!! 
		//강제 castion, 명시적 casting, demotion
		
		
		byte bVar1 = 1 , bVar2 = 2, bVar3;
		//bVar3 = bVar1 + bVar2; //정수형 변수의 연산은 int로 처리된다. // 정수형 변수 기본은 int!! 
		bVar3 = (byte) (bVar1 + bVar2); //강제적 명시적 casting
		
		
		
		
		
	}//main

}//class
