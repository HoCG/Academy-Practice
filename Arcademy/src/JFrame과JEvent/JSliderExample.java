package JFrame과JEvent;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSliderExample {    //조절바를 생성해주는 프로그램.
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Your Name");
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		final JSlider sa = new JSlider();
		final JSlider sb = new JSlider(JSlider.VERTICAL,0,100,50);
		sa.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println("tabIndex="+sa.getValue());
			}
		});
		sb.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println("tabIndex="+sb.getValue());
			}
		});
		sb.setPaintLabels(true);
		sb.setMajorTickSpacing(25);
		sb.setMinorTickSpacing(5);
		sb.setPaintTicks(true);
		
		cp.add(sa);
		cp.add(sb);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
