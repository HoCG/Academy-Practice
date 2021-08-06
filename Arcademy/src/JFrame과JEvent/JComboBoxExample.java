package JFrame과JEvent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Your Name");
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		JComboBox cars = new JComboBox();    //JComboBox라는점!
		cars.addItem("Honda");
		cars.addItem("Ford");
		cars.addItem("Audi");
		cars.addItem("BMW");
		cp.add(cars);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(150,150);
		frame.setVisible(true);
	}

}
