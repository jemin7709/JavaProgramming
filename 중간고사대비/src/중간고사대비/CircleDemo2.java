package 중간고사대비;

public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 mycircle = new Circle1();
		mycircle.radius = 10.0;
		mycircle.show(mycircle.radius, mycircle.findArea());
	}
}

class Circle1 {
	double radius;

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.println("반지름= " + x + ", 넓이= " + y);
	}
}
