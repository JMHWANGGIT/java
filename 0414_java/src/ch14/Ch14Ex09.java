package ch14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch14Ex09 {
	public static void main(String[] args) {
		
		String inPath = "C:\\Users\\kotor\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\kotor\\javaiotest\\swedencopy.txt";
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			//파일읽고
			fr = new FileReader(inPath);
			fw = new FileWriter(outPath);

			//파일돌리고
			int frRead = fr.read();
			while(frRead != -1) {//-1 : EOF : End Of File.
				System.out.print( (char) frRead );
				fw.write(frRead);
				frRead = fr.read();
			}//while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//파일닫고~!
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//catch2
		}//finally
	}//main
}//class
