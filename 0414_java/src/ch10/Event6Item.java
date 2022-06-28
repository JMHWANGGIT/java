package ch10;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;

public class Event6Item {
	
	Frame frm;
	Choice choice1;
	Checkbox box1, box2, radio1, radio2;
	CheckboxGroup group;
	
	Event6Item(){
		
		frm = new Frame("설문조사");
		choice1 = new Choice();
		box1 = new Checkbox("apple");	
		box2 = new Checkbox("orange", true);
		group = new CheckboxGroup();
		radio1 = new Checkbox("soccer", false, group);	
		radio2 = new Checkbox("baseball", false, group);
	}//Event6Item()
	
	
	public void makeGui() {
		
		frm.setSize(500,500);
		frm.setVisible(true);
		frm.setLayout(null);
		frm.add(choice1);
		
		choice1.add("korea");choice1.add("USA");choice1.add("UK");
		choice1.setBounds(10,35,200,50);
		
		box1.setBounds(10,100,100,30);
		box2.setBounds(120,100,100,30);
		frm.add(box1);
		frm.add(box2);
		
		radio1.setBounds(10, 150, 100, 30);
		radio2.setBounds(120, 150, 100, 30);
		frm.add(radio1);
		frm.add(radio2);
		
		frm.setBackground(Color.pink);
	}//makeGui()
	
	public void addEvent() {
		frm.addWindowListener(new WindowadapterObject());
		choice1.addItemListener(new Event6ItemEvent());
		box1.addItemListener(new Event6ItemEvent());
		box2.addItemListener(new Event6ItemEvent());
		radio1.addItemListener(new Event6ItemEvent());
		radio2.addItemListener(new Event6ItemEvent());
	}//addEvent()
	
	public static void main(String[] args) {
		
		Event6Item test = new Event6Item();
		test.makeGui();
		test.addEvent();
		
	}//main
}//class
