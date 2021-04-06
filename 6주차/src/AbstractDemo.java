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
		System.out.println("원을 그리다");
	}

	public double findArea() {
		return pi * radius * radius;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());
	}

}
