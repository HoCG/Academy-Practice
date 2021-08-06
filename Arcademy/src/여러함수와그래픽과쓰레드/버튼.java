package 여러함수와그래픽과쓰레드;
import java.awt.*;

public class 버튼  extends Frame {  //자바 버튼
	Button btn1, btn2, btn3;
	public 버튼(String str) {
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button("가위"); //버튼의 참조변수 이름으로 몇번 무슨버튼을 눌렀는지 체크하는것.
		btn2 = new Button("바위");
		btn3 = new Button("보");
		add(btn1); add(btn2); add(btn3);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 버튼("버튼예제");
	}

}
