package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * FileInputStream
 * - Node Stream
 * - 파일을 연결해서 읽어오는 Stream.
 * - 8bit 입력 
 * - 비영어권 문자가 깨지는 단점. 
 * 
 * InputStreamReader
 * - Filter Stream
 * - data 변환 가능 
 * - 8비트 입력을 16bit로 전환
 * 
 * FileInputStream을 InputSteamReader로 Filtering하면 비영어권 문자 입력 가능. 
 * 주의!!! close는 생성의 역순 : 나중에 생성한 Stream을 먼저 close한다!!! 
 * 
 */
public class Ch14Ex02 {
	public static void main(String[] args) {

		String path = "C:\\Users\\kotor\\javaiotest\\io2.txt";
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		
		try {
			fis = new FileInputStream(path);//path 파일이있는곳. 
			isr = new InputStreamReader(fis); 
			//파일에 접근하는 능력이 없기 때문에 FileInputStream 먼저 동작 후 진행 
			
			int isrRead = isr.read();
			while(isrRead != -1) {//-1 : EOF(End of File)
				System.out.print((char)isrRead);
				isrRead = isr.read();//이게 없으면 한글자로 계속 나옴!! 계속 다음것을 읽어줘야함. 
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();//나중에 생성한 Stream을 먼저 close한다. 
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//finally
		
	}//main
}//class

