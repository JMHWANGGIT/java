package ch10;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;

public class Event9Card {
	
	
	Frame frm;
	MenuBar menubar;
	Menu menu;
	MenuItem menuitem1, menuitem2, menuitem3;
	CardLayout card;
	Panel pan1, pan2, pan3;
	Event9CardEvent event;
	
	
	Event9Card() {
		
		frm = new Frame();
		menubar = new MenuBar();
		menu = new Menu("Home");
		menuitem1 = new MenuItem("Regist");
		menuitem2 = new MenuItem("List");
		menuitem3 = new MenuItem("Exit");
		card = new CardLayout();
		pan1 = new Panel();
		pan2 = new Panel();
		pan3 = new Panel();
		event = new Event9CardEvent(card, frm);
		
	}//AWT9Menu()
	
	
	public void makeGui() {
		frm.setLayout(card);
		frm.setSize(300,300);
		frm.setVisible(true);
		
		frm.setMenuBar(menubar);
		menubar.add(menu);
		menu.add(menuitem1);
		menu.add(menuitem2);
		menu.addSeparator();
		menu.add(menuitem3);
		
		pan1.setBackground(Color.red);
		pan2.setBackground(Color.green);
		pan3.setBackground(Color.blue);
		frm.add(pan1);
		frm.add(pan2);
		frm.add(pan3);
	}//makeGui
	
	public void addEvent() {
		
		frm.addWindowListener(new WindowadapterObject());
		menuitem1.addActionListener(event);
		menuitem2.addActionListener(event);
		
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event9Card test = new Event9Card();
		test.makeGui();
		test.addEvent();
		
	}//main
	
}//class
