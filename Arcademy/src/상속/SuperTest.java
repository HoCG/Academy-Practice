package ���;

public class SuperTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	void method() {
		int x =30;
		System.out.println("x="+x);   //�Լ���. ���� ���Ұ�!!
		System.out.println("this.x="+this.x);  //��Ŭ���� �� x
		System.out.println("super.x="+super.x); // ����Ŭ���� �� x
	}
}
