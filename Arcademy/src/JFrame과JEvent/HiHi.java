package JFrame��JEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HiHi extends JFrame { // üũ�ڽ� �̺�Ʈó��
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		Box b0 = new Box(BoxLayout.Y_AXIS);
		JButton B2 = new JButton("����");
		JButton B3 = new JButton("����");
		JButton B4 = new JButton("����");    //��ư��
		JButton B5 = new JButton("����");
		B2.setFont(new Font("�������", Font.BOLD, 30));
		B3.setFont(new Font("�������", Font.BOLD, 30));
		B4.setFont(new Font("�������", Font.BOLD, 30));
		B5.setFont(new Font("�������", Font.BOLD, 30));
		JLabel label = new JLabel("*�޴��� ������");
		label.setFont(new Font("�������", Font.BOLD, 15));
		JLabel imgLbl = new JLabel();
		b0.add(label);
		b0.add(B2);
		b0.add(B3);
		b0.add(B4);
		b0.add(B5);
		
		
        ImageIcon bsImg = new ImageIcon(HiHi.class.getResource("HH.jpg"));
        // �� �󺧿� ������ ����
        imgLbl.setIcon(bsImg);
        // �� ��Ÿ ����
        imgLbl.setBounds(30, 30, 122, 130);//������ġ ����.
        imgLbl.setHorizontalAlignment(JLabel.RIGHT);
		cp.add(b0);
		
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().add(imgLbl);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
