package ch14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader
 * - NodeStream
 * - CharStream : 16bit data입력 :비영어권 문자 처리 가능 
 * - 파일 열고 - while로 읽고 - 닫고! 
 */
public class Ch14Ex03 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io1.txt";
		FileReader fr = null; //나중에 new 할거야! 
		
		try {
			fr = new FileReader(path); 
			int frRead = fr.read();
			while(frRead != -1) {//-1 : EOF(End of File) : -1이 자체적으로 뜬다.
				System.out.print((char)frRead);
				frRead = fr.read();
			}//while
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
	}//main
}//class
