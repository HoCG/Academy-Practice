package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class ActionEvent5 extends Frame implements ActionListener{  //이벤트처리하는게 대부분 인터페이스라서 이렇게 되어있다.
	List list;
	Label lbl_info;
	public ActionEvent5(String str) {
		super(str);
		list = new List(5, false);
		list.add("서울");    //리스트에 항목 추가.
		list.add("부산");
		list.add("인천");
		list.add("대구");
		list.add("대전");
		list.add("광주");
		list.add("울산");
		list.add("수원");
		list.add("제주");
		lbl_info = new Label("    ");
		list.addActionListener(this);
	    add("Center",list);
	    add("South",lbl_info);
	    setSize(200,100);
	    setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		lbl_info.setText(list.getSelectedItem());     //이벤트 현상을 대기 시키는것.
	}
	public static void main(String[] args) {
		new ActionEvent5("ActionEvent5 예제");
	}
}
