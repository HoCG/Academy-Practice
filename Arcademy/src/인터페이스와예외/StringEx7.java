package �������̽��Ϳ���;

public class StringEx7 {
	public static void main(String[] args) { // ��Ű���� ������ Ŭ����. ���� Ÿ�� Ž��.
		String fullName = "Hello.java";
		int index = fullName.indexOf('.'); //��ġ�� �˾Ƴ���.
		String fileName = fullName.substring(0,index);  //4���ڸ����� (hello)�� �������. filename�� ����. substring���� �̾Ƴ�.
		String ext = fullName.substring(index+1); //�ε��� ����, ������
		System.out.println(fullName+"�� Ȯ���ڸ� ������ �̸��� "+fileName);
		System.out.println(fullName+"�� Ȯ���ڴ� "+ext);
	}

}
