package ch041;

public class Ch041Ex03 {
	public static void main(String[] args) {
		//배열은 resize 불가 , 길이(크기)변경이 불가.
		int [] iArr1 = new int [3];
		iArr1[0] = 7;
		iArr1[1] = 8;
		iArr1[2] = 9;
		System.out.println(iArr1[2]);
		
		iArr1 = new int [5]; 
		System.out.println(iArr1[2]);
		//기존의 7,8,9가 담긴 3칸짜리 배열은 버려지고 0으로 초기화된 5칸짜리가 새로 연결된다. 
		
		
	}//main
}//class

/*
 * Gabage collector -> Gabage collection
 * - 자바에서 사용하던 메모리 중에서, 더이상 사용하지 않는 메모리를 회수(해제).
 * - 회수(해제)된 데이터는 날라가버림(찾을 수 없음) 
 *  
 */


