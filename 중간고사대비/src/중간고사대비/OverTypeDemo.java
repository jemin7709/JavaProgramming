package �߰������;

class Vehicle{
	String name="Ż��";
	void whoami() {
		System.out.println("���� Ż��");
	}
	static void move() {
		System.out.println("�̵��ϴ�");
	}
}

class Car extends Vehicle{
	String name = "�ڵ���";
	void whoami() {
		System.out.println("���� �ڵ���");
	}
	static void move() {
		System.out.println("�޸���");
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
