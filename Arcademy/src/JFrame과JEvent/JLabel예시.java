package JFrame°úJEvent;

import java.awt.Container;
import java.awt.FlowLayout;

//½ºÀ®ÀÇ È°¿ë.
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel¿¹½Ã {
	public static void main(String[] args) {
		JLabel label = new JLabel("Your Name");
		JFrame frame = new JFrame();
		
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(label);
		frame.pack();    //±ÕÇüÀ» ¸ÂÃçÁÜ.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //ÀÌ°Å¶§¹®¿¡ ´Ý±â ´©¸£¸é ´ÝÈù´Ù 
		frame.setVisible(true);
	}

}
