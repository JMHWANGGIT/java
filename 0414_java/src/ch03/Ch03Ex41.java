package ch03;

public class Ch03Ex41 {
	public static void main(String[] args) {
		//1~3학년, 각 10반까지 출력.
		
		for(int hak = 1; hak <= 3; hak++) {
			
			System.out.println("===" + hak + "학년 ===");
			
			for(int ban = 1; ban <= 10; ban++) {
				System.out.printf("%d학년 %d반 \n",hak,ban);
			}//for2
			
		}//for1
		
	}//main
}//class
