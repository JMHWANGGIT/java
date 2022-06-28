package ch02;

/*
 * 서식문자를 사용하여 다음과 같이 출력되는 프로그램을 작성하라. 
 * My height
 * 170
 * My Weight
 * 68.600000
 */
public class JO506 {
	public static void main(String[] args) {
		
		System.out.printf("%s\n%d\n%s\n%.6f\n", "My height", 170, "My Weight", 68.6 );
	}
}
