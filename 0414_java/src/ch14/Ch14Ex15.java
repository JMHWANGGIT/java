package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectInputStream / ObjectOutputStream
 * - Object도 Input/Output 가능 
 * - class type을 만들어진 객체를 Input/Output
 * - FilterStream
 * 
 * 주의!! implements Serializable 중요!! 
 * Object 출력시에는 반드시 Serializable 를 implements 해주어야 한다.
 */

class Ch14Ex15Object implements Serializable{
	private String message = "this is test object.";
	@Override
		public String toString() {
			return message;
		}
}//Ch14Ex15Object 

public class Ch14Ex15 {
	public static void main(String[] args) {
		
		Ch14Ex15Object obj = new Ch14Ex15Object();
		String path = "C:\\Users\\kotor\\javaiotest\\io9.txt";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos); //연결해서 사용해야 한다. 
			oos.writeObject(obj);
			
		} catch (IOException e) {
			//FileNotFountException, IOException 에러 방지. IOException이 상위.
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally
		
	}//main
}//class
