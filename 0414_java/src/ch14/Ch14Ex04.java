package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream
 *  - NodeStream
 *  - ByteStream : data를 8bit로 출력.
 *  - 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 */
public class Ch14Ex04 {

	public static void main(String[] args) {

		String path = "C:\\Users\\ict01-00\\javaiotest\\io3.txt";
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream(path);
			fos.write(104);//h
			fos.write(105);//i

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally

	}//main

}//class
