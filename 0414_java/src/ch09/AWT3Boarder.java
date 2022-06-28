package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;


/*
 * BoarderLayout
 * - 컴포넌트를 중앙 북 남 서 동으로 배치 
 * - Frame은 BoarderLayout default layout : 기본적용 되어있음. 
 * - 주의!!! 북 남 서 동 중에서 없는 부분은 '중'이 침범
 */

public class AWT3Boarder {
	
	public Frame frm;
	public Button btn1, btn2, btn3, btn4, btn5;
	public BorderLayout border;
	
	
	public AWT3Boarder() {
		frm = new Frame("제목 오는 곳");
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		border = new BorderLayout();
	}
	
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		frm.setLayout(border);
		frm.add(btn1, BorderLayout.CENTER);
		frm.add(btn2, BorderLayout.NORTH);
		frm.add(btn3, BorderLayout.SOUTH);
		frm.add(btn4, BorderLayout.WEST);
		frm.add(btn5, BorderLayout.EAST);
	}//makeGUI메소드
	
	
	public static void main(String[] args) {
		
		AWT3Boarder test = new AWT3Boarder();
		test.makeGUI();
		
		
	}//main
}//class
