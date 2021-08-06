package �������̽��Ϳ���;

public class CardToString { // ��Ű���� ������ Ŭ����(toString)
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		System.out.println(c1.toString());
		System.out.println(c2); // �̸��� �ᵵ ��밡��(to��Ʈ����.)
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
    //���� �Ʒ��� toString�Լ��� ���ٸ� �ش� ��ü�� �ּҸ� ����ش�.
	public String toString() {
		return "kind: " + kind + ",number: " + number;
	}
}
