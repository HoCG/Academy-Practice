package �������̽��Ϳ���;

import java.util.Arrays;

public class CloneEx { // ��Ű���� ������ Ŭ����(Ŭ��)�迭����.
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arrClone = arr.clone();        //.clone();���� arr�� ������ �����Ѵ�.
		// int[] arrClone = arr �� �ϰԵǸ� �ּҸ� ���°��̱� ������ arr�� �ٲ�� arrClone�� �ٲ��.(��������.)�޸𸮻� ����.
		// arrClone=arr; (���� ����) �������� ���.
		arrClone[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}
