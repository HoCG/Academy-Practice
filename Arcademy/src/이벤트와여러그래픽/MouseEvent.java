package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class MouseEvent extends Frame implements MouseListener {
	public MouseEvent(String str) { // 생성자
		super(str);
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	// 마우스 이벤트처리 인포트 하면 자동으로 뜸!!!  if 조건 넣을 필요가 없음.
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("마우스 버튼 클릭");

	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("마우스 윈도우 안으로 들어옴");
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("마우스 윈도우 밖으로 나감");
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("마우스 버튼 누름");

	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("마우스 버튼 놓음");
	}

	public static void main(String[] args) {
		new MouseEvent("마우스 이벤트 예제");
	}

}
