package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class üũ�ڽ��̺�Ʈ extends Frame {   //üũ�ڽ� �̺�Ʈó��
	Label q1;
	Label q2;
	Label score;
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	CheckboxGroup group;
	Button end;
	
	üũ�ڽ��̺�Ʈ(String title){
		super(title);  //Frame(String title)�� ȣ��.
		setSize(500,300);
		setLayout(new GridLayout(13,1));  //���� null�̴��� �� ���� �־�!
		
		q1 = new Label("1.���� �� ActionEvent�� actionPerformed�޼��尡 ȣ��Ǵ� ����?(��� ���ÿ�)");
		q1cb1 = new Checkbox("Button�� ������ ��"); 
		q1cb2 = new Checkbox("TextField���� EnterŰ�� ������ ��");
		q1cb3 = new Checkbox("MenuItem�� Ŭ������ ��");
		q1cb4 = new Checkbox("List���� ����Ŭ������ item�� �������� ��");
		
		q2 = new Label("2. Frame�� �⺻ LayoutManager��? (�ϳ��� ������.)");
		group = new CheckboxGroup();
		q2cb1= new Checkbox("FlowLayout",group,false);
		q2cb2= new Checkbox("GridLayout",group,false);
		q2cb3= new Checkbox("BorderLayout",group,false);
		q2cb4= new Checkbox("CardLatout",group,false);
		
		score = new Label("*��� :");
		end = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�.");
		end.addActionListener(new ActionListener() {     //�̰ɷ� �̺�Ʈ ���� ����. ���躸�°�ó�� ���̰� ��. �̺�Ʈ�� �ڵ� �ݺ��̴�!! while.
			public void actionPerformed(ActionEvent e) {
				float totalScore = 0;
				if(q1cb1.getState()) totalScore += 12.5;
				if(q1cb2.getState()) totalScore += 12.5;
				if(q1cb3.getState()) totalScore += 12.5;   //�ؽ�Ʈ���� ����. �ٷ� if�� ������. getState ������ ���¸� �޾ƿ� boolean. true�� ������.
				if(q1cb4.getState()) totalScore += 12.5;
				if(q2cb3.getState()) totalScore += 50;
				score.setText("*��� : ����� ������ "+totalScore+"�� �Դϴ�.");
			}
		});
		add(q1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);
		add(new Label(""));
		add(q2);
		add(q2cb1);add(q2cb2);add(q2cb3);add(q2cb4);
		add(end);
		add(score);
		setVisible(true);
	}
	public static void main(String[] args) {
		üũ�ڽ��̺�Ʈ mainWin = new üũ�ڽ��̺�Ʈ("üũ�ڽ��̺�Ʈ�׽�Ʈ - Quiz");
	}
}
