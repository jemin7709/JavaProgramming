abstract class Shape {
	double pi = 3.14;

	abstract void draw();

	public double findArea() {
		return 0.0;
	}
}

class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("���� �׸���");
	}

	public double findArea() {
		return pi * radius * radius;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());
	}

}
