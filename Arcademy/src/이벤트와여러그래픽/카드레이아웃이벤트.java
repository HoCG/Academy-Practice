package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class 카드레이아웃이벤트 extends Frame { // 카드레이아웃의 활용
	Button first, prev, next, last; // 앞뒤로 이동하게될 버튼들.
	Panel buttons;
	Panel slide;
	Panel card1, card2, card3, card4, card5; // slide에 포함될 Panel들
	CardLayout card; // 카드 레이아웃 사용!!

	카드레이아웃이벤트(String title) {
		super(title); // 조상인 Frame의 생성자 Frame(String title)을 호출

		// 화면을 담을 패널
		slide = new Panel();
		card = new CardLayout();
		slide.setLayout(card);

		// 버튼을 담을 패널
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
				// CardLayout의 첫 번째 slide(Panel)이 보이도록 한다.
				card.first(slide);
			}
		});
		prev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout의 첫 번째 slide(Panel)이 보이도록 한다.
				card.previous(slide);
			}
		});
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout의 첫 번째 slide(Panel)이 보이도록 한다.
				card.next(slide);
			}
		});
		last.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout의 첫 번째 slide(Panel)이 보이도록 한다.
				card.last(slide);
			}
		});
		card1 = new Panel();
		card1.setBackground(Color.gray);
		card1.add(new Label("첫 번째 페이지 입니다."));
		card2 = new Panel();
		card2.setBackground(Color.orange);
		card2.add(new Label("두 번째 페이지 입니다."));
		card3 = new Panel();
		card3.setBackground(Color.pink);
		card3.add(new Label("세 번째 페이지 입니다."));
		card4 = new Panel();
		card4.setBackground(Color.red);
		card4.add(new Label("네 번째 페이지 입니다."));
		card5 = new Panel();
		card5.setBackground(Color.green);
		card5.add(new Label("다섯 번째 페이지 입니다."));
		
		//slide(Panel)에 card1(Panel)을 "1"이란 이름으로 추가한다.
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
		
		card.show(slide, "1");  //첫 번째 슬라이드 (card1)가 나타나게 한다.

	}
	public static void main(String[] args) {
		카드레이아웃이벤트 mainWin = new 카드레이아웃이벤트 ("카드레이아웃 이벤트");
	}
}
