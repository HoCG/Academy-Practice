package JFrame��JEvent;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest2 extends Frame {      //���̵� ��й�ȣ �α��� ü��
	Label lid;
	Label lpwd;
	TextField tfId;
	TextField tfPwd;
	Button ok;
	
	TextFieldTest2 (String title){
		super(title);  //Frame(String title)�� ȣ���Ѵ�.
		
		lid = new Label("ID :",Label.RIGHT);   //���� �ؽ�Ʈ������ ����������.
		lpwd = new Label("Password:",Label.RIGHT);
		
		//�� 10���� ���ڸ� �Է��� �� �ִ� TextField ����.
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');    //�Է��� ����� '*'�� ���̰� �Ѵ�.
		ok = new Button("OK");
		//OK��ư�� TextField�� �̺�Ʈ ó���� ���� Listener�� �߰����ش�.
		tfId.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());    //LayoutManager�� FlowLayout����
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
	
	class EventHandler implements ActionListener {   //�̺�Ʈ���Ŭ����.   ActionListener�� �������̽� �����μ� Ű���� �Է�����.
		public void actionPerformed(ActionEvent e) {
			String id = tfId.getText();     //tfId�� �ԷµǾ��ִ� text�� ���´�.
			String password = tfPwd.getText();
			if(!id.equals("javachobo")) {
				System.out.println("�Է��Ͻ� id�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				
				//id�� �ٽ� �Է��Ҽ��ֵ���, focus�� tfId�� �ű��.
				tfId.requestFocus();
				tfId.selectAll();
			}
			else if(!password.equals("asdf")) {    //if�� ���� ���ϰ� else if�� ó��.
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				//id�� �ٽ� �Է��Ҽ��ֵ���, focus�� tfId�� �ű��.
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}
			else {    //������.
				System.out.println(id+"�� ���������� �α����߽��ϴ�.");
			}
		}
	}
}
