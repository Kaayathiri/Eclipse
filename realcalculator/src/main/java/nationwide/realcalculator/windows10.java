package nationwide.realcalculator;

import java.awt.event.*;
import java.awt.*;
public class windows10 {

	public static void main(String[] args) {
		Frame F=new Frame();
		Panel P1=new Panel();
		Panel P2=new Panel();
		TextField T=new TextField(10);
		Eventhandler EE=new Eventhandler(T);
		OperationsEvent OE=new OperationsEvent(T);
		Button B0=new Button("0");
		Button B1=new Button("1");
		Button B2=new Button("2");
		Button B3=new Button("3");
		Button B4=new Button("4");
		Button B5=new Button("5");
		Button B6=new Button("6");
		Button B7=new Button("7");
		Button B8=new Button("8");
		Button B9=new Button("9");
		B0.addActionListener(EE);
		B1.addActionListener(EE);
		B2.addActionListener(EE);
		B3.addActionListener(EE);
		B4.addActionListener(EE);
		B5.addActionListener(EE);
		B6.addActionListener(EE);
		B7.addActionListener(EE);
		B8.addActionListener(EE);
		B9.addActionListener(EE);
		
		Button btn_add =new Button("+");
		Button btn_sub=new Button("-");
		Button btn_mult=new Button("*");
		Button btn_div=new Button("/");
		Button btn_eq=new Button("=");
		Button btn_clear=new Button("C");
		btn_add.addActionListener(OE);
		btn_sub.addActionListener(OE);
		btn_mult.addActionListener(OE);
		btn_div.addActionListener(OE);
		btn_eq.addActionListener(OE);
		btn_clear.addActionListener(OE);
		
		
		FlowLayout F1=new FlowLayout();
		GridLayout G=new GridLayout (4,4);
		P1.setLayout(F1);
		P2.setLayout(G);
		
		
		

		P1.add(T);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(btn_add);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(btn_sub);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(btn_mult);
		P2.add(btn_clear);
		P2.add(B0);
		P2.add(btn_eq);
		P2.add(btn_div);

		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.CENTER);
		
		
		
		

		F.setSize(500,500);
		F.setVisible(true);
	}

}
