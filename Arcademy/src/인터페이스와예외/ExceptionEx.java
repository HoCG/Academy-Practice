package 인터페이스와예외;

public class ExceptionEx {                  //예외처리
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);        //오류발생해서 catch
			System.out.println(4);
		}catch (ArithmeticException ae) {   //여러 경우의 오류로 만들수있다.  꼭필요한 경우도 있다. 등록을 해두는걸 숙지.
			System.out.println(5);          //다시 돌아가지 않고 바로 아래로.
		}
		System.out.println(6);
	} //원래짝은 finally
}
