package ch041;
/*
 * 2차원 배열 : 배열의 배열 
 * - 1차원 배열 : 나홀로 아파트 : 아파트 이름 + 호수 (변수이름 + index) 
 * - 2차원 배열 : 아파트 단지  : 아파트 이름 + 동번호 + 호수 (변수이름 + index + index)
 */
public class Ch041Ex08 {
	public static void main(String[] args) {
		//2차원 배열의 길이(length) 개념. 
		
		
		int [][] iMultiArr = {{1,2},{3,4,5},{6,7,8,9}};
		//0동은 2층, 1동은 3층, 2동은 4층 
		
		System.out.println("동의개수 : " + iMultiArr.length);
		System.out.println("0동 호의개수 : " + iMultiArr[0].length);
		System.out.println("1동 호의개수 : " + iMultiArr[1].length);
		System.out.println("2동 호의개수 : " + iMultiArr[2].length);
		
	}//main
}//class
