
public class Block { //초기화블럭과 스테틱 이용.
	static {
		System.out.println("static { }");   //스태틱으로 인해  반드시 먼저 나옴.
	}
	{
		System.out.println("{ }");     //초기화블럭
	}
	public Block() {
		System.out.println("생성자");
	}
	public static void main(String args[]) {
		System.out.println("Block bt = new Block();");
		Block bt = new Block();
		System.out.println("Block bt2 = new Block();");
		Block bt2 = new Block();
	}

}
