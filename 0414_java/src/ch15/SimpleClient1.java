
package ch15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient1 {
	public static void main(String[] args) throws IOException{
		
		Socket soc = new Socket("192.168.0.38", 5432);
		InputStream is = soc.getInputStream();
		soc.getInputStream();//socket이 가진 기본 연결 기능을 가져오는 표현.
		DataInputStream dis = new DataInputStream(is);
		String str = dis.readUTF();
		System.out.println(str);
		dis.close();
		is.close();
	}//main
}//class
