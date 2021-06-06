import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class Calculator {
	JPanel windowContent;
	JPanel pl;
	JTextField displayField;
	JButton button0;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	
	Calculator() {
		windowContent = new JPanel();
		
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		displayField = new JTextField(30);
		windowContent.add("North", displayField);
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		
		pl = new JPanel();
		GridLayout gp = new GridLayout(4,3);
		pl.setLayout(gp);
		
		pl.add(button0);
		pl.add(button1);
		pl.add(button2);
		pl.add(button3);
		pl.add(button4);
		pl.add(button5);
		pl.add(button6);
		pl.add(button8);
		pl.add(button9);
		pl.add(buttonPoint);
		pl.add(buttonEqual);
		
		windowContent.add("Center", pl);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
	}
	
}