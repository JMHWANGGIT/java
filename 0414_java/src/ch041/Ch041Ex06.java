package ch041;
/*
 * 2차원 배열 : 배열의 배열 
 * - 1차원 배열 : 나홀로 아파트 : 아파트 이름 + 호수 (변수이름 + index) 
 * - 2차원 배열 : 아파트 단지  : 아파트 이름 + 동번호 + 호수 (변수이름 + index + index)
 */
public class Ch041Ex06 {
	public static void main(String[] args) {
		
		//2차원 배열의 선언 방법들 
		int [][] multiArr1; int []multiArr2[]; int multiArr3 [][];
		
		//2차원 배열의 생성 방법
		multiArr1 = new int [2][3]; //아파트 2동 각 3층.
		multiArr1[0][0] = 1;
		multiArr1[0][1] = 2;
		multiArr1[0][2] = 3;
		multiArr1[1][0] = 4;
		multiArr1[1][1] = 5;
		multiArr1[1][2] = 6;
		System.out.println(multiArr1[1][1]);
		
		
		int [][] multiArr4 = new int [3][3]; //3동, 각 3층 //선언과 생성을 동시에.
		int [][] multiArr5 = {{1,2},{3,4,5},{6,7,8,9}};
		//선언, 생성, 초기화를 동시에. //1동은 2층, 2동은 3층, 3동은 4층 // 각동은 층이 다를 수 있다. 
		
		
		int [][] multiArr6 = new int[3][]; //생성할때, 동만 생성 가능. 
		multiArr6 [0] = new int [2];
		multiArr6 [1] = new int [3];
		multiArr6 [2] = new int [4];
		
		//int [][] multiArr7 = new int[][5]; //error //동은 반드시 지정되어야 한다. 
		
	}//main
}//class
