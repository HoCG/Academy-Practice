package �������̽��Ϳ���;

public class StringEx {
	public static void main(String[] args) { //��Ű���� ������ Ŭ���� ��Ʈ�� �κ�. �ڹ� api�˻��ϸ� Ŭ�����̸� �޼ҵ��̸� �Ұ��Ǿ�����.
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";"); // \���� "�ϸ� 
		System.out.println("String str2 = \"abc\";");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));
		System.out.println();
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		System.out.println("str3==str4 ? "+(str3 == str4));
		System.out.println("str3.equals(str4) ? "+str3.equals(str4));    //equals�� ���������� ��ȯ�ؿ�!
	}
}
