import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		JPanel windowContent = new JPanel();
		
//		FlowLayout f1 = new FlowLayout();
//		windowContent.setLayout(f1);
		GridLayout gl = new GridLayout(4,2,5,5);
		windowContent.setLayout(gl);
		
		JLabel label = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		
		JLabel label2 = new JLabel("Nuber 2:");
		JTextField field2 = new JTextField(10);
		
		JLabel labelSum = new JLabel("Sum:");
		JTextField fieldResult = new JTextField(20);
		
		JButton go = new JButton("Add");
		
		windowContent.add(label);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(labelSum);
		windowContent.add(fieldResult);
		windowContent.add(go);
		
		JFrame frame = new JFrame("My first calculator");
		frame.setContentPane(windowContent);
		
		frame.setSize(400, 100);
		frame.setVisible(true);
	}
	
}
