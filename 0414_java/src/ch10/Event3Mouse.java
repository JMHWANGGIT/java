package ch10;

import java.awt.Color;
import java.awt.Frame;

public class Event3Mouse {
	
	Frame frm;
	Event3Mouse(){
		
		frm = new Frame("제목 옵니다."); //여러개 만들어지면 안되니까 생성자에 new 위치 
		
	}//Event3Mouse
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.gray);
		frm.setVisible(true);
	}//makeGui()
	
	public void addEvent() {
		frm.addWindowListener(new WindowadapterObject());
		frm.addMouseListener(new Event3MouseEvent());
		frm.addMouseMotionListener(new Event3MouseMotionEvent());
		frm.addMouseWheelListener(new Event3MouseMotionEvent());
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event3Mouse test = new Event3Mouse();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
