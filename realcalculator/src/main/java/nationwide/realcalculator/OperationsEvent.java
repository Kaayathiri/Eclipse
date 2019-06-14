package nationwide.realcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class OperationsEvent implements ActionListener {
	TextField T1;
	String opt,operation;
	int FirstNumber,SecondNumber;
	public OperationsEvent (TextField T) {
		T1=T;
	}
	public void actionPerformed (ActionEvent X) {
		Button btn=(Button) X.getSource();
		opt=btn.getLabel();
		if (opt.contentEquals("C")){
			T1.setText("");
		}
		else if(opt.contentEquals("=")){
			int result=0;
			SecondNumber=Integer.parseInt(T1.getText());
			if(operation.equals("+")){
				result=FirstNumber+SecondNumber;
			}
			if(operation.equals("-")){
				result=FirstNumber-SecondNumber;
			}
			if(operation.equals("*")){
				result=FirstNumber*SecondNumber;
			}
			if(operation.equals("/")){
				result=FirstNumber/SecondNumber;
			}
			
			T1.setText(Integer.toString(result));
			
		}
		else {
				FirstNumber=Integer.parseInt(T1.getText());
				T1.setText("");
				operation=opt;	
			}
	}
}
