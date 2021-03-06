//Ctrl + Shift + f: 자동 정렬
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

class CaptionTv extends Tv {
	boolean caption;// 캡션상태(on/off)

	void displayCaption(String text) {
		if (caption)
			System.out.println(text);
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		System.out.println(ctv);
		ctv.channel = 10;// 조상클래스로부터상속받은멤버
		ctv.channelUp();// 조상클래스로부터상속받은멤버System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		System.out.println(ctv.channel);
		ctv.caption = true;// 캡션기능을켠다.
		ctv.displayCaption("Hello, World");// 캡션을화면에보여준다.
	}

}
