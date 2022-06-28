package ch042;
/*
 * 지역 변수 : local variable 
 * - 특정한 지역에서만 의미를 갖는 변수 
 * - 주로 메소드 내부에 선언되는 변수를 의미함 
 * - ()내부에서 선언된 변수
 * - 클래스 중괄호{}가 아닌 다른 {}들에서 선언된 변수.
 * -   
 */
public class Ch042Ex05 {

	public static void main(String[] args) {
		
		String localStr1 = "지역 변수";
		
		{
			//String localStr1 = "지역 변수"; 
			//error // 같은 지역 변수 이름이 두번 사용된 예 
			String localStr2 = "지역 변수 이름은 같지 않도록 노력하세요~ ";
		}
		//똑같은 이름이라도 괄호안에서 끝났기때문에 사용가능. 하지만 헷갈리기 때문에 안쓰는것이 좋음. 
		//17~18라인의 지역변수는 20라인에서 효력이 소멸. 
		String localStr2 = "18라인의 localStr2는 19라인에서 효력이 소멸. ";
		
		for (int idx = 0; idx <= 10; idx++) {
			System.out.println("idx도 지역변수");
			//int idx = 5;//error // 같은 지역 변수 이름이 두번 사용된 예 
		}//for
		
		for (int idx = 0; idx <= 10; idx++) {
			System.out.println("//25라인의 지역변수는 28라인에서 효력이 소멸.");
			 
		}//for
		
		
		
		
	}//main

}//class
