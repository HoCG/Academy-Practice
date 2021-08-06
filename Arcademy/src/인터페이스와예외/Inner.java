package 인터페이스와예외;

public class Inner {  //내부클래스.
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();    //작성을 이렇게!! 장소를 정확히 명시.
		
		System.out.println("ii.iv: "+ii.iv);
		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);
		System.out.println("Outer.StaticInner.cv++: "+Outer.StaticInner.cv++); //스테틱이라 안바뀌넹
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv: "+si.iv); //si하나로 처리가능.
	}

}
class Outer{ //상속을 안해도 클래스안에 클래스를 넣음으로 처리.
	class InstanceInner{    //이놈들은 상속이 된겨!
		int iv=100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300; //스테틱 안에 스테틱.
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}
