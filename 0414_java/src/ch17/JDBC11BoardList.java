package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.List;

import ch10.WindowadapterObject;

public class JDBC11BoardList {
	
	Frame frm;
	List list;
	Button btn;
	
	JDBC11BoardList(){
		frm = new Frame("게시판 목록");
		list = new List(10, false);
		btn = new Button("SELECT");
	}
	
	void makeGui() {
		frm.setLayout(null);
		frm.setSize(300,300);
		
		list.setBounds(20, 40, 260, 200);
		frm.add(list);
		
		btn.setBounds(240, 250, 50, 30);
		frm.add(btn);
		
		
		frm.setBackground(Color.pink);
		frm.setVisible(true);
	}
	
	void addEvent() {
		frm.addWindowListener(new WindowadapterObject());
		JDBC11BoardListEvent event = new JDBC11BoardListEvent(list);
		btn.addActionListener(event);
	}
	
	public static void main(String[] args) {
		JDBC11BoardList test = new JDBC11BoardList();
		test.makeGui();
		test.addEvent();
	}//main
}//class
