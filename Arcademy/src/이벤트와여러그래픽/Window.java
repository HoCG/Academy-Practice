package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class Window extends Frame implements WindowListener {
	public Window(String str) { // ������
		super(str);
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("������ Ȱ��ȭ");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("������ �ּ�ȭ");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �ݱ�");
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("������ ��Ȱ��ȭ");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("������ ������ ����");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("������ ������ȭ");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("������ ����");

	}

	public static void main(String[] args) {
		new Window("������ �̺�Ʈ ����");
	}
}
