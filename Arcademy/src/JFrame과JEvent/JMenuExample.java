package JFrame과JEvent;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class JMenuExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Your Name");
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		
		JMenu menu1 = new JMenu("File");   //메뉴이름 설정.
		menu1.add(new JMenuItem("New"));
		menu1.add(new JMenuItem("Open"));
		menu1.add(new JSeparator());
		menu1.add(new JMenuItem("Save"));
		menu1.add(new JMenuItem("Save as..."));
		menu1.add(new JSeparator());
		menu1.add(new JMenuItem("Exit"));
		
		
		JMenu menu2 = new JMenu("Help");
		menu2.add(new JMenuItem("Help Contents"));
		menu2.add(new JSeparator());
		menu2.add(new JMenuItem("About..."));
	    JMenuBar bar = new JMenuBar();
		bar.add(menu1);
		bar.add(menu2);
		
		frame.setJMenuBar(bar);
		frame.setSize(150,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
