package �����Լ��ͱ׷��Ȱ�������;

import javax.swing.JOptionPane;  //�ڹ� ��ü ���� ȭ�������.

public class ThreadEx7 {
	public static void main(String[] args) throws Exception { // 13.������ Exception ==����ó��.
		ThreadEx7_1 th1 = new ThreadEx7_1(); // ������ ����.
		th1.start(); // ����Ҷ��� start��!!(�����常 ����������.)
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է¹ٶ�.");   //���� ���� ó��. �������� ����.
		System.out.println("�Է��Ͻ� ����" + input + "�Դϴ�.");
	}
}

class ThreadEx7_1 extends Thread {
	public void run() {           //���� �Լ��� �̷��� run����!!
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000); //�ð��� õõ��...
			} catch (Exception e) {
			}
		}
	}
}
