package 상속;

public class BindingTest {
	public static void main(String[] args) {  //교차생성으로 쉽게 변경.
		Parent1 p = new Child1(); //교차생성으로 편하게 접근.
		Child1 c = new Child1();
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}
class Parent1{
	int x = 100; //변수는 자기것이 우선. 그러나 메소드는 생성자쪽이 우선처리. 형변환하면 다같이 쓸수있음.
	void method() {
		System.out.println("Parent Method");
	}
}
class Child1 extends Parent1{   //아래것이 없으면 다위로 올라감.
	int x = 200;
	void method() {
		//System.out.println("Child Method");
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);  //상속받은 x의값.
		System.out.println("this.x="+this.x);    //이 클래스의 x값.
	}
}
