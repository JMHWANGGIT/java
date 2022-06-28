package ch041;

public class Ch041Ex16 {
	public static void main(String[] args) {
		
		String [] strArr1 = {"nice", " to meet"," you,"," too"}; 
		for (int i = 0; i < strArr1.length; i++) {
			System.out.print(strArr1[i]);
		}//for
		
		System.out.println();
		
		//자주 활용하는 것! (바로 데이터를 끄집어온다./ 내용물을 끄집어내는 목적)
		for(String s : strArr1) {
			System.out.print(s);
		}//forEach
	}//main
}//class
