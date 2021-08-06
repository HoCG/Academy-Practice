package 상속;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); //교차생성을 하면 이것보다더 쉽게 가능.
		FireEngine fe2 = null;
		fe.water();
		car = fe; //주소를 넘겨준것. 형변환 된것은 아니다. 주의.
		//car.water();
		//fe2=(FireEngine)car; //형변환을 하려면 이렇게! 원래형식은 이렇게!
		fe.drive();
	}
}

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
