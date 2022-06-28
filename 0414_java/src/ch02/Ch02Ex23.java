package ch02;
/*
 * printf : print + format 
 * 서식출력 -> 기본이 문자열 출력 -> 정수, 실수, 문자는 출력서식 문자를 통해서만 출력 가능. 
 * 출력 서식문자를 알아야 한다.  
 */
public class Ch02Ex23 {
	public static void main(String[] args) {
		
		System.out.printf("그냥 문자열 출력 가능\n"); 
		//\n -> 줄바꿈 // \t -> 탭만큼 공간 띄우기(공백 넣기) 
		//System.out.printf(123);
		//System.out.printf(3.14);
		//System.out.printf('A');
		System.out.printf("%s\n", "그냥 문자열 출력 가능");
		//%s는 문자열 출력 
		System.out.printf("%d\n",123);
		//%d는 정수 출력
		System.out.printf("%f\n",3.14);
		//%f는 실수 출력, 소수점 6자리 출력이 기본. 
		System.out.printf("%.2f\n",3.14);
		//%와 f사이에 .2는 소수점 2자리 출력. 
		System.out.printf("%.20f\n",3.14);
		//%와 f사이에 .20는 소수점 20자리 출력. -> 자리수는 여러분 맘대로 조정 가능. 
		System.out.printf("%c\n",'A');
		// %c는 문자출력
		
		System.out.printf("%d + %d = %d\n", 1,2,3);
		
		System.out.printf("이름 %s, 나이 %d, 키 %.1fcm, 몸무게 %.1fkg, 혈액형 \'%c\'\n", "홍길동", 25, 180.0, 80.0, 'A');
		
	}//main
}//class
