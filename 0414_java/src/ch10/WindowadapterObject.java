package ch10;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * window Event : 컴의 그래픽 환경에서 유저의 모든 활동
 * Windowadapter : 윈도우 창에서 일어나는 유저의 모든 활동을 담당한다. 
 */
public class WindowadapterObject extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
	}//windowClosing
	
}//class
