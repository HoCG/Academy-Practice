package �������̽��Ϳ���;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) { // ��Ű���� ������ Ŭ���� ��ĳ�ʻ��
		Scanner s = new Scanner(System.in);    //Ű���� �Է��� �ý���.in����.
		String[] argArr = null;
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);
			String input = s.nextLine();
			input = input.trim();
			argArr = input.split("+");
			String command = argArr[0].trim();
			if ("".equals(command))
				continue;
			command = command.toLowerCase();
			if (command.equals("q")) {    //��Ʈ���� equals����. ""����!!
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++)
					System.out.println(argArr[i]);
			}
		}
	}

}
