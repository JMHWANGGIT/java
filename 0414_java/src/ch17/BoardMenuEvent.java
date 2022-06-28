package ch17;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardMenuEvent implements ActionListener{
	
	CardLayout cardlayout;
	Frame frame;
	
	BoardMenuEvent(CardLayout card, Frame frm){
		this.cardlayout = card;
		this.frame = frm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd.equals("BoardInsert")) {
			cardlayout.show(frame, "insert");
		}else if(cmd.equals("BoardList")) {
			cardlayout.show(frame, "list");
		}
		
	}//actionPerformed

}//class
