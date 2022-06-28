package ch14.test;

import java.awt.FileDialog;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MemoPadEvent extends WindowAdapter implements ActionListener{
	
	
	FileDialog fileDialog4Open, fileDialog4Save;
	TextArea text;
	
	MemoPadEvent(FileDialog fd1, FileDialog fd2, TextArea ta){
		
		fileDialog4Open = fd1;
		fileDialog4Save = fd2;
		text = ta;
		
	}//MemoPadEvent()생성자
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Save")) {
			fileDialog4Save.setVisible(true);
			
			File path = null;
			try {	
				path = fileDialog4Save.getFiles()[0];
				//복수로 파일을 긁어와서 선택할때 선택한 첫번재 파일(내가 선택한파일)을 긁어오는것. 
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("파일선택을 취소하셨습니다.");
				return;
			}//try~catch
			
			PrintWriter pw = null; 
			//선언과 생성을 분리!(PrintWriter pw = new PrintWriter(path);
			try {
				pw = new PrintWriter(path);
				pw.println(text.getText());				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				pw.close();				
			}//finally
		}//if(save)(cmd.equals("Save"))
		
		else if(cmd.equals("Open")) {
			
			fileDialog4Open.setVisible(true);
			File openPath = null;
			try {
			openPath = fileDialog4Open.getFiles()[0];
			} catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("파일 선택을 취소하셨습니다.");
				return;
			}//try~catch
			
			FileReader fr = null;
			BufferedReader br = null;
			try {
			fr = new FileReader(openPath);
			br = new BufferedReader(fr);
			StringBuilder sb = new StringBuilder("");
			String readLine = br.readLine();
			while(readLine != null) {
				sb.append(readLine + "\n");
				readLine = br.readLine();
			}//while
			text.setText(sb.toString());
			} catch(IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}//try~catch2
			}//finally
		}//if (cmd.equals("Open"))
		
		else if(cmd.equals("Exit")) {
			System.exit(0);
		}//if (cmd.equals("Exit"))
		
	}//actionPerformed()
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}//windowClosing

	
	
}//class
