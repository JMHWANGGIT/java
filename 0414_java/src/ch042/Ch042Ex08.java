package ch042;
/*
 * method 정의  
 * - class : 현실세계를 모델링한 설계도. 현실세계의 대상을 표현한 주제가 있다. 
 * - 예) 음료수 자판기 : 음료수, 투입행위, 배출행위 요소들로 표현이 가능.  
 * - class의 member라는 개념 : class를 표현하는 것.(음료수, 투입행위, 배출행위)
 * - 투입행위, 배출행위와 같이 동작을 담당하는 것이 method.
 * 
 * method의 구성 
 * - return type
 * 	 - 다른 사람에게 이 메소드를 사용하면, 돌려주는 값의 데이터 형태를 알려준다.
 *   - 자판기의 제품 전시 공간. 
 *   - int, double, String 등 이 메소드를 사용하면, 얻을 수 있는 데이터의 형태를 알려준다.
 *   - return : 돌려주는 행위.
 *   - void : return type 없음. 돌려주는 값 없다. return 없음.(사용안함) 
 * 
 * - name 
 * 	 - 메소드의 이름은 메소드가 잘 나타나도록 만든다. 
 * 	 - 첫문자 소문자, 이어지는 단어의 첫문자 대문자, 숫자가능하지만 맨 앞 불가, 특수문자 비권장. 
 * 
 * - arguments 
 *   - 메소드를 수행하기 위해 필요한 data를 외부에서 입력받는 공간 
 *   
 * method의 장점 
 * - 코드의 재사용성 : 한번 만들어 놓은 method는 재사용 가능. 
 * 		-> 코드의 모듈화 , 코드의 중복회피 , 개발기간 단축 , 유지보수를 쉽고 빠르게.
 */

class Ch042Dummy3 {
	
	//return type이 있는 method
	String returnTest(){//return type이 string
		return "문자열 리턴의 예제 입니다.";
	}//reutrnTest
	
	
	//arguments가 있는 method1
	void argumentsTest(int iVar1) {
		System.out.println("입력값 : " + iVar1);
	}//argumentsTest
	
	
	//arguments가 있는 method2
	void printPlus(int iVar1, int iVar2) {
		System.out.printf("%d + %d = %d",iVar1,iVar2, iVar1+iVar2);
	}//printPlus
	
	
	//arguments가 있는 method3
	void printStrArr(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}//for
	}//printStrArr
	
	
	//return type , argument 가 있는 method 
	String strConcat(String s1, String s2) {
		return s1 + s2;
	}//strConcat
	
	
}//class

public class Ch042Ex08 {
	public static void main(String[] args) {
	//여기에 void가 있는데 값이 나오는 이유? return이 아니라 화면 도출일 뿐! 	
		
		Ch042Dummy3 dummy3 = new Ch042Dummy3();
		String returnedData = dummy3.returnTest();
		//dummy3.returnTest()를 호출 + 실행해서 문자열을 리턴 받았다. 
		System.out.println(returnedData);
		dummy3.argumentsTest(777);
		dummy3.printPlus(9876, 8765);
		
		System.out.println();
		String [] strArr = {"nice", "to meet","you,","too."};
		dummy3.printStrArr(strArr);
		
		String concatRes = dummy3.strConcat("thank you.", "and you?");
		//두개의 문자열을 arguments로 받아서 1개의 문자열로 돌려주었다. 
		System.out.println(concatRes);
		
	}//main
}//class
