package �׷��Ƚ�ȭ;

import java.awt.*;

public class PanelTest {                 //�г��� ���.
	public static void main(String[] args) {
		Frame f = new Frame("Panel");    //�гη� Ư�� ������ ����ְ� ��ư ���� �гξȿ� �ֵ��� �Ѵ�.
		f.setSize(300,200);              //ũ��
		f.setLayout(null);               //Layout �޴����� ������� �ʵ��� ��.
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.setSize(100,100);
		p.setLocation(300,300);
		Button ok = new Button("OK");
		p.add(ok);                        //��ư�� �гο� ����
		f.add(p);                         //�г��� Frame�� ����
		f.setVisible(true);               //�ð�ȭ
	}

}
