package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class MouseEvent extends Frame implements MouseListener {
	public MouseEvent(String str) { // ������
		super(str);
		addMouseListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	// ���콺 �̺�Ʈó�� ����Ʈ �ϸ� �ڵ����� ��!!!  if ���� ���� �ʿ䰡 ����.
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("���콺 ��ư Ŭ��");

	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("���콺 ������ ������ ����");
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("���콺 ������ ������ ����");
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("���콺 ��ư ����");

	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("���콺 ��ư ����");
	}

	public static void main(String[] args) {
		new MouseEvent("���콺 �̺�Ʈ ����");
	}

}
