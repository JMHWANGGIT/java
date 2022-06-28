package ch10.ch10test;

import java.awt.Color;
import java.awt.Frame;

import ch10.Event4WindowEvent;

public class Event4Window {
	
	Frame frm;
	Event4Window(){
		
		frm = new Frame("제목 옵니다."); //여러개 만들어지면 안되니까 생성자에 new 위치 
		
	}//Event3Mouse
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.gray);
		frm.setVisible(true);
	}//makeGui()
	
	public void addEvent() {
		frm.addWindowListener(new Event4WindowEvent());
		
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event4Window test = new Event4Window();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
