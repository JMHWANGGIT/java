package ch03;
/*
 * while과 for의 사용법 비교 
 */
public class Ch03Ex43 {
	public static void main(String[] args) {
		//while과 for의 사용법 비교
		
		//while의 정석
		int endPoint = 1;
		while(endPoint <= 10) {
			System.out.println("while 사용법 : endPoint : " + endPoint);
			endPoint++;
		}//while
		
		
		//for의 정석 : while보다 초기식, 조건식, 증감식이 집중되어 있다. 
		for(int loopCount = 1; loopCount <= 10; loopCount++) {
			System.out.println("for 사용법 : endPoint : " + loopCount);
		}//for
		
		//가끔가다 이렇게 쓰는 사람도 있더라. : 놀라지 마시오! 권장은아님! 
		int loopCount = 1;
		for(; loopCount <= 10; loopCount++) {
			System.out.println("for 사용법 : endPoint : " + loopCount);
		}//for
		
		System.out.println();
		
		//변수 2개를 하나의 while문에 넣는경우 : 가끔 있는 경우 : 놀라지 마시오! 
		int ep2 = 1, ep3 = 10;
		while (ep2 < 5 && ep3 > 5) {
			System.out.printf("ep2 : %d, ep3 : %d\n", ep2, ep3);
			ep2++;
			ep3--;
		}//while
		
		System.out.println();
		
		//변수를 2개를 하나의 for문에 : 가끔 있는 경우 : 놀라지 마셈! 
		for(int lp2 = 1, lp3 = 10; lp2 < 5 && lp3 > 5; lp2++, lp3--) {
			System.out.printf("lp2 : %d, lp3 : %d\n", lp2, lp3);
		}
		
	}//main
}//class
