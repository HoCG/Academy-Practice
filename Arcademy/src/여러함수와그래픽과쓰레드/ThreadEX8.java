package �����Լ��ͱ׷��Ȱ�������;

class Thread_EX8 extends Thread { // �������� Object�� ����� Ŭ������ ��ӹ޴´�.
	public Thread_EX8(String name) {
		super(name);
	}

	public void run() { // ������ ����.
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��-" + getName() + " :������");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadEX8 { // 13.������ Ȱ��.
	public static void main(String[] args) {
		Thread_EX8 obj1 = new Thread_EX8("ù��°"); // ������ ù��°�� 5�� ���;������� ������� ���� 3������ ���ÿ� 5���� �ȴ�.
		Thread_EX8 obj2 = new Thread_EX8("�ι�°"); // ����������� ���� ������� �ѹ��� ���� �����Ϸ��� �Ҷ� ������ Ȱ��.
		Thread_EX8 obj3 = new Thread_EX8("����°");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
