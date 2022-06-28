package ch09;

import java.awt.Color;

/*
 * AWT : Abstract Window Toolkit : 윈도우 화면을 만드는 도구상자 
 * - container : 다른 객체를 담는 일종의 그림판 (Frame, Panel)
 * - layout : 그림판 위에 객체의 위치를 정해주는 개념 
 * - components : 그림판 위에 올라가는 객체들(Butten, CheckBox 등) 
 * - menu: 메뉴 : MenuBar, Menu, MenuItem
 */

/*
 * Frame 주의사항 
 * - 반드시 setVisiable(true);해야한다. 
 * - Frame은 두 개 이상 같이 사용 안됨. 
 * - add()메소드를 통해 다른 components를 붙일 수 있음. 
 */

import java.awt.Frame;
import java.awt.Panel;

public class AWT2Panel {
	
	
	public Frame frm; //Frame메소드
	public Panel p1;//Panel메소드
	
	
	
	
	public AWT2Panel(String str) {
		frm = new Frame(str);
		p1 = new Panel();
	}//AWT1Frame메소드 : 제목받기 
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		p1.setBackground(Color.green);
		frm.add(p1);
	}//makeGUI메소드 : 크기 & 보이기 
	
	public static void main(String[] args) {
		
		AWT2Panel test = new AWT2Panel("First Window");
		test.makeGUI();
	}//main
}//class
