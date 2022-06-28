package ch02;

/*
 * equals : 문자열 비교 
 * equalsIgnoreCase : 대소문자 무시하고 문자열 비교 
 */
public class Ch02Ex17 {

	
		public static void main(String[] args) {
			
			
			int iVar1 = 777;
			int iVar2 = 777;
			System.out.println("primitive : " + (iVar1 == iVar2));
			//메모리 1개 
			
			String str1 = new String("hello");
			String str2 = new String("hello");
			//메모리 2개 
			
			System.out.println("String : " + (str1 == str2));// 결과값 false
			// == : 같다라는 부호표기. 
			
			String str3 = "hello";
			String str4 = "hello";
			System.out.println("Another String : " + (str3 == str4)); //결과값 true
			//메모리 1개 (hello는 상수공간) 
			
			
			System.out.println("str1.equals(str2) : " + str1.equals(str2)); //내부데이터 값 비교.
			System.out.println("str1.equals(str3) : " + str1.equals(str3));
			
			
			String str5 = "Hello";
			System.out.println("The other String : " + (str3 == str5)); //결과값 false
			System.out.println("str1.equal(str5) : " + str1.equals(str5)); //결과값 false
			System.out.println("str1.equal(str5) : " + str1.equalsIgnoreCase(str5)); // 결과값 true
			// equal : 같다. Ignore : 무시하다, Case : 대소문자. 
			
			
			
		}//main
}//class
