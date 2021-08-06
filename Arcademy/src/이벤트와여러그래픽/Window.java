package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class Window extends Frame implements WindowListener {
	public Window(String str) { // 생성자
		super(str);
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("윈도우 활성화");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("윈도우 최소화");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기");
		this.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("윈도우 비활성화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈도우 아이콘 해제");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("윈도우 아이콘화");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("윈도우 열기");

	}

	public static void main(String[] args) {
		new Window("윈도우 이벤트 예제");
	}
}
