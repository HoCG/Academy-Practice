package 인터페이스와예외;

public class CardToString { // 패키지와 유용한 클래스(toString)
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println(c1.toString());
		System.out.println(c2); // 이름만 써도 사용가능(to스트링만.)
	}
}

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
    //만약 아래의 toString함수가 없다면 해당 객체의 주소를 찍어준다.
	public String toString() {
		return "kind: " + kind + ",number: " + number;
	}
}
