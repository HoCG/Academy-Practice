package �����Լ��ͱ׷��Ȱ�������;
import java.awt.*;

public class ��ư  extends Frame {  //�ڹ� ��ư
	Button btn1, btn2, btn3;
	public ��ư(String str) {
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button("����"); //��ư�� �������� �̸����� ��� ������ư�� �������� üũ�ϴ°�.
		btn2 = new Button("����");
		btn3 = new Button("��");
		add(btn1); add(btn2); add(btn3);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ��ư("��ư����");
	}

}
