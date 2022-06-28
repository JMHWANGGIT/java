package ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			String tmp = scan.nextLine();
			if(tmp.equals("-1")) break;
		
			Socket soc = new Socket("127.0.0.1", 8765);
//			Socket soc = new Socket("192.168.0.38", 8765);
			InputStream is = soc.getInputStream();
			OutputStream os = soc.getOutputStream();
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(tmp);
			System.out.println(dis.readUTF());
			
			dis.close();
			is.close();
			dos.close();
			os.close();
			soc.close();
			
		}//while
		
		scan.close();
		
	}//main
}//class
