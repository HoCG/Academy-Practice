package JFrame과JEvent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoxExample {
	
	public static void main(String[] args)  {
		JFrame frame= new JFrame();
		frame.setTitle("Your Name");
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		Box b0 = new Box(BoxLayout.Y_AXIS);
		Box b1 = new Box(BoxLayout.X_AXIS);
		
		JLabel label1 = new JLabel("Label 1");
		JLabel label2 = new JLabel("Label 2");
		JLabel label3 = new JLabel("Label 3");       //라벨부
		JLabel label4 = new JLabel("Label 4");
		JLabel label5 = new JLabel("Label 5");
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");    //버튼부
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		
		b0.add(label1);
		b0.add(label2);
		b0.add(label3);     //라벨추가
		b0.add(label4);
		b0.add(label5);
		
		b1.add(button1);
		b1.add(button2);
		b1.add(button3);    //버튼추가
		b1.add(button4);
		b1.add(button5);
		
		cp.add(b0);
		cp.add(b1);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
