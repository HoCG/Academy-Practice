package �������̽��Ϳ���;

public class Inner {  //����Ŭ����.
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();    //�ۼ��� �̷���!! ��Ҹ� ��Ȯ�� ���.
		
		System.out.println("ii.iv: "+ii.iv);
		System.out.println("Outer.StaticInner.cv: "+Outer.StaticInner.cv);
		System.out.println("Outer.StaticInner.cv++: "+Outer.StaticInner.cv++); //����ƽ�̶� �ȹٲ��
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv: "+si.iv); //si�ϳ��� ó������.
	}

}
class Outer{ //����� ���ص� Ŭ�����ȿ� Ŭ������ �������� ó��.
	class InstanceInner{    //�̳���� ����� �Ȱ�!
		int iv=100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300; //����ƽ �ȿ� ����ƽ.
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}
