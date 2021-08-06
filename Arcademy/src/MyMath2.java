
class MyMath12 {
	long a, b;

	long add() {
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}
	static long substract(long a, long b) {  //long형은 숫자에 문자포함.
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
}
class MyMath2{
	public static void main(String[] args) {
		System.out.println(MyMath12.add(200L, 100L));
		System.out.println(MyMath12.substract(200L, 100L));
		System.out.println(MyMath12.multiply(200L, 100L)); 
		System.out.println(MyMath12.divide(200.0, 100.0));
		MyMath12 mm = new MyMath12();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}