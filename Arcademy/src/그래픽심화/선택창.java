package �׷��Ƚ�ȭ;

import java.awt.*;

public class ����â {       //���ѵ� �������� ���ø���� ���� �Ҷ�.
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300,200);
		f.setLayout(null);   //Layout�Ŵ��� �Ƚ�!! ��й�ȣ�� ���غ�.
		
		Choice day = new Choice();  //Choice ��ü�� ����Ѵ�.(Frame���� ����.)
		day.add("SUN");             //Choice�� ��Ͽ� ��Ÿ�� ���� �߰�.
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		day.setSize(100,50);
		day.setLocation(100,70);
		f.add(day);
		f.setVisible(true);
	}

}
