package 상속;

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv { //메모리라는 개념으로 이해.
	boolean caption;

	void displayCaption(String text) {
		if (caption) {  //초기값 false
			System.out.println(text);
		}
	}
}

public class CaptionTVtest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();     //Tv의 내용을 활용가능!
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,world");
		ctv.caption = true;
		ctv.displayCaption("Hello,world");
		
		Tv tv = new Tv();//상속받는 애들껀 못씀. 밖에 것은 못씀.
	}

}
