package ���;

public class BindingTest {
	public static void main(String[] args) {  //������������ ���� ����.
		Parent1 p = new Child1(); //������������ ���ϰ� ����.
		Child1 c = new Child1();
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}
class Parent1{
	int x = 100; //������ �ڱ���� �켱. �׷��� �޼ҵ�� ���������� �켱ó��. ����ȯ�ϸ� �ٰ��� ��������.
	void method() {
		System.out.println("Parent Method");
	}
}
class Child1 extends Parent1{   //�Ʒ����� ������ ������ �ö�.
	int x = 200;
	void method() {
		//System.out.println("Child Method");
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);  //��ӹ��� x�ǰ�.
		System.out.println("this.x="+this.x);    //�� Ŭ������ x��.
	}
}
