package 그래픽심화;

import java.awt.*;

public class 레이아웃 {     //일정 위치 공간을 잡아준다.
	public static void main(String[] args) {
		Frame f =new Frame("BorderLayoutTest");
		f.setSize(200,200);
		f.setLayout(new BorderLayout());  //아까까지는 null이였지만 지금은 BorderLayout으로 써있다. 공간을 체우기 위해!!    GridLayout은 균등분할.
		Button north = new Button("North");
		Button south = new Button("South");
		Button east = new Button("East");
		Button west = new Button("West");
		Button center = new Button("Center");
		
		f.add(north,"North");  //Frame의 5개의 각 영역에 Button을 하나씩 추가한다.
		f.add(south,"South");
		f.add(east,"East");
		f.add(west,"West");
		f.add(center,"Center");
		
		f.setVisible(true);
	}

}
