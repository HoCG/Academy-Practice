package 이벤트와여러그래픽;

import java.awt.*;
import java.awt.event.*;

public class 체크박스이벤트 extends Frame {   //체크박스 이벤트처리
	Label q1;
	Label q2;
	Label score;
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	CheckboxGroup group;
	Button end;
	
	체크박스이벤트(String title){
		super(title);  //Frame(String title)을 호출.
		setSize(500,300);
		setLayout(new GridLayout(13,1));  //원래 null이던게 또 뭐가 있어!
		
		q1 = new Label("1.다음 중 ActionEvent의 actionPerformed메서드가 호출되는 경우는?(모두 고르시오)");
		q1cb1 = new Checkbox("Button을 눌렀을 때"); 
		q1cb2 = new Checkbox("TextField에서 Enter키를 눌렀을 때");
		q1cb3 = new Checkbox("MenuItem을 클릭했을 떄");
		q1cb4 = new Checkbox("List에서 더블클릭으로 item을 선택했을 때");
		
		q2 = new Label("2. Frame의 기본 LayoutManager는? (하나만 고르세요.)");
		group = new CheckboxGroup();
		q2cb1= new Checkbox("FlowLayout",group,false);
		q2cb2= new Checkbox("GridLayout",group,false);
		q2cb3= new Checkbox("BorderLayout",group,false);
		q2cb4= new Checkbox("CardLatout",group,false);
		
		score = new Label("*결과 :");
		end = new Button("이 버튼을 누르시면 결과를 알 수 있습니다.");
		end.addActionListener(new ActionListener() {     //이걸로 이벤트 현상 생성. 시험보는것처럼 보이게 함. 이벤트는 자동 반복이다!! while.
			public void actionPerformed(ActionEvent e) {
				float totalScore = 0;
				if(q1cb1.getState()) totalScore += 12.5;
				if(q1cb2.getState()) totalScore += 12.5;
				if(q1cb3.getState()) totalScore += 12.5;   //텍스트상자 점검. 바로 if에 넣은다. getState 상자의 상태를 받아옴 boolean. true면 값더함.
				if(q1cb4.getState()) totalScore += 12.5;
				if(q2cb3.getState()) totalScore += 50;
				score.setText("*결과 : 당신의 점수는 "+totalScore+"점 입니다.");
			}
		});
		add(q1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);
		add(new Label(""));
		add(q2);
		add(q2cb1);add(q2cb2);add(q2cb3);add(q2cb4);
		add(end);
		add(score);
		setVisible(true);
	}
	public static void main(String[] args) {
		체크박스이벤트 mainWin = new 체크박스이벤트("체크박스이벤트테스트 - Quiz");
	}
}
