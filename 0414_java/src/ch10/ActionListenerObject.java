package ch10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerObject implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		//e.getActionCommand() : 버튼의 텍스트를 읽어온다. : 대소문자구분 
		String commend = e.getActionCommand();
		if(commend.equals("Cls")) {
			System.out.println("화면클리어");
		}else if(commend.equals("=")) {
			System.out.println("두 번째 입력수를 sNum에 저장하고, 기호에 따라 계산수행");
		}else if(commend.equals("+")|| commend.equals("-")
				|| commend.equals("*") || commend.equals("/")) {
			System.out.println("첫번째 입력수를 fNum에 저장하고, 기호는 giho에 저장");
		}
	}//actionPerformed
	
}//class
