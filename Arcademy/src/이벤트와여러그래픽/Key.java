package �̺�Ʈ�Ϳ����׷���;

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
		txt_info.appendText(e.getKeyChar() + " �� �������ϴ�.\n");

	}

	public void keyReleased(KeyEvent e) {
		txt_info.appendText(e.getKeyChar() + " �� ���ҽ��ϴ�.\n");  //-----���ִ°� �߾Ⱦ��°Ŷ�� ��!
	} 
	// �Էµ� Ű�� ���� �Ǻ�.
	public void keyTyped(KeyEvent e) {
		txt_info.appendText(e.getKeyChar() + " �� �ԷµǾ����ϴ�.\n");
	}

	public static void main(String[] args) {
		new Key("KeyEvent ����");
	}
}
