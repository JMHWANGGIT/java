package ch06;
/*
 * exception handling 방법 
 * - 1. 예외가 발생할 수 있는 코드를 try 안에 배치 
 * - 2. 발생하는 예외에 맞추어 대응할 수 있는 catch문을 작성한다. 
 * 
 * try 
 * - 예외에 대한 포위망 역할 
 * - 반드시 catch와 함께 사용 
 * 
 * catch
 * - 예외에 따른 대응 시나리오를 만드는 역할 
 * - 하나의 try에 여러개의 catch가 올 수 있다. 
 * - catch의 ()안에는 어떤 종류의 예외를 잡을 것인가를 정의
 * - catch의 {}안에는 예외를 잡은 경우, 어떤 처리를 한 것인지의 코드를 선언 
 * 
 */
public class Ch06Ex03 {
	public static void main(String[] args) {
		
		try {
			//exception이 발생할 수 있는 코드
			//System.out.println( 7 / 0 );
			String str = null;
			//if(str.length() > 0) {}
			//if(1 > 0 || str.length() > 0) {}//short circuit logic
			
			String str2 = "hi";
			//System.out.println(str2.charAt(5));
			
			int[] iArr = new int[2];
			System.out.println(iArr[5]);
			
		} catch (ArithmeticException e) {
			System.out.println("수학적인 문제");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 칸수를 세어보거라!");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("문자열의 길이를 확인하세요!");
		} catch (NullPointerException e) {
			System.out.println("instance가 연결되지 않은 변수입니다.");
		} 
		
//		해군 포위망 {
//			원피스 현상수배범 등장
//		} (수배 전단 비교 == 루피) {
//			감옥으로 호송
//		}(수배 전단 비교 == 나미) {
//			갱생의 기회를 준다 
//		} (수배 전단 비교 == 고고학자) {
//			즉시 처형
//		} (수배 전단 비교 == 쵸파) {
//			짱 귀여워 
//		}
		
	}//main
}//class
