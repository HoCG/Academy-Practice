package 그래픽심화;

import java.awt.*;
import java.awt.event.*;

public class 팝업메뉴 {
	public static void main(String[] args) {    //마우스 오른쪽 버튼 누르면 나오는 메뉴창.
		final Frame f = new Frame("PopupMenu Test");
		f.setSize(300,200);
		
		final PopupMenu pMenu =new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);   //팝업메뉴를 Frame에 추가한다.
		f.addMouseListener(new MouseAdapter() {   //익명클래스
			public void mousePressed(MouseEvent me) {      //마우스 클릭에대한 이벤트를 만든다. 나의 위치에 대해.
				if(me.getModifiers() == me.BUTTON3_MASK)
					pMenu.show(f, me.getX(), me.getY());   //x좌표 y좌표를 가져온다. 지점을 가져옴.
			}
		});
		f.setVisible(true);
		}
}
