package 그래픽심화;

import java.awt.*;

public class 선택창 {       //제한된 공간에서 선택목록을 고르게 할때.
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300,200);
		f.setLayout(null);   //Layout매니저 안써!! 비밀번호랑 비교해봐.
		
		Choice day = new Choice();  //Choice 객체를 사용한다.(Frame으로 부터.)
		day.add("SUN");             //Choice의 목록에 나타날 값들 추가.
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		day.setSize(100,50);
		day.setLocation(100,70);
		f.add(day);
		f.setVisible(true);
	}

}
