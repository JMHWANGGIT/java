package ch14;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataInputStream / DataOutputStream
 * - FilterStream
 * - Data type의 형태로 data를 읽거나 쓰는 기능을 제공. 
 */
public class Ch14Ex13 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io8.txt";
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
				
		try {
			fos = new FileOutputStream(path);
			dos = new DataOutputStream(fos); //연결했다. path를 dataoutput에다...
			
			dos.writeByte(127);
			dos.writeShort(30000);
			dos.writeInt(2100000000);
			dos.writeLong(900000000000000000L);
			dos.writeFloat(3.14F);
			dos.writeDouble(42.195);
			dos.writeBoolean(true);
			dos.writeChar('h'); dos.writeChar(105);
			dos.writeUTF("DateOutputStream Test...");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//try2
		}//finally
		
	}//main
}//class
