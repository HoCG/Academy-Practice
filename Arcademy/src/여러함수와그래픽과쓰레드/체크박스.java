package �����Լ��ͱ׷��Ȱ�������;
import java.awt.*;

public class üũ�ڽ� extends Frame { //ȭ�� ������.üũ�ڽ�
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	public üũ�ڽ�(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("�����ϴ� ������ ��� ���ΰ���?",Label.CENTER);
		add(lbl);
		cbg = new CheckboxGroup();              //�׷������� �ϸ� ���׶� üũ����(���� ��ư), �ƴϸ� �׸� üũ����. Ʈ��� �� �ϳ��� �Ѱ�!!
		cbx1 = new Checkbox("��",cbg,true);      //�ڵ����� �갡 üũ. �ɼǹ�ư�̶�� �θ�. ���������� ������ ��ư!!(��ư���� üũ�ڽ����� Ȯ���Ҽ��ְ� �ϵ���.)
		cbx2 = new Checkbox("����",cbg,false);    //cbg�� ������ üũ�ڽ��� �ȴ�.
		cbx3 = new Checkbox("����",cbg,false);
		cbx4 = new Checkbox("�ܿ�",cbg,false);
		add(cbx1);add(cbx2);add(cbx3);add(cbx4); //������ �ϳ��ϳ� Flame.�� ������ϳ�, ����� �����Ƿ� �׷��ʿ�X!!
		setSize(240,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new üũ�ڽ�("üũ�ڽ� ����");
	}

}
