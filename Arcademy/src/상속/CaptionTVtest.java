package ���;

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

class CaptionTv extends Tv { //�޸𸮶�� �������� ����.
	boolean caption;

	void displayCaption(String text) {
		if (caption) {  //�ʱⰪ false
			System.out.println(text);
		}
	}
}

public class CaptionTVtest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();     //Tv�� ������ Ȱ�밡��!
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,world");
		ctv.caption = true;
		ctv.displayCaption("Hello,world");
		
		Tv tv = new Tv();//��ӹ޴� �ֵ鲫 ����. �ۿ� ���� ����.
	}

}
