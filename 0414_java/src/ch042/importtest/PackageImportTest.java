
package ch042.importtest;

import ch042.packagetest.PackageObject;

/*
 * Import : 현재 ~.java파일에서 필요한 class파일의 위치를 지정해주는 표현(문법,방법)
 * - 상위폴더에서 하위폴더 순으로 표현 (선언)
 * - 상위폴더에서 하위폴더 순으로 .(dot)를 통해 폴더를 구분 
 * - .(dot) : ~의 내부를 지칭한다. : 예) a.b -> a안에 b있다.
 * - 하나의 ~.java 파일에 여러개의 import 선언 가능 
 * - 자바에서 폴더는 소문자 선호
 * - 예) import java.util.Scanner;
 *      -> java라는 이름의 폴더 내부에, util이라는 이름의 폴더 내부에, Scanner class를 가져와라~! 
 * - 예) import java.util.*;  
 *      -> java라는 이름의 폴더 내부에, util이라는 이름의 폴더 내부에, 모든 class를 가져와라~!
 *      -> 사용안하는(필요없는) class 파일도 가져온다. -> 효율이 떨어진다. -> 비권장. 
 */
public class PackageImportTest {
	public static void main(String[] args) {
		
		PackageObject obj = new PackageObject();
		obj.packageNo = "123";
		obj.packageName = "짝퉁";
		obj.checkPackage();
		
		//Ch042Board board = new Ch042Board();
		//접근제한자가 없는 class는 같은 폴더에서만 접근 가능. 다른 폴더에서는 접근 불가능. 
		
	}//main
}//class
