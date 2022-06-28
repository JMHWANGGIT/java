package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedReader
 * -FilterStream 
 * - 한 줄(라인)씩 읽는 기능 
 * 
 * BufferedWriter
 * -FilterStream 
 * - 자동 줄 바꿈 기능 
 */
public class Ch14EX10 {
	
	public static void main(String[] args) {
		
		String inPath = "C:\\Users\\kotor\\javaiotest\\sweden.txt";
		String outPath = "C:\\Users\\kotor\\javaiotest\\swedencopy2.txt";
		FileReader fr = null;	BufferedReader br = null;
		FileWriter fw = null;	BufferedWriter bw = null;
		
		try {
			
			fr = new FileReader(inPath);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(outPath);
			bw = new BufferedWriter(fw);
			
			String str = br.readLine(); //한줄씩 읽어요.
			
			while(str != null) {//-1 : EOF
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				str = br.readLine();
			}//while
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	fr.close();
				bw.close();	fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
	}//main
	
}//class
