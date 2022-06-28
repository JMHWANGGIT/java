package ch15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Server : 서비스를 제공하는 객체. 
 * Client : 서비스를 요청하는 객체. 
 * 
 */

public class SimpleServer1Re {
	public static void main(String[] args) throws IOException{
		
		ServerSocket ss = new ServerSocket(9876);
		// 연결 요청을 받는 역할만 하는 객체 : 문지기 
		
		
		while(true) {
			Socket s = ss.accept();
			//소켓통신 : 실제 데이터 통신 //연결 확립 : 서버와 클라이언트가 서로의 Ip address, port를 알고 있다.
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
		
			dos.writeUTF("second server test...");
		
			dos.close();
			os.close();
			s.close();
			
		}//while
	}//main
}//class
