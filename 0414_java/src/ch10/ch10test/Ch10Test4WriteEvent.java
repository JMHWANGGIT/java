package ch10.ch10test;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


// 저장버튼이 클릭되면 tfd1과 tfd2, ta에서 데이터를 가져와서 저장한다. 
public class Ch10Test4WriteEvent implements ActionListener{
	
	//저장객체를 만들었음.저장 단위는??? BoardObj
	ArrayList<BoardObj> list = new ArrayList<BoardObj>();
	TextField feild1, feild2;
	TextArea area;
	
	
	
	public Ch10Test4WriteEvent(){}
	public Ch10Test4WriteEvent(TextField tf1, TextField tf2, TextArea ta){
		this.feild1 = tf1;
		this.feild2 = tf2;
		this.area = ta;
	}//Ch10Test4WriteEvent
	
	
	@Override
	public void actionPerformed(ActionEvent e) {//저장 버튼이 클릭되면 실행. 
		String cmd = e.getActionCommand();
		if(cmd.equals("SAVE")) {
			BoardObj obj = new BoardObj(feild1.getText(),feild2.getText(), area.getText());
			list.add(obj);
			feild1.setText("");
			feild2.setText("");
			area.setText("");
			System.out.println(list);
		}//if
		
	}//actionPerformed

	
	
}//Ch10Test4WriteEvent class
