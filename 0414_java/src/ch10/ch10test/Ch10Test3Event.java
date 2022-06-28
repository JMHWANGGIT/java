package ch10.ch10test;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch10Test3Event implements ActionListener{

	FileDialog fileDialog;
	
	public Ch10Test3Event(FileDialog fileDialog) {
		this.fileDialog = fileDialog;
	}//Ch10Test3Event()
	
	@Override
	public void actionPerformed(ActionEvent e) {


		String cmd = e.getActionCommand();
		if(cmd.equals("Exit")) {
			System.exit(0);
		}else if (cmd.equals("Open")) {
			fileDialog.setVisible(true);
			System.out.println("selected File : " + fileDialog.getDirectory() + fileDialog.getFile());
		}
		
	}//actionPerformed
	
}//Ch10Test3Event
