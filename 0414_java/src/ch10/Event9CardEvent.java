package ch10;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event9CardEvent implements ActionListener{

	CardLayout card;
	Frame frame;
	Event9CardEvent(CardLayout c, Frame f){
		this.card = c;
		this.frame = f;
	}//Event9CardEvent()
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		if(cmd.equals("Rigist")) {
			card.next(frame);
		} else if (cmd.equals("List")) {
			card.next(frame);
		}//if
	}//actionPerformed()

}//Event9CardEvent
