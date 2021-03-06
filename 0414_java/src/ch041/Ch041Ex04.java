package ch041;

public class Ch041Ex04 {
	public static void main(String[] args) {
		//배열은 resize 불가 , 길이(크기)변경이 불가.
		//배열의 복사는 가능하다.
		int [] iArr1 = new int [3];
		iArr1[0] = 7;
		iArr1[1] = 8;
		iArr1[2] = 9;
		System.out.println(iArr1[2]);
		
		int [] iArr2 = new int [10];
		System.arraycopy(iArr1, 0, iArr2, 0, iArr1.length);
		//iArr1의 0번지 자료부터 iArr1.length(개)만큼을, iArr2의 0번지부터 붙여라.
		System.out.println(iArr2 [2]);
		
		int [] iArr3 = new int [10];
		System.arraycopy(iArr1, 0, iArr3, 0, 1);
		//iArr1의 0번지에서 1칸만, iArr3의 0번지부터 붙여라.
		System.out.println(iArr3 [0]);
		System.out.println(iArr3 [1]);
		
		int [] iArr4 = new int [10];
		iArr4[5] = 12345;
		System.out.println(iArr4[5]); //12345
		System.arraycopy(iArr1, 2, iArr4, 5, 1);
		//iArr1의 2번지에서 1칸만, iArr4의 5번지부터 붙여라.
		System.out.println(iArr4 [5]);  //9
 		System.out.println(iArr4 [6]);  //0
 		
 		//for(변수 = 0; 변수 < iArr.length; 변수++)
 		// -> iArr[변수] 접근가능. 
 		
		
		
	}//main
}//class

/*
 * Gabage collector -> Gabage collection
 * - 자바에서 사용하던 메모리 중에서, 더이상 사용하지 않는 메모리를 회수(해제).
 * - 회수(해제)된 데이터는 날라가버림(찾을 수 없음) 
 *  
 */


