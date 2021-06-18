import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;
import javax.swing.JButton;
//import javax.swing.JTextField;

public class CalculatorEngine implements ActionListener {

	Calculator parent;
	
	char selectedAction;
	double currentResult = 0;
	
	public CalculatorEngine(Calculator parent) {
		this.parent = parent;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton clickedButton = (JButton) e.getSource();
		String clickedButtonLabel = clickedButton.getText();
		String displayField = parent.displayField.getText();
		double displayValue = 0;
		
		if (!"".equals(displayField)) {
			displayValue = Double.parseDouble(displayField);
		}
		
		Object src = e.getSource();
		
		if (src == parent.buttonAdd) {
			selectedAction = '+';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonSubtraction) {
			selectedAction = '-';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonDivision) {
			selectedAction = '/';
			currentResult = displayValue;
			parent.displayField.setText(""); 
		} else if (src == parent.buttonMultiplication) {
			selectedAction = '*';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if(src == parent.buttonEqual) {
			if (selectedAction == '+') {
				currentResult += displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '-') {
				currentResult -= displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '/') {
				currentResult /= displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '*') {
				currentResult *= displayValue;
				parent.displayField.setText("" + currentResult);
			}
		} else {
			parent.displayField.setText(displayField + clickedButtonLabel);
		}
	}
}
