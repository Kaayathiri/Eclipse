package nationwide.calculator;
import java.awt.event.*;
import java.awt.*;


public class subtraction implements ActionListener {
	TextField no1, no2, result;
public subtraction (TextField A, TextField B, TextField C) {
	no1=A;
	no2=B;
	result=C;
}

public void actionPerformed (ActionEvent X) {
	int A, B, C;
	A=Integer.parseInt(no1.getText());
	B=Integer.parseInt(no2.getText());
	C=A-B;
	result.setText(Integer.toString(C));
			}
}
