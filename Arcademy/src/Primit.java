class Data {
	int x;
}

public class Primit {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main():x=" + d.x);
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main():x=" + d.x); //1000���.
	}

	static void change(Data d) { //Data d ,public Ŭ���� �ȿ��ֱ⶧���� ����ƽ���ֱ�. �������� ��ü����.
		d.x = 1000;
		System.out.println("change():x=" + d.x);
	}

}
