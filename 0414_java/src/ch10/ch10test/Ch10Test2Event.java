package ch10.ch10test;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch10Test2Event implements ActionListener {

	TextField text;
	int firstNum, secondNum, resultNum;
	String giho;

	Ch10Test2Event(){}
	Ch10Test2Event(TextField text){
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		//System.out.println(cmd);

		if(cmd.equals("Cls")) {//text 창의 값을 지우기만 하면 됨

			text.setText("");

		} else if(cmd.equals("=")) {

			secondNum = Integer.parseInt(text.getText());
			System.out.println("secondNum : " + secondNum);
			switch(giho) {
			case "+" : resultNum = firstNum + secondNum; break;
			case "-" : resultNum = firstNum - secondNum; break;
			case "*" : resultNum = firstNum * secondNum; break;
			case "/" : resultNum = firstNum / secondNum; break;
//			case "+" : text.setText(firstNum + secondNum + ""); break;
//			case "-" : text.setText(firstNum - secondNum + ""); break;
//			case "*" : text.setText(firstNum * secondNum + ""); break;
//			case "/" : text.setText(firstNum / secondNum + ""); break;
			}
			text.setText(resultNum + ""); 
			// + ""를 하는 이유 setText는 문자를 받는 함수 하지만 resultNum은 숫자.
			// 따라서 빈공간을 넣어서 숫자 + "" = 문자로 만들어 줘야 함. 
			System.out.printf("%d %s %d = %d\n\n"
							, firstNum, giho, secondNum, resultNum);

		} else if(cmd.equals("+") || cmd.equals("-")
					|| cmd.equals("*") || cmd.equals("/")) {

			firstNum = Integer.parseInt(text.getText());
			text.setText("");
			giho = cmd;
			System.out.println("firstNum : " + firstNum);
			System.out.println("giho : " + giho);

		} else {//유저가 입력하는 숫자를 보여준다

			String tmp = text.getText();
			text.setText(tmp + cmd);

		}//if

	}//actionPerformed

}//class




