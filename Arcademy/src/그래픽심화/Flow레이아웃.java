package �׷��Ƚ�ȭ;

import java.awt.*;

public class Flow���̾ƿ� {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(250,100);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));  //���������� �÷ο췹�̾ƿ� ����.
		f.add(new Button("ù��°"));   //��ư �����. �ڸ���ġ�� �˾Ƽ��Ѵ�.
		f.add(new Button("�ι�°"));
		f.add(new Button("����°"));
		f.add(new Button("�׹�°"));
		f.add(new Button("�ټ���°"));
		f.setVisible(true);   //�̺�Ʈ�� ��� false�� �Ѵ�.
	}

}
