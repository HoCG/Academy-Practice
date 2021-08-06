package JFrame과JEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HiHi extends JFrame { // 체크박스 이벤트처리
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		Container cp = frame.getContentPane();
		cp.setLayout(new FlowLayout());
		Box b0 = new Box(BoxLayout.Y_AXIS);
		JButton B2 = new JButton("관리");
		JButton B3 = new JButton("예약");
		JButton B4 = new JButton("매출");    //버튼부
		JButton B5 = new JButton("종료");
		B2.setFont(new Font("맑은고딕", Font.BOLD, 30));
		B3.setFont(new Font("맑은고딕", Font.BOLD, 30));
		B4.setFont(new Font("맑은고딕", Font.BOLD, 30));
		B5.setFont(new Font("맑은고딕", Font.BOLD, 30));
		JLabel label = new JLabel("*메뉴를 고르세요");
		label.setFont(new Font("맑은고딕", Font.BOLD, 15));
		JLabel imgLbl = new JLabel();
		b0.add(label);
		b0.add(B2);
		b0.add(B3);
		b0.add(B4);
		b0.add(B5);
		
		
        ImageIcon bsImg = new ImageIcon(HiHi.class.getResource("HH.jpg"));
        // ★ 라벨에 아이콘 설정
        imgLbl.setIcon(bsImg);
        // ★ 기타 설정
        imgLbl.setBounds(30, 30, 122, 130);//절대위치 지정.
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
