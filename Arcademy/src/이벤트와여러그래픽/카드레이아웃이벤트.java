package �̺�Ʈ�Ϳ����׷���;

import java.awt.*;
import java.awt.event.*;

public class ī�巹�̾ƿ��̺�Ʈ extends Frame { // ī�巹�̾ƿ��� Ȱ��
	Button first, prev, next, last; // �յڷ� �̵��ϰԵ� ��ư��.
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5; // slide�� ���Ե� Panel��
	CardLayout card; // ī�� ���̾ƿ� ���!!

	ī�巹�̾ƿ��̺�Ʈ(String title) {
		super(title); // ������ Frame�� ������ Frame(String title)�� ȣ��

		// ȭ���� ���� �г�
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);

		// ��ư�� ���� �г�
		buttons = new Panel();
		buttons.setLayout(new FlowLayout());

		first = new Button("<<");
		prev = new Button("<");
		next = new Button(">");
		last = new Button(">>");
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);

		first.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout�� ù ��° slide(Panel)�� ���̵��� �Ѵ�.
				card.first(slide);
			}
		});
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout�� ù ��° slide(Panel)�� ���̵��� �Ѵ�.
				card.previous(slide);
			}
		});
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout�� ù ��° slide(Panel)�� ���̵��� �Ѵ�.
				card.next(slide);
			}
		});
		last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout�� ù ��° slide(Panel)�� ���̵��� �Ѵ�.
				card.last(slide);
			}
		});
		card1 = new Panel();
		card1.setBackground(Color.gray);
		card1.add(new Label("ù ��° ������ �Դϴ�."));
		card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("�� ��° ������ �Դϴ�."));
		card3 = new Panel();
		card3.setBackground(Color.pink);
		card3.add(new Label("�� ��° ������ �Դϴ�."));
		card4 = new Panel();
		card4.setBackground(Color.red);
		card4.add(new Label("�� ��° ������ �Դϴ�."));
		card5 = new Panel();
		card5.setBackground(Color.green);
		card5.add(new Label("�ټ� ��° ������ �Դϴ�."));
		
		//slide(Panel)�� card1(Panel)�� "1"�̶� �̸����� �߰��Ѵ�.
		slide.add(card1,"1");
		slide.add(card2,"2");
		slide.add(card3,"3");
		slide.add(card4,"4");
		slide.add(card5,"5");
		
		add("South",buttons);
		add("Center",slide);
		
		setSize(200,200);
		setLocation(200,200);
		setVisible(true);
		
		card.show(slide, "1");  //ù ��° �����̵� (card1)�� ��Ÿ���� �Ѵ�.

	}
	public static void main(String[] args) {
		ī�巹�̾ƿ��̺�Ʈ mainWin = new ī�巹�̾ƿ��̺�Ʈ ("ī�巹�̾ƿ� �̺�Ʈ");
	}
}
