package ch10;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Event5KeyEvent implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("keyTyped!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keyPressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("==============>  keyReleased");
		System.out.println(e.getKeyCode()); //중요!! 공식!! 웹쪽 가면 많이 하게 됨!!
		System.out.println(e.getKeyChar());
	}

}//class
