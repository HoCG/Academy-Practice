package 상속;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) { //생성자.
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ",y:" + y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		//this.x = x;
		//this.y = y;
		super(x,y); //상위클래스의 생성자도움을 받으려면 super. 상위클래스 모양에따라 super를 맞출것.
		this.z = z;
	}

	String getLocation() {
		return "x :" + x + ",y:" + y + ",z:" + z;
	}
}
