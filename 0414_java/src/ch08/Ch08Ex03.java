package ch08;

import java.util.Arrays;

/*
 * 잘 알고 있어야 함!! 
 * Array.sort() , Array.toString() 
 * Collections.sort() , Collection은 출력시 toString()은 자동. 
 * Comparable - compareTo : 자동정렬기준
 * 	- 나만의 클래스에 나만의 정렬 기준을 만드려면 
 * 		-> implements Comparable
 * 			-> compareTo 오버라이드 해야 한다. 
 */
public class Ch08Ex03 {
	
	public static void main(String[] args) {
	
		int[] iArr = {11111,2222,3,4444,555};
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		
		String strArr[] = {"hi","boy","zombie","airplain","world"};
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Ch08SortObj1 [] sArr1 = {new Ch08SortObj1("BBB"), new Ch08SortObj1("AAA")};
		System.out.println(Arrays.toString(sArr1));
		//Arrays.sort(sArr1);//error
		System.out.println(Arrays.toString(sArr1));
		
		Ch08SortObj2 [] sArr2 = {new Ch08SortObj2(11111, "11111")
				, new Ch08SortObj2(22222, "22222")
				, new Ch08SortObj2(3, "3")
				, new Ch08SortObj2(4444, "4444")
				, new Ch08SortObj2(555, "555")};
		System.out.println(Arrays.toString(sArr2));
		Arrays.sort(sArr2);
		System.out.println(Arrays.toString(sArr2));
	}//main
}//class

class Ch08SortObj1 {
	
	String name;
	Ch08SortObj1(String str){
		name = str;
	}//Ch08SortObj1()
	@Override
	public String toString() {
		return this.name;
	}
}//Ch08SortObj1 class

class Ch08SortObj2 implements Comparable<Ch08SortObj2>{//Comparable : 나와 나 자신을 비교해줄 수 있음.
	
	String name;
	int no;
	
	Ch08SortObj2(int num, String str){
		no = num;
		name = str;
	}//Ch08SortObj1()
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public int compareTo(Ch08SortObj2 o) {
		//return type : int : -1(앞으로 이동), 0(자리이동없음) , 1(뒤로 이동)
		if(this.no > o.no) {
			return 1; //자리바꿈 : 뒤로이동.
		} else if(this.no < o.no) {
			return -1; //자리바꿈 : 앞으로 이동
		} 
		return 0;
	}
}//Ch08SortObj1 class