package 인터페이스와예외;

public class InterfaceTest2 {
	public static void main(String[] args) {
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}
}
class A{
	void autoPlay(I i) {  //한개로서 2개를 받을수 잇다.
		i.play();         //play를 맞춰서 나아감.
	}
}

interface I {
	public abstract void play();
}

class B implements I{
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{
	public void play() {
		System.out.println("play in C class");
	}
	
}
