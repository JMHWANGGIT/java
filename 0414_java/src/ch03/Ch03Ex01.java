package ch03;
/*
 * 연산자 -, +, *, /, % (나머지) 매우중요 
 */
public class Ch03Ex01 {
	
	
	public static void main(String[] args) {
		
		
		int firstNum = 123, secondNum = 4;
		System.out.printf("%d + %d = %d\n", firstNum,secondNum,firstNum + secondNum);
		System.out.printf("%d - %d = %d\n", firstNum,secondNum,firstNum - secondNum);
		System.out.printf("%d * %d = %d\n", firstNum,secondNum,firstNum * secondNum);
		System.out.printf("%d / %d = %d\n", firstNum,secondNum,firstNum / secondNum);
		System.out.printf("%d / %d 나머지 %d\n", firstNum,secondNum,firstNum % secondNum);
		//나머지의 % 매우 중요
		
		System.out.println("-------------------------");
		
		
		System.out.println("+ : " + (firstNum + secondNum));
		System.out.println("- : " + (firstNum - secondNum));
		System.out.println("* : " + (firstNum * secondNum));
		System.out.println("/ : " + (firstNum / secondNum));
		System.out.println("% : " + (firstNum % secondNum));
		
		
		
	}//main

}//class
