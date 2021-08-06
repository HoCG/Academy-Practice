package 상속;

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("HEART",10);
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		System.out.println("c.width=");
		c.width=150;
		System.out.println(c.width);
	}
}
class Card{
	final int NUMBER;  //절대 안바뀌는 변수 == final 생성하는 순간에!!
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	Card(){
		this("HEART",1);
	}
	public String toString() {
		return KIND + " "+NUMBER;
	}
}
