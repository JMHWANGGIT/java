package ch14;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * File을 이용하여 폴더 목록 만들기 
 */
public class Ch14Ex18 {
	
	
	static ArrayList<File> list = new ArrayList<File>();
	
	
	public static void main(String[] args) {
		
		String path = "C:\\server_program\\workspace\\0414_java\\src";
		File topFile = new File(path);
		
		makeFileList(topFile);
		System.out.println(list.size()); //src의 폴더개수 
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).isDirectory()) {
				makeFileList(list.get(i));
			}//if
		}//for
		
		System.out.println(list.size()); //src의 폴더 안에 있는 java파일 개수까지.
		
		for (File tmp : list) {
			System.out.println(tmp.getName()); //getName을 이용해 이름 리스트 보이기. 
		}//forEach
		
	}//main
	
	
	public static void makeFileList(File file) {
		File[] fileArr = file.listFiles();
		for (File file2 : fileArr) {
			list.add(file2);
		}//for
	}//makeFileList()
}//class
