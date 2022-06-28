package ch08;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

//Rand : 랜덤 : 임의의 무작위 값 발생. 

public class Ch08Ex02 {
	public static void main(String[] args) {
		
		//Math.random()은 항상 double 발생.
		System.out.println("Math.random()" + Math.random());
		
		//Random은 boolean, double, int를 선택가능.
		Random rand = new Random();
		System.out.println("rand.nextBoolean() : " + rand.nextBoolean());
		System.out.println("rand.nextDouble() : " + rand.nextDouble());
		System.out.println("rand.nextInt() : " + rand.nextInt());
		
		System.out.println("Math.random lotto : " + (int)(Math.random()*45+1));
		System.out.println("Random lotto : " + (rand.nextInt(45) +1));
		
		
		HashSet<Integer> lotto = new HashSet<Integer>(); //중복이 안들어감.
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45)+1);
		}//while
		System.out.println(lotto);
		
		
		//중복이 안돌아가고 정렬을 해줌! (순서정리; TreeSet / TreeMap 구조)
		TreeSet<Integer> lotto2 = new TreeSet<Integer>(); 
		while(lotto2.size() < 6) {
			lotto2.add(rand.nextInt(45)+1);
		}//while
		System.out.println(lotto2);
		
	}//main
}//class
