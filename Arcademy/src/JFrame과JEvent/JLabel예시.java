package JFrame��JEvent;

import java.awt.Container;
import java.awt.FlowLayout;

//������ Ȱ��.
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabel���� {
	public static void main(String[] args) {
		JLabel label = new JLabel("Your Name");
		JFrame frame = new JFrame();
		
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(label);
		frame.pack();    //������ ������.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //�̰Ŷ����� �ݱ� ������ ������ 
		frame.setVisible(true);
	}

}
