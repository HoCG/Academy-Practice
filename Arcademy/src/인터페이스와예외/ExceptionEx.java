package �������̽��Ϳ���;

public class ExceptionEx {                  //����ó��
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);        //�����߻��ؼ� catch
			System.out.println(4);
		}catch (ArithmeticException ae) {   //���� ����� ������ ������ִ�.  ���ʿ��� ��쵵 �ִ�. ����� �صδ°� ����.
			System.out.println(5);          //�ٽ� ���ư��� �ʰ� �ٷ� �Ʒ���.
		}
		System.out.println(6);
	} //����¦�� finally
}
