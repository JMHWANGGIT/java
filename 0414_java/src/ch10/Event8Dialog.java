package ch10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
/*
 * 객체를 만드는데도 순서가 있다. 
 * 순서에 맞게 잘 짜는 것도 중요함. 
 * 문법 에러는 안됨, 그래서 오류잡기가 매우 어려움!! 
 */
public class Event8Dialog {
	
	
	Frame frm;
	MenuBar menubar;
	Menu menu;
	MenuItem menuitem1, menuitem2, menuitem3;
	Dialog dia;
	Event8DialogEvent event;
	WindowadapterObject closeEvent;
	Label label;
	Button btn;
	
	
	Event8Dialog() {
		frm = new Frame();
		menubar = new MenuBar();
		menu = new Menu("Home");
		menuitem1 = new MenuItem("Open");
		menuitem2 = new MenuItem("Save");
		menuitem3 = new MenuItem("Exit");
		dia = new Dialog(frm,"comfirm",false); //true : modal
		/*
		 * modal : sub창이 실행중일 때, 본체를 클릭할 수 있나?
		 * modal true : sub창이 실행중일 때, 본체를 클릭 불가능.
		 * modal false : sub창이 실행중일 때, 본체를 클릭가능.
		 */
		
		event = new Event8DialogEvent(dia);
		closeEvent = new WindowadapterObject();
		label = new Label("Really Exit??");
		btn = new Button(" O K ");
	}//AWT9Menu()
	
	
	public void makeGui() {
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuitem1);
		menu.add(menuitem2);
		menu.addSeparator();
		menu.add(menuitem3);
		
		dia.setSize(100,90);
		dia.add(label, BorderLayout.CENTER);
		dia.add(btn, BorderLayout.SOUTH);
	}//makeGui
	
	public void addEvent() {
		
		frm.addWindowListener(closeEvent);
		menuitem3.addActionListener(event);
		dia.addWindowListener(closeEvent);		
		btn.addActionListener(event);
		
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event8Dialog test = new Event8Dialog();
		test.makeGui();
		test.addEvent();
		
		
	}//main
	
}//class
