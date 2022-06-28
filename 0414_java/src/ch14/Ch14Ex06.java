package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * FileOutputStream
 *  - NodeStream
 *  - ByteStream : data를 8bit로 출력.
 *  - 알파벳 문화권의 언어가 아니면 출력 문자가 깨진다.
 *  
 *  OutputStreamWriter
 *  - FilterStream : data가공 및 변환. 
 *  - data의 8bit출력을 16bit로 변환 
 *  - 문자열을 한번에 출력할 수 있다. (아까와 같은 while문이 필요없다) 
 *  - 
 */

public class Ch14Ex06 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io5.txt";
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			fos = new FileOutputStream(path);
			osw = new OutputStreamWriter(fos);
			
			osw.write("my name is james\n");
			osw.write("제 이름은 개인정보입니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				osw.close();//나중부터! 
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally
		
		
	}//main
}//class
