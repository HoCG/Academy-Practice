package 여러함수와그래픽과쓰레드;

class Thread_EX8 extends Thread { // 쓰레드라는 Object와 비슷한 클래스를 상속받는다.
	public Thread_EX8(String name) {
		super(name);
	}

	public void run() { // 쓰레드 동작.
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번-" + getName() + " :스레드");
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadEX8 { // 13.쓰레드 활용.
	public static void main(String[] args) {
		Thread_EX8 obj1 = new Thread_EX8("첫번째"); // 원래는 첫번째가 5번 나와야하지만 스레드로 인해 3가지가 동시에 5번이 된다.
		Thread_EX8 obj2 = new Thread_EX8("두번째"); // 원서접수등등 많은 사람들이 한번에 일을 진행하려고 할때 스레드 활용.
		Thread_EX8 obj3 = new Thread_EX8("세번째");

		obj1.start();
		obj2.start();
		obj3.start();
	}
}
