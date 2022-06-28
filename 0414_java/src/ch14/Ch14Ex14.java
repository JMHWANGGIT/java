package ch14;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream
 * - FilterStream
 * - Data type의 형태로 data를 읽거나 쓰는 기능을 제공. 
 */
public class Ch14Ex14 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io8.txt";
		FileInputStream fis = null;
		DataInputStream dis = null;
		
				
		try {
			fis = new FileInputStream(path);
			dis = new DataInputStream(fis); //연결하는 작업 
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try2
		}//finally
		
	}//main
}//class
