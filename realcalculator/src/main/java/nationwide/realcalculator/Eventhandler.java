package nationwide.realcalculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Eventhandler implements ActionListener {
	TextField result;
	public Eventhandler(TextField E) {
		result=E;
	}
	public void actionPerformed (ActionEvent E1) {
		 Button btn = (Button) E1.getSource();
		 result.setText(result.getText()+btn.getLabel());
	}
	 
}
