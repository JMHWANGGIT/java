
package ch041;
/*
 * array : 배열 : 배치를 줄줄이 했다. 
 * array의 개념 
 * - 하나의 변수로 여러 data(데이타)를 다룰(handling) 수 있다.
 * - 하나의 변수로 여러 data에 접근 가능하다. 
 * - 변수는 하나 + 번지는 여러 개. 
 * - 길이의 개념(length), 번지의 개념(index)
 * - same data type, group handling, java object.
 * - same data type: 정수 선언된 배열은 정수만 담고, 실수 선언된 배열은 실수만 담을 수 있다. 
 * - group handling: 데이터를 그룹으로 다룬다. 
 * - java object: array변수는 주소를 담고, array는 다른 공간에 생성된다. 
 */
public class Ch041Ex10 {
	//Stirng 배열 : class type의 배열 
	public static void main(String[] args) {
		//String 배열 : class type의 배열
		String [] strArr = new String[6];
		strArr[0] = new String("hi.");
		strArr[1] = new String("hello.");
		strArr[2] = new String("how are you?");
		strArr[3] = new String("fine, thank you.");
		strArr[4] = new String("and you?");	
		strArr[5] = new String("i am fine, too.");
		for(int idx = 0; idx < strArr.length; idx++) {
			System.out.println(strArr[idx]);
		}//for

	
		
		
	}//main
}//class
