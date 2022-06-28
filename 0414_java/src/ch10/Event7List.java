package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;

public class Event7List {
	
	Frame frm;
	List list;
	
	Event7List(){
		
		frm = new Frame("제목 옵니다."); //여러개 만들어지면 안되니까 생성자에 new 위치 
		list = new List(5,false);
	}//Event3Mouse
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setBackground(Color.gray);
		frm.setVisible(true);
		
		frm.add(list, BorderLayout.CENTER);
		list.add("apple");
		list.add("banana");
		list.add("mango");
		
	}//makeGui()
	
	public void addEvent() {
		frm.addWindowListener(new WindowadapterObject());
		list.addItemListener(new Event7ListEvent(list));
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event7List test = new Event7List();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
