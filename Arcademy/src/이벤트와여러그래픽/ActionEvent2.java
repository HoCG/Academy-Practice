package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class ActionEvent2 extends Frame implements ActionListener{  //�̹� ������� Frame�� �߱⶧���� ActionListener�� �������̽��� Ȱ��. 
	//ActionListener�� ���콺�� �������� �����ϴ� �������̽������ ����!
	TextArea txt_info;
	Button btn1, btn2;
	public ActionEvent2(String str) {
		super(str);
		txt_info = new TextArea("--��ư�� ���� �ּ���.--\n");
		btn1 = new Button("<< ��ư");
		btn2 = new Button(">> ��ư");     //�������� �̸����� �˻�.
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		add("Center",txt_info);
		add("South",panel);
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		txt_info.append( e.getActionCommand()+"�����̾��\n");
	}
	public static void main(String[] args) {
		new ActionEvent2("ActionEvent ����");
	}
}
