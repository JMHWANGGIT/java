package ch06;
/*
 * 예외처리 : Exception, (try~catch문)
 * 목적(필요성) : 비 정상적인 종료를 정상적인 종료로 유도
 * try{
 * 		예외가 발생할 수 있는 문장들 ;
 * 		예외가 발생할 수 있는 문장들 ;
 * 	  } catch (예외발생 각채 e) {
 * 	  	예외 발생시 처리하는 문장들 ;
 * 	  } 
 */
public class Ex01 {
	public static void main(String[] args) {
		
		try {
			
			int [] var = {10,20,30};
			for (int i = 0; i <= var.length; i++) {
				System.out.println("1");
				System.out.println("2");
				System.out.println("var["+i+"]="+var[i]);
				System.out.println("3");
				System.out.println("4");
			}//for
			
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외");
			
		}//try catch
		
	}//main
}//class
