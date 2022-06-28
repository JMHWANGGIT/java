package ch041;

public class Ch041Ex052 {
	public static void main(String[] args) {
		
		int [] lotto = new int [6];
		for(int i = 0; i < lotto.length; i++) {
			//for문을 통해 로또번호 6개를 만드시오. 
				lotto [i] = (int) (Math.random()* 45 +1);
				System.out.print(lotto[i]+"\t");
				
		}//for
	}//main
}//class
