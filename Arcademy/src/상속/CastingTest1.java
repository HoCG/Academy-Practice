package ���;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); //���������� �ϸ� �̰ͺ��ٴ� ���� ����.
		FireEngine fe2 = null;
		fe.water();
		car = fe; //�ּҸ� �Ѱ��ذ�. ����ȯ �Ȱ��� �ƴϴ�. ����.
		//car.water();
		//fe2=(FireEngine)car; //����ȯ�� �Ϸ��� �̷���! ���������� �̷���!
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
