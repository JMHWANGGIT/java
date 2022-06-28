package ch10;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.List;

public class Event7ListEvent implements ItemListener{
	
		List list;
		
	Event7ListEvent(List list){
		this.list = list;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println(e.getItem());
		int idx = Integer.parseInt(e.getItem().toString());
		System.out.println(list.getItem(idx));
	}

}
