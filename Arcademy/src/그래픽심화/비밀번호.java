package �׷��Ƚ�ȭ;

import java.awt.*;
import java.awt.Frame;

public class ��й�ȣ {
	public static void main(String[] args) {  //���̵�� ��й�ȣ �κ� �Է¹޴°� �����ش�.
		Frame f = new Frame("Login");      //����� �ƴ� �����ڸ� ȣ���߱⶧���� ���� �Լ��� �տ� f.�� �ٿ��ش�.
		f.setSize(400, 65);
		f.setLayout(new FlowLayout());
		
		Label lid = new Label("ID :",Label.RIGHT);   //������ ����������
		Label lpwd = new Label("Password :",Label.RIGHT);
		
		TextField id = new TextField(10);  //�� 10���� ���ڸ� �Է��Ҽ��ִ� TextField����.
		TextField pwd = new TextField(10);
		pwd.setEchoChar('��');              //Ű���� Ư������ �̿ܿ� �ٰ���!
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);    //�������� �̷��� ��������߸� ������ �ȴ�.
	}
}
