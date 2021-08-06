package 상속;

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
		System.out.println("x="+x);   //함수안. 구분 잘할것!!
		System.out.println("this.x="+this.x);  //내클래스 안 x
		System.out.println("super.x="+super.x); // 상위클래스 안 x
	}
}
