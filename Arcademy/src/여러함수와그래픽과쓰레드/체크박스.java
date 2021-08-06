package 여러함수와그래픽과쓰레드;
import java.awt.*;

public class 체크박스 extends Frame { //화면 디자인.체크박스
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	public 체크박스(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("좋아하는 계절은 어느 것인가요?",Label.CENTER);
		add(lbl);
		cbg = new CheckboxGroup();              //그룹지정을 하면 동그란 체크상태(라디오 버튼), 아니면 네모난 체크상태. 트루는 꼭 하나만 둘것!!
		cbx1 = new Checkbox("봄",cbg,true);      //자동으로 얘가 체크. 옵션버튼이라고 부름. 참조변수가 실질적 버튼!!(버튼인지 체크박스인지 확인할수있게 하도록.)
		cbx2 = new Checkbox("여름",cbg,false);    //cbg가 없으면 체크박스가 된다.
		cbx3 = new Checkbox("가을",cbg,false);
		cbx4 = new Checkbox("겨울",cbg,false);
		add(cbx1);add(cbx2);add(cbx3);add(cbx4); //원래는 하나하나 Flame.을 해줘야하나, 상속을 했으므로 그럴필요X!!
		setSize(240,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new 체크박스("체크박스 예제");
	}

}
