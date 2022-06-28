package ch10.ch10test;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import ch10.WindowadapterObject;

public class Ch10Test3Menu {

	Frame frm;
	MenuBar menuBar;
	Menu menu;
	MenuItem menuItem1, menuItem2, menuItem3;
	FileDialog openFile;
	Ch10Test3Event event;

	Ch10Test3Menu(){
		frm = new Frame("메뉴");
		menuBar = new MenuBar();
		menu = new Menu("Home");
		menuItem1 = new MenuItem("Open");
		menuItem2 = new MenuItem("Save");
		menuItem3 = new MenuItem("Exit");
		openFile = new FileDialog(frm,"My File Open"); //부모창, 파일 다이아로그 제목 
		event = new Ch10Test3Event(openFile);
	}//Ch10Test3Menu

	public void makeGui() {
		frm.setSize(300, 300);
		frm.setBackground(Color.pink);
		frm.setVisible(true);

		frm.setMenuBar(menuBar);
		menuBar.add(menu);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.addSeparator(); //구분선(구분자)
		menu.add(menuItem3);
		
		addEvent();
	}//makeGui
	
	
	public void addEvent() {
		
		frm.addWindowListener(new WindowadapterObject());
		menuItem1.addActionListener(event);
		menuItem3.addActionListener(event);
		
	}//addEvent 

}//AWT9Menu









