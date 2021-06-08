import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
	JPanel windowContent;
	JPanel pl;
	JPanel p2;
	JFormattedTextField displayField;
	JButton [] numButtons = new JButton[10];
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
//	JButton button6;
//	JButton button7;
//	JButton button8;
//	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonAdd;
	JButton buttonSubtraction;
	JButton buttonDivision;
	JButton buttonMultiplication;
	
	
	Calculator() {
		windowContent = new JPanel();
		
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		
		displayField = new JFormattedTextField();
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		windowContent.add("North", displayField);
		
		for (int i = 0; i < numButtons.length; i++ ) {
			numButtons[i] = new JButton(String.valueOf(i));
		}
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		
		pl = new JPanel();
		GridLayout gp = new GridLayout(4,3);
		pl.setLayout(gp);
		
		for(int i = 1; i < numButtons.length; i++) {
			pl.add(numButtons[i]);
		}
		pl.add(numButtons[0]);
		pl.add(buttonPoint);
		pl.add(buttonEqual);
		
		windowContent.add("Center", pl);
		
		p2 = new JPanel();
		GridLayout gpAction = new GridLayout(4,1);
		p2.setLayout(gpAction);
		
		buttonAdd = new JButton("+");
		buttonSubtraction = new JButton("-");
		buttonDivision = new JButton("/");
		buttonMultiplication = new JButton("*");
		
		p2.add(buttonAdd);
		p2.add(buttonSubtraction);
		p2.add(buttonDivision);
		p2.add(buttonMultiplication);
		
		windowContent.add("East", p2);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}
