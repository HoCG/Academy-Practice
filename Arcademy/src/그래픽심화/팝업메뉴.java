package �׷��Ƚ�ȭ;

import java.awt.*;
import java.awt.event.*;

public class �˾��޴� {
	public static void main(String[] args) {    //���콺 ������ ��ư ������ ������ �޴�â.
		final Frame f = new Frame("PopupMenu Test");
		f.setSize(300,200);
		
		final PopupMenu pMenu =new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);   //�˾��޴��� Frame�� �߰��Ѵ�.
		f.addMouseListener(new MouseAdapter() {   //�͸�Ŭ����
			public void mousePressed(MouseEvent me) {      //���콺 Ŭ�������� �̺�Ʈ�� �����. ���� ��ġ�� ����.
				if(me.getModifiers() == me.BUTTON3_MASK)
					pMenu.show(f, me.getX(), me.getY());   //x��ǥ y��ǥ�� �����´�. ������ ������.
			}
		});
		f.setVisible(true);
		}
}
