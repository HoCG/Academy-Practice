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
		System.out.println("main():x=" + d.x); //1000출력.
	}

	static void change(Data d) { //Data d ,public 클래스 안에있기때문데 스태틱써주기. 참조변수 자체전달.
		d.x = 1000;
		System.out.println("change():x=" + d.x);
	}

}
