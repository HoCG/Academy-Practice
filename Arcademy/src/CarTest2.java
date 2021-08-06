
public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();    //c1=매개변수.
		Car c2 = new Car("blue");
		Car c3 = new Car(c1);
		
		c3.color=c1.color;
		
		System.out.println("c1의 color=" + c1.color + ",gearType=" + c1.gearType + ",door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ",gearType=" + c2.gearType + ",door=" + c2.door);
		System.out.println("c3의 color=" + c3.color + ",gearType=" + c3.gearType + ",door=" + c3.door);
	}

}

class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);    //기본틀.
	}
	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color) {
		this(color, "auto", 4);  //클래스안 다른 생성자.
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;  //클래스 안에있는 맴버변수를 지정.
		this.door = door;
	}
}
