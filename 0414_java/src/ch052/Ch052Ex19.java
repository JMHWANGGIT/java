package ch052;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ch10.Event1WindowClosing;

public class Ch052Ex19 {
	public static void main(String[] args) {
		
		Frame frm = new Frame("Anonymous Inner Class");
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		
		frm.addWindowListener(
				new WindowAdapter() {//class도 없고 변수명도 없는 임시 class
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}//windowClosing
				}//new WindowAdapter
		);//addWindowListener
		
		
	}//main
}//class
