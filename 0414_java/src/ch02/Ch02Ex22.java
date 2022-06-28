package ch02;
/*
 * Math : 수학관련 class
 */
public class Ch02Ex22 {

	public static void main(String[] args) {
		
		System.out.println("cell(0.1) : " + Math.ceil(0.1)); //올림
		System.out.println("floor(0.9) : " + Math.floor(0.9)); //내림
		System.out.println("round(0.4) : " + Math.round(0.4)); //반올림
		System.out.println("round(0.5) : " + Math.round(0.5)); //반올림
		
		System.out.println("====================================");
		
		System.out.println("max(100,200) : " + Math.max(100, 200));
		System.out.println("min(100,200) : " + Math.min(100, 200));
		
		System.out.println("====================================");
		
		System.out.println("pow(2,5)" + Math.pow(2, 5)); //2의 5승 
		//2*2*2*2*2
		System.out.println("sqrt(25)" + Math.sqrt(25)); //25의 제곱근
		
		System.out.println("====================================");
		
		System.out.println("ramdom : " + Math.random());
		//random : 무작위 수 구하기 // 0.0~0.999~
		
		System.out.println("ramdom : " + Math.random());
		System.out.println("ramdom : " + Math.random());
		//random : 수행할 때마다 다른 값을 가져온다. 
		
		System.out.println("ramdom * 100 : " + Math.random() * 100);
		//0에서 100사이의 수 구하기. 
		System.out.println("ramdom * 1000 : " + Math.random() * 1000);
		//0에서 1000사이의 수 구하기. 
		System.out.println("ramdom * 45 +1 : " + Math.random() * 45 +1);
		int jungsu = (int)(Math.random()*45+1);
		int jungsu2 = (int)(Math.random()*45+1);
		int jungsu3 = (int)(Math.random()*45+1);
		int jungsu4 = (int)(Math.random()*45+1);
		int jungsu5 = (int)(Math.random()*45+1);
		int jungsu6 = (int)(Math.random()*45+1);
		System.out.println(jungsu + " " + jungsu2 + " " + jungsu3 + " " + jungsu4 + " " + jungsu5 + " " + jungsu6);
		
		
		
		
	}//main

}//class
