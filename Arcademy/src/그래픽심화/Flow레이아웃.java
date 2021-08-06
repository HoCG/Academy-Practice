package 그래픽심화;

import java.awt.*;

public class Flow레이아웃 {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(250,100);
		f.setLayout(new FlowLayout(FlowLayout.LEFT));  //왼쪽정렬의 플로우레이아웃 생성.
		f.add(new Button("첫번째"));   //버튼 만들기. 자리배치를 알아서한다.
		f.add(new Button("두번째"));
		f.add(new Button("세번째"));
		f.add(new Button("네번째"));
		f.add(new Button("다섯번째"));
		f.setVisible(true);   //이벤트의 경우 false도 한다.
	}

}
