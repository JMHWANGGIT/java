package ch041;

public class Ch041Ex053 {
	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		for(int i = 0; i < lotto.length; i++) { //i : 0,1,2,3,4,5
			//for문을 통해 로또번호 6개를 만드시오. 
				
				int tmp = (int) (Math.random()* 45 +1);
				if(i == 0)lotto [i] = tmp;//if1 //최초의 값 : 0번지의 값은 그냥 입력 / 비교 대상 없음. 
				boolean flag = false; //판단 깃발 
				
				
				for(int k = 0; k < i; k++) { // k : 0,1,2,3,4
					
					if(tmp == lotto [k]) {
					flag = true;
					break;
					}//if
					//중복 판단.					
				}//for2 : 배열의 기존 값과 비교( 값 중복을 비교하기 위해 )
				
					if(!flag) { //flag가 true가 아니면 
					lotto[i] = tmp;
					} else {//중복이 발생한 턴 
						i--; //중복이 발생한 번지에 값을 입력하지 않고 지나가지 않도록 i값을 줄여준다.
					}//if else 3 
				
					//문제 1 : 중복이 발생한 번지는 값을 입력하지 않고 지나간다.(배열 초기값인 0이 나온다.)
					//중복 여부에 따라 값을 입력 
					//문제 2 : 마지막 번지는 검사가 되지 않는다. 이유 : k < i이기 때문에.
		}//for
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}//for : 출력 
		
	}//main
}//class
