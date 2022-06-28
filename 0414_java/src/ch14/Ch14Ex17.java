package ch14;

import java.io.File;


/*
 * File : 파일 또는 폴더 하나를 지정하는 객체. 
 */
public class Ch14Ex17 {
	public static void main(String[] args) {
		
		String pathFolder = "C:\\Users\\kotor\\javaiotest";
		File file = new File(pathFolder);
		
		
		System.out.println("isFile : " + file.isFile()); //false
		System.out.println("isDirectory : " + file.isDirectory()); //true
		System.out.println();//파일이나 폴더의 권한은 3개! (rwx) : read(읽고), write(쓰고), excute(실행).
		System.out.println("canRead : "+file.canRead());
		System.out.println("canWrite : " + file.canWrite());
		System.out.println("canWrite : " + file.canWrite());
		System.out.println();
		System.out.println("getPath : " + file.getPath());
		System.out.println("getAbsolutePath : " + file.getAbsolutePath());
		System.out.println();
		System.out.println("getName : " + file.getName());//폴더나 파일의 이름을 가져오는 것.
		System.out.println("getParent : " + file.getParent());//부모의 이름을 문자열로 알려준다.
		System.out.println("getParentFile : " + file.getParentFile());//부모의 이름을 File 객체로 만들어준다.
		System.out.println();
		String [] fileList = file.list();
		for(String string : fileList) {
			System.out.println(string);
		}//forEach
		
		String pathFile = "C:\\Users\\kotor\\javaiotest\\io9.txt";
		File file2 = new File(pathFile);
		file2.delete();
		System.out.println("======================");
		File [] fileArr = file.listFiles();
		for(File file3 : fileArr) {
			System.out.println(file3.getName());
		}//forEach
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}//main
}//class
