package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;


/*
 * BoarderLayout
 * - 컴포넌트를 중앙 북 남 서 동으로 배치 
 * - Frame은 BoarderLayout default layout : 기본적용 되어있음. 
 * - 주의!!! 북 남 서 동 중에서 없는 부분은 '중'이 침범
 */

/*
 * GridLayOut
 * - 컴포넌트를 엑셀 표처럼 배치 
 * - 주의!! 좌에서 우로, 위에서 아래로 배치 
 */

public class AWT4Grid {
	
	public Frame frm;
	public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	public Button btnEqual, btnPlus, btnMinus, btnMulti, btnDivide, btnClear;
	public GridLayout grid;	
	
	
	
	public AWT4Grid() {
		frm = new Frame("제목 오는 곳");
		grid = new GridLayout(4,4); //격자를 정한다, 가로 세로 설정 
		
		btnEqual = new Button("=");
		btnPlus = new Button("+");
		btnMinus = new Button("-");
		btnMulti = new Button("*");
		btnDivide = new Button("/");
		btnClear = new Button("Cls");
		
		btn1 = new Button("1");
		btn2 = new Button("2");
		btn3 = new Button("3");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
		btn7 = new Button("7");
		btn8 = new Button("8");
		btn9 = new Button("9");
		btn0 = new Button("0");
		
	}
	
	
	public void makeGUI() {
		frm.setSize(500,500);
		frm.setBackground(Color.pink);
		frm.setVisible(true);
		
		
		frm.setLayout(grid);
		
		frm.add(btn7);
		frm.add(btn8);
		frm.add(btn9);
		frm.add(btnDivide);
		
		frm.add(btn4);
		frm.add(btn5);
		frm.add(btn6);
		frm.add(btnMulti);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.add(btnMinus);
		
		frm.add(btnClear);
		frm.add(btn0);
		frm.add(btnEqual);
		frm.add(btnPlus);
		
	}//makeGUI메소드
	
	
	public static void main(String[] args) {
		
		AWT4Grid test = new AWT4Grid();
		test.makeGUI();
		
		
	}//main
}//class
