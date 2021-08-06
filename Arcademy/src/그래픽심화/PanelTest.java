package 그래픽심화;

import java.awt.*;

public class PanelTest {                 //패널의 사용.
	public static void main(String[] args) {
		Frame f = new Frame("Panel");    //패널로 특정 공간을 잡아주고 버튼 등이 패널안에 있도록 한다.
		f.setSize(300,200);              //크기
		f.setLayout(null);               //Layout 메니저를 사용하지 않도록 함.
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.setSize(100,100);
		p.setLocation(300,300);
		Button ok = new Button("OK");
		p.add(ok);                        //버튼을 패널에 포함
		f.add(p);                         //패널을 Frame에 포함
		f.setVisible(true);               //시각화
	}

}
