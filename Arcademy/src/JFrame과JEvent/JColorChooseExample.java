package JFrame��JEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JColorChooseExample {   //���޾ƿ��� ���α׷�.
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setTitle("Your Name");
	    final Container cp = frame.getContentPane();
	    
		cp.setLayout(new GridBagLayout());  //�׸��� �� ���̾ƿ�!
		
		JButton button = new JButton("select color");
		cp.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(frame, "Choose a color", Color.red);   //JColorChooser�� �Ͽ��� ����
				cp.setBackground(c);
			}
		});
		
		frame.setSize(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
