package JFrame°úJEvent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonExample {    //½ºÀ® j¹öÆ°!!
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Your Name");
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		JRadioButton mathsButton = new JRadioButton("Maths");
		mathsButton.setSelected(true);
		JRadioButton physicsButton = new JRadioButton("Physics");
		physicsButton.setSelected(false);
		JRadioButton chemistryButton = new JRadioButton("Chemistry");
		chemistryButton.setSelected(false);
		JRadioButton biologyButton = new JRadioButton("Biology");
		biologyButton.setSelected(false);
		
		cp.add(mathsButton);
		cp.add(physicsButton);
		cp.add(chemistryButton);
		cp.add(biologyButton);
		
		frame.pack();
		frame.setSize(600,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
