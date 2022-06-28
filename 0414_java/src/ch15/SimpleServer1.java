package ch15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 인터넷의 기본 개념 : Ip Address, Ip Port
 * - Ip Address : 네트워크 상에서 컴퓨터가 갖는 주소 
 * - Ip Port : 컴퓨터 프로그램 내의 하나의 프로그램이 갖는 외부 통신 번호 
 * 	-> 수신인 : 받는 사람의 개념
 * 
 * Loop Back Address
 * - 내 컴을 표현하는 주소의 또다른 방법. (부메랑)
 * - 127.0.0.0 
 * - localhost
 * 
 * Soket
 * - 데이터 통신의 통로역할을 담당. 
 * - 데이터를 보내는 쪽과 받는 쪽 모두 있어야 한다. 
 * 
 * ServerSocket 
 * - 접속을 대기하는 역할을 하는 객체  
 * - 접속 대기만 함. 접속 성공 후에는 Soket을 통해 통신한다. 
 * - 3way handshake를 통해 연결 통로를 확보한다. 
 * 
 */
public class SimpleServer1 {
	public static void main(String[] args) throws IOException{
		
		ServerSocket ss = new ServerSocket(5432);
		Socket soc = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		while(true) {
			soc = ss.accept(); //5432로 연결 요청이 들어오면, 요청을 승낙하고 soket을 생성.
			os = soc.getOutputStream(); //socket가 가진 기본 연결기능을 가져오는 표현. 
			dos = new DataOutputStream(os); //연결선을 필터링
			dos.writeUTF("server accept test ... ");
			dos.close();
			os.close();
			//일회성 연결 끝.
		}//while
		
	}//main
}//class
