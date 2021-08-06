package 인터페이스와예외;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) { // 패키지와 유용한 클래스 스캐너사용
		Scanner s = new Scanner(System.in);    //키보드 입력은 시스템.in쓰기.
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
			if (command.equals("q")) {    //스트링은 equals쓸것. ""쓰고!!
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++)
					System.out.println(argArr[i]);
			}
		}
	}

}
