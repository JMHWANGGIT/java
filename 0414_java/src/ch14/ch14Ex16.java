package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ch14Ex16 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io9.txt";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
//			System.out.println(obj.toString());
			
			Ch14Ex15Object testObj = (Ch14Ex15Object)obj;
			System.out.println(testObj.toString());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try
		}//finally
	}//main
}//class
