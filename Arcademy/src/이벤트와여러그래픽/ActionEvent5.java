package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class ActionEvent5 extends Frame implements ActionListener{  //�̺�Ʈó���ϴ°� ��κ� �������̽��� �̷��� �Ǿ��ִ�.
	List list;
	Label lbl_info;
	public ActionEvent5(String str) {
		super(str);
		list = new List(5, false);
		list.add("����");    //����Ʈ�� �׸� �߰�.
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("����");
		lbl_info = new Label("    ");
		list.addActionListener(this);
	    add("Center",list);
	    add("South",lbl_info);
	    setSize(200,100);
	    setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		lbl_info.setText(list.getSelectedItem());     //�̺�Ʈ ������ ��� ��Ű�°�.
	}
	public static void main(String[] args) {
		new ActionEvent5("ActionEvent5 ����");
	}
}
