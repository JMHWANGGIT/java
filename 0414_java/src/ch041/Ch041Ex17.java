package ch041;

public class Ch041Ex17 {
	public static void main(String[] args) {
		
		String [][] strArr1 = {{"hi ","hello"}
								,{"how ","are ","you"}
								,{"i ","am ","fine, ","thank you."}};
		
		for (int i = 0; i < strArr1.length; i++) {
			for (int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j]);
			}//for
			System.out.println();
		}//for
		
		System.out.println();
		
		//forEach식( : 우항에서 좌항의 값 하나를 옮긴다 ) 
		for(String[] arr : strArr1) {
			for(String str : arr) {
				System.out.print(str);
			}//forEach
			System.out.println();
		}//forEach : 값을 꺼내는 것이 유리함. 
		
	}//main
}//class
