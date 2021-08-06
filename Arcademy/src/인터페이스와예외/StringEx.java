package 인터페이스와예외;

public class StringEx {
	public static void main(String[] args) { //패키지와 유용한 클래스 스트링 부분. 자바 api검색하면 클래스이름 메소드이름 소개되어있음.
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";"); // \쓰고 "하면 
		System.out.println("String str2 = \"abc\";");
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));
		System.out.println();
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		System.out.println("str3==str4 ? "+(str3 == str4));
		System.out.println("str3.equals(str4) ? "+str3.equals(str4));    //equals는 참거짓값을 반환해요!
	}
}
