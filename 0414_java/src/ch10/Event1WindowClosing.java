package ch10;

import java.awt.Color;
import java.awt.Frame;

public class Event1WindowClosing {

	Frame frm;
	WindowadapterObject closeObj;
	
	
	public Event1WindowClosing() {
		
		frm = new Frame("close test");
		closeObj = new WindowadapterObject();
		
	}//Event1WindowClosing(constructor)
	
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.orange);
		frm.setVisible(true);
		
		frm.addWindowListener(closeObj);
		//frm.addWindowListener : frm 윈도우 이벤트를 감지하는 센서를 추가하라
		//frm.addWindowListener(closeObj) : 윈도우 이벤트를 처리하는 로직은 closeObj에 있다. 
		//JRE에게 명령 : frm을 감시하다가, 이벤트가 발생하면, closeObj 객체의 담당 메소드로 전달해라. 
		//우리는 이벤트가 발생하면 수행하는 절차만 정의 -> closeObj(WindowadapterObject)
		//실제로 이벤트가 발생하면 closeObj(WindowadapterObject)의 메소드를 호출하는 것은 JRE.
		
	}//makeGui
	
	public static void main(String[] args) {
		Event1WindowClosing test = new Event1WindowClosing();
		test.makeGui();

	}//main

}//class
