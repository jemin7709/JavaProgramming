package 중간고사대비;

class Vehicle{
	String name="탈것";
	void whoami() {
		System.out.println("나는 탈것");
	}
	static void move() {
		System.out.println("이동하다");
	}
}

class Car extends Vehicle{
	String name = "자동차";
	void whoami() {
		System.out.println("나는 자동차");
	}
	static void move() {
		System.out.println("달리다");
	}
}

public class OverTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Car();
		System.out.println(v.name);
		v.whoami();
		v.move();
	}

}
