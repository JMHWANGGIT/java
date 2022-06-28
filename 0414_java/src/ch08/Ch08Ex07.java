package ch08;

/*
 * StringBuilder
 * - StringBuffer과 마찬가지로 문자열을 동적 변경한다. 
 */

public class Ch08Ex07 {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("seoul");
		builder.append(" mapogu");
		System.out.println(builder);
		
		builder.insert(5, "<city>");
		System.out.println(builder);
		
		builder.setCharAt(5, ' '); //5번지를 공백으로 바꾸겠다.
		System.out.println(builder);
		
		builder.setLength(50);
		System.out.println("[" + builder + "]");
		
		builder.subSequence(0, 7);
		System.out.println("[" + builder + "]");
		System.out.println(builder.subSequence(0, 7));
	}//main
}//class
