package JFrame°úJEvent;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Plain Message","Plain",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Question Message","Question",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Warning Message","Warning",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Information Message","Information",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Error Message","Error",JOptionPane.ERROR_MESSAGE);
		
		System.exit(0);
	}
}
