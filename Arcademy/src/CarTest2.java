
public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();    //c1=�Ű�����.
		Car c2 = new Car("blue");
		Car c3 = new Car(c1);
		
		c3.color=c1.color;
		
		System.out.println("c1�� color=" + c1.color + ",gearType=" + c1.gearType + ",door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ",gearType=" + c2.gearType + ",door=" + c2.door);
		System.out.println("c3�� color=" + c3.color + ",gearType=" + c3.gearType + ",door=" + c3.door);
	}

}

class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);    //�⺻Ʋ.
	}
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color) {
		this(color, "auto", 4);  //Ŭ������ �ٸ� ������.
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;  //Ŭ���� �ȿ��ִ� �ɹ������� ����.
		this.door = door;
	}
}
