package JFrame��JEvent;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class �������̺�Ʈ2 extends Frame implements ItemListener {    //Choice���� �׸��� ���������� �߻��ϴ� �̺�Ʈ�� ó���ϴ� ���α׷�.
	Choice lst_1, lst_2;
	Label lbl_info;
	String ���[] = { "�ƽþ�", "����", "������ī" };
	String ����[][] = { { "�ѱ�", "�Ϻ�", "�߱�" }, { "����", "������", "������" }, { "����Ʈ", "���", "�찣��" } };

	public �������̺�Ʈ2(String str) {
		super(str);
		Label lbl = new Label("����� ���� �����ϼ���?");
		Panel panel = new Panel();
		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		for (int i = 0; i < ���.length; i++)
			lst_1.add(���[i]);
		lst_2.add("      ");
		panel.add(lst_1);
		panel.add(lst_2);

		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(250,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {   //��ó���� ���⼭ �� ����.
		Choice obj = (Choice)e.getSource();
		String str = "������ ����� ����� : ";
		if(obj == lst_1) {            //lst_1���� �̺�Ʈ�� �߻��� ��
			lst_2.removeAll();        //lst_2�� ��� �׸� ����
			int j = lst_1.getSelectedIndex();      //lst_1�� ���� �����׸�
			for(int i = 0; i < ����[j].length;i++) {
				lst_2.add(����[j][i]);     //lst_1������ lst_2�׸� �߰�
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
	}
	public static void main(String[] args) {
		new �������̺�Ʈ2("  ");
	}

}
