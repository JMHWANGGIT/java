package ch10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Event3MouseEvent implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("====================> clicked!!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("1. pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("2. mouseRelease");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("프레임의 안으로 마우스 커서가 들어왔습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("마우스가 프레임 밖으로 나갔습니다.");
		
	}

	
	
}//Event3MouseEvent class
