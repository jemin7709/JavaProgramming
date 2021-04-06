interface Controllable{
	default void repair() {
		System.out.println("장비를 수리합니다");
	}
	static void reset() {
		System.out.println("장비를 초기화합니다");
	}
	void turnOn();
	void turnOff();
}

class Computer implements Controllable{
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");
	}
	public void turnOff() {
		System.out.println("컴퓨터를 끈다");
	}
}

class Tv implements Controllable{
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끈다");
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
