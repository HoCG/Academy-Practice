package 그래픽심화;

import java.awt.*;
import java.awt.Frame;

public class 비밀번호 {
	public static void main(String[] args) {  //아이디와 비밀번호 부분 입력받는걸 보여준다.
		Frame f = new Frame("Login");      //상속이 아닌 생성자를 호출했기때문에 쓰는 함수들 앞에 f.을 붙여준다.
		f.setSize(400, 65);
		f.setLayout(new FlowLayout());
		
		Label lid = new Label("ID :",Label.RIGHT);   //정렬을 오른쪽으로
		Label lpwd = new Label("Password :",Label.RIGHT);
		
		TextField id = new TextField(10);  //약 10개의 글자를 입력할수있는 TextField생성.
		TextField pwd = new TextField(10);
		pwd.setEchoChar('●');              //키보드 특수문자 이외에 다가능!
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);    //마지막에 이렇게 선언해줘야만 실행이 된다.
	}
}
