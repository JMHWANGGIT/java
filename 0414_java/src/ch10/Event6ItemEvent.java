package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Event6ItemEvent implements ItemListener{

	@Override//아이템의 상태가 바뀌었네요~
	public void itemStateChanged(ItemEvent e) {
		
		System.out.println(e.getItem());
		System.out.println(e.getStateChange());
	}

}//class
