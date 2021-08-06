package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class Key extends Frame implements KeyListener {
	TextArea txt_info;
	TextField txt;

	public Key(String title) {
		super(title);
		txt = new TextField();
		txt.addKeyListener(this);
		add("Center", txt_info = new TextArea());
		add("South", txt);
		setSize(200, 200);
		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		txt_info.appendText(e.getKeyChar() + " 가 눌렀습니다.\n");

	}

	public void keyReleased(KeyEvent e) {
		txt_info.appendText(e.getKeyChar() + " 를 놓았습니다.\n");  //-----되있는건 잘안쓰는거라는 뜻!
	} 
	// 입력된 키의 종류 판별.
	public void keyTyped(KeyEvent e) {
		txt_info.appendText(e.getKeyChar() + " 가 입력되었습니다.\n");
	}

	public static void main(String[] args) {
		new Key("KeyEvent 예제");
	}
}
