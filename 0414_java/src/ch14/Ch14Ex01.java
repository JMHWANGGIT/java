package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * pakage java.io.* -> IO
 * Input / Output + Stream : data가 물처럼 흘러간다는 의미. 
 * - Input /Ouput은 상대적인 의미 
 * - Input Stream : 현재 코드로 data가 들어온다. 
 * - Output Stream : 현재 코드에서 data가 나간다. 
 * - Stream : data의 흐름을 의미. 
 * 
 * Byte Stream 
 * - data의 입출력 단위가 8bit.
 * - 이름이 ~InputStream, ~OutputStream
 * 
 * Char Stream
 * - data의 입출력 단위가 16bit.
 * - 이름이 ~Reader, Writer
 * 
 * Node Stream
 * - data source와 data destination을 연결하는 개념 
 * - FileInputStream, FileOutputStream, FileReader, FileWriter
 * 
 * Filter Stream 
 * - data의 가공이나, 특수기능 제공을 목적으로 하는 Stream의 개념 
 * - InputStreamReader, OutputStreamWriter(8bit를 16bit로 입출력해주어라!)
 * - Node Stream이 없이 독립적으로 존재할 수 없다. 
 * 
 * 주의!! 반드시 close 해주어야 한다!  
 * - close는 입출력 객체를 메모리에서 삭제 요청하는 행위 
 * - close를 하지 않으면, 메모리에 사용하지 않는 입출력 객체가 누적된다. 
 */
public class Ch14Ex01 {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kotor\\javaiotest\\io1.txt";
		
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream(path);
			int fisRead = fis.read();
			System.out.println("fisRead : " + fisRead); //ascii code
			System.out.println("(char)fisRead : " + (char)fisRead);
			
			while (fisRead != -1) {//-1 : EOF(End of File) -> 참고 EOFException
				System.out.print((char)fisRead);
				fisRead = fis.read();
			}//while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
		
		
		
	}//main
}//class
