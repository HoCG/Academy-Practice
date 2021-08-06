package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class ActionEvent2 extends Frame implements ActionListener{  //이미 상속으로 Frame을 했기때문에 ActionListener는 인터페이스를 활용. 
	//ActionListener는 마우스의 움직임을 감지하는 인터페이스라는점 숙지!
	TextArea txt_info;
	Button btn1, btn2;
	public ActionEvent2(String str) {
		super(str);
		txt_info = new TextArea("--버튼을 눌러 주세요.--\n");
		btn1 = new Button("<< 버튼");
		btn2 = new Button(">> 버튼");     //참조변수 이름으로 검사.
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		add("Center",txt_info);
		add("South",panel);
		setSize(200,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		txt_info.append( e.getActionCommand()+"눌르셨어요\n");
	}
	public static void main(String[] args) {
		new ActionEvent2("ActionEvent 예제");
	}
}
