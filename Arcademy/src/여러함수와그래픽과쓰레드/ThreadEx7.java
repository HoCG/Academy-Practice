package 여러함수와그래픽과쓰레드;

import javax.swing.JOptionPane;  //자바 형체 생성 화면디자인.

public class ThreadEx7 {
	public static void main(String[] args) throws Exception { // 13.쓰레드 Exception ==예외처리.
		ThreadEx7_1 th1 = new ThreadEx7_1(); // 쓰레드 생성.
		th1.start(); // 사용할때는 start로!!(쓰레드만 예외적으로.)
		String input = JOptionPane.showInputDialog("아무값이나 입력바람.");   //일을 같이 처리. 쓰레드의 실현.
		System.out.println("입력하신 값은" + input + "입니다.");
	}
}

class ThreadEx7_1 extends Thread {
	public void run() {           //실행 함수는 이렇게 run으로!!
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000); //시간을 천천히...
			} catch (Exception e) {
			}
		}
	}
}
