package JFrame과JEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JColorChooseExample {   //색받아오는 프로그램.
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setTitle("Your Name");
	    final Container cp = frame.getContentPane();
	    
		cp.setLayout(new GridBagLayout());  //그리드 백 레이아웃!
		
		JButton button = new JButton("select color");
		cp.add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(frame, "Choose a color", Color.red);   //JColorChooser로 하여금 동작
				cp.setBackground(c);
			}
		});
		
		frame.setSize(200,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
