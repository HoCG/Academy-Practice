package JFrame과JEvent;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class 아이템이벤트2 extends Frame implements ItemListener {    //Choice에서 항목을 선택했을때 발생하는 이벤트를 처리하는 프로그램.
	Choice lst_1, lst_2;
	Label lbl_info;
	String 대륙[] = { "아시아", "유럽", "아프리카" };
	String 나라[][] = { { "한국", "일본", "중국" }, { "영국", "스위스", "프랑스" }, { "이집트", "콩고", "우간다" } };

	public 아이템이벤트2(String str) {
		super(str);
		Label lbl = new Label("대륙과 나라를 선택하세요?");
		Panel panel = new Panel();
		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		for (int i = 0; i < 대륙.length; i++)
			lst_1.add(대륙[i]);
		lst_2.add("      ");
		panel.add(lst_1);
		panel.add(lst_2);

		add("North", lbl);
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(250,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) {   //일처리는 여기서 다 진행.
		Choice obj = (Choice)e.getSource();
		String str = "선택한 대륙과 나라는 : ";
		if(obj == lst_1) {            //lst_1에서 이벤트가 발생할 때
			lst_2.removeAll();        //lst_2의 모든 항목 제거
			int j = lst_1.getSelectedIndex();      //lst_1의 현재 선택항목
			for(int i = 0; i < 나라[j].length;i++) {
				lst_2.add(나라[j][i]);     //lst_1에따라 lst_2항목 추가
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
	}
	public static void main(String[] args) {
		new 아이템이벤트2("  ");
	}

}
