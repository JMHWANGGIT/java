package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

import ch10.Event4WindowEvent;

public class Event5Key {
	
	Frame frm;
	TextField tf;
	
	Event5Key(){
		
		frm = new Frame("제목 옵니다."); //여러개 만들어지면 안되니까 생성자에 new 위치 
		tf = new TextField();
		
	}//Event3Mouse
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.gray);
		frm.setVisible(true);
		
		frm.add(tf, BorderLayout.NORTH);
	}//makeGui()
	
	public void addEvent() {
		frm.addWindowListener(new WindowadapterObject());
		tf.addKeyListener(new Event5KeyEvent());
		
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event5Key test = new Event5Key();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
