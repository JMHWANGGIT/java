package ch09;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class AWT9Menu {
	
	
	Frame frm;
	MenuBar menubar;
	Menu menu;
	MenuItem menuitem1, menuitem2, menuitem3;
	
	AWT9Menu() {
		frm = new Frame();
		menubar = new MenuBar();
		menu = new Menu("Home");
		menuitem1 = new MenuItem("Open");
		menuitem2 = new MenuItem("Save");
		menuitem3 = new MenuItem("Exit");
	
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
	}//makeGui
	
	
	
	public static void main(String[] args) {
		
		AWT9Menu test = new AWT9Menu();
		test.makeGui();
		
	}//main
	
}//class
