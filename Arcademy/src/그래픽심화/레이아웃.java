package �׷��Ƚ�ȭ;

import java.awt.*;

public class ���̾ƿ� {     //���� ��ġ ������ ����ش�.
	public static void main(String[] args) {
		Frame f =new Frame("BorderLayoutTest");
		f.setSize(200,200);
		f.setLayout(new BorderLayout());  //�Ʊ������ null�̿����� ������ BorderLayout���� ���ִ�. ������ ü��� ����!!    GridLayout�� �յ����.
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("East");
		Button west = new Button("West");
		Button center = new Button("Center");
		
		f.add(north,"North");  //Frame�� 5���� �� ������ Button�� �ϳ��� �߰��Ѵ�.
		f.add(south,"South");
		f.add(east,"East");
		f.add(west,"West");
		f.add(center,"Center");
		
		f.setVisible(true);
	}

}
