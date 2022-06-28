package ch08;

/*
 * String Buffer : 동적 변경이 가능. 
 * - String은 동적 변경이 안된다.
 * - 
 */
public class Ch08Ex06 {
	public static void main(String[] args) {
		
		String str = new String("서울시");
		str.concat(" 마포구"); //일시적 적용 -> str은 변화가 없다. 
		System.out.println(str);
		
		StringBuffer buffer = new StringBuffer("seoul");
		buffer.append(" mapogu"); //문자열의 동적 변화가 일어난다. 
		System.out.println(buffer);
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.deleteCharAt(0);//ugopam luoes
		System.out.println(buffer);
		
		buffer.insert(5, " city ");
		System.out.println(buffer);//gopam city  luoes
		
		buffer.substring(0,7);
		System.out.println(buffer);//gopam city  luoes
		//String의 substring과 같은 결과 
		System.out.println(buffer.substring(0,7));
		
		
		
		
		
	}//main
}//class
