package 여러함수와그래픽과쓰레드;

public class ATM_EXE { // 쓰레드(동기화). 입출금 처리해주는 프로그램.
	public static void main(String[] args) {
		ATM obj = new ATM(10000); //계좌에 10000원이 있다.
		ATM_USER user1 = new ATM_USER(obj,"홍길동");   //각각의 객체 생성.
		ATM_USER user2 = new ATM_USER(obj,"홍길순");
		ATM_USER user3 = new ATM_USER(obj,"최재규");
		
		user1.start();
		user2.start(); //스레드 실행.
		user3.start();
	}
}

class ATM {
	private int total;

	public ATM(int total) {
		this.total = total;
	}

	synchronized void deposit(int amount, String name) { // 동기화를 하기위해 synchronized 선언!!
		total += amount;
		System.out.println(name + " : 입금 금액 : " + amount);
	}

	synchronized void withdraw(int amount, String name) {  //동기화를 하게되면 동시에 하던동작을 멈추고 하나의 동작을 진행.
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + " : 출금 금액 : " + amount);
		} else {
			System.out.println(name + "님 잔액이 부족합니다.");
		}
	}
	public void getTotal() {
		System.out.println("현재 계좌 잔액은: "+total);
	}
}
class ATM_USER extends Thread {
	boolean flag = false;
	ATM obj;
	public ATM_USER(ATM obj,String name) {
		super(name);
		this.obj=obj;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				sleep(500);
			}catch(InterruptedException e) {}
			
			if(flag) {
				obj.deposit((int)(Math.random()*10000),getName());
				obj.getTotal();
			}
			else {
				obj.withdraw((int)(Math.random()*10000),getName());
				obj.getTotal();
			}
			flag = !flag;
		}
	}
}