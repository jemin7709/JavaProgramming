interface Controllable{
	default void repair() {
		System.out.println("��� �����մϴ�");
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ�մϴ�");
	}
	void turnOn();
	void turnOff();
}

class Computer implements Controllable{
	public void turnOn() {
		System.out.println("��ǻ�͸� �Ҵ�");
	}
	public void turnOff() {
		System.out.println("��ǻ�͸� ����");
	}
}

class Tv implements Controllable{
	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ����");
	}
}

public class ControllableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controllable[] controllable = {new Tv(), new Computer()};
		for(Controllable c:controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}

}
