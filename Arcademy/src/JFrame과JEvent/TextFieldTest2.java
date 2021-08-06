package JFrame과JEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest2 extends Frame {      //아이디 비밀번호 로그인 체계
	Label lid;
	Label lpwd;
	TextField tfId;
	TextField tfPwd;
	Button ok;
	
	TextFieldTest2 (String title){
		super(title);  //Frame(String title)을 호출한다.
		
		lid = new Label("ID :",Label.RIGHT);   //라벨의 텍스트정렬을 오른쪽으로.
		lpwd = new Label("Password:",Label.RIGHT);
		
		//약 10개의 글자를 입력할 수 있는 TextField 생성.
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');    //입력한 값대신 '*'이 보이게 한다.
		ok = new Button("OK");
		//OK버튼과 TextField에 이벤트 처리를 위한 Listener를 추가해준다.
		tfId.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());    //LayoutManager를 FlowLayout으로
		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450, 65);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextFieldTest2 f = new TextFieldTest2("Login");
	}
	
	class EventHandler implements ActionListener {   //이벤트헨더클래스.   ActionListener를 인터페이스 함으로서 키보드 입력읽음.
		public void actionPerformed(ActionEvent e) {
			String id = tfId.getText();     //tfId에 입력되어있는 text를 얻어온다.
			String password = tfPwd.getText();
			if(!id.equals("javachobo")) {
				System.out.println("입력하신 id가 유효하지 않습니다. 다시 입력해 주세요.");
				
				//id를 다시 입력할수있도록, focus를 tfId로 옮긴다.
				tfId.requestFocus();
				tfId.selectAll();
			}
			else if(!password.equals("asdf")) {    //if로 따로 안하고 else if로 처리.
				System.out.println("입력하신 비밀번호가 틀렸습니다. 다시 입력해 주시기 바랍니다.");
				//id를 다시 입력할수있도록, focus를 tfId로 옮긴다.
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}
			else {    //성공시.
				System.out.println(id+"님 성공적으로 로그인했습니다.");
			}
		}
	}
}
