package ch041;

public class Ch041Ex15 {
	public static void main(String[] args) {
		
		String [][] strArr = new String [10][10];
		
		for (int i = 0; i < strArr.length; i++) {
			
			for (int j = 0; j < strArr.length; j++) {
				strArr [i][j] = i + " * " + j + " = " + (i*j);
			}//for
		
		}//for
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[i][j] + "\t");
			}//for
			System.out.println();
		}//for
	}//main
}//class

