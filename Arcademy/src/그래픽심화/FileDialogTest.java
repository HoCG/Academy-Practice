package �׷��Ƚ�ȭ;

import java.awt.*;
import java.awt.event.*;      //������ �������°� �̺�Ʈ�̱⶧���� �̺�Ʈ�� �־���.

public class FileDialogTest {    //����ã���ֱ�.
	public static void main(String[] args) {
		Frame f = new Frame("parent");
		f.setSize(300,200);
		FileDialog fileOpen = new FileDialog(f,"���Ͽ���",FileDialog.LOAD); //�Ҽ� ������, Ÿ��Ʋ.
		f.setVisible(true);
		fileOpen.setDirectory("jdk1.8.0_202");   //������ ��ġ�� ���(c��ũ�� �ִ� ���� ��Ȯ�� ���)
		fileOpen.setVisible(true);
		System.out.println(fileOpen.getDirectory()+fileOpen.getFile());   //��Ҹ� ���. �����̸� ���.
	}
}
