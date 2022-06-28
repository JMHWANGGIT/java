package ch02;
/*
 * char는 정수와 호환이 가능.
 * ascii code와 호환. 
 * 
 */
public class Ch02Ex13 {

	public static void main(String[] args) {
		
		
		char chVar1; //문자 하나를 저장하는 공간을 만들고 + 이름은 chVar1
		chVar1 = 'A'; //아스키코드 값 : 65
		System.out.println(chVar1);
		
		char chVar2 = 36; // 아스키코드 : $
		System.out.println(chVar2);
		
		int iVar1; //32 bit 정수공간 + 이름은 iVar1
		iVar1 = 'H'; // 아스키코드값 : 72 // 자동타입변경(자동형변환)
		System.out.println(iVar1);
		
		int iVar2 = 88; // X
		char chVar3; // 16bit 공간
		//chVar3 = iVar2 // 16bit 공간에 32bit 저장 // 자바는 거부 
		chVar3 = (char) iVar2; //강제적 명시적 타입변경 
		System.out.println(chVar3);
		
		
		
	}//main
	
}//class
