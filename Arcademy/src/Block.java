
public class Block { //�ʱ�ȭ���� ����ƽ �̿�.
	static {
		System.out.println("static { }");   //����ƽ���� ����  �ݵ�� ���� ����.
	}
	{
		System.out.println("{ }");     //�ʱ�ȭ��
	}
	public Block() {
		System.out.println("������");
	}
	public static void main(String args[]) {
		System.out.println("Block bt = new Block();");
		Block bt = new Block();
		System.out.println("Block bt2 = new Block();");
		Block bt2 = new Block();
	}

}
