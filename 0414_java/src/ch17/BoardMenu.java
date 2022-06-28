package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ch10.Event1WindowClosing;
import ch10.WindowadapterObject;

public class BoardMenu {
	
	Frame frm;
	MenuBar bar;
	Menu menu;
	MenuItem item1, item2;
	Panel pan1, pan2;
	CardLayout card;
	
	BoardMenu(){
		frm = new Frame("Card Menu");
		bar = new MenuBar();
		menu = new Menu("File");
		item1 = new MenuItem("BoardInsert");
		item2 = new MenuItem("BoardList");
		pan1 = new Panel();
		pan2 = new Panel();
		card = new CardLayout();
	}//생성자 종료 
	
	void makeGui() {
		frm.setSize(300,300);
		
		frm.setMenuBar(bar);
		bar.add(menu);
		menu.add(item1);
		menu.add(item2);
		
		pan1.setBackground(Color.green);
		pan2.setBackground(Color.PINK);
		frm.setLayout(card);
		frm.add(pan1, "list");
		frm.add(pan2, "insert");
		
		
		frm.setVisible(true);
		
	
	}
	
	void addEvent() {
		BoardMenuEvent event = new BoardMenuEvent(card, frm);
		item1.addActionListener(event);
		item2.addActionListener(event);
		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}//windowclosing
		});
	}
	
	
	public static void main(String[] args) {
		BoardMenu test = new BoardMenu();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
