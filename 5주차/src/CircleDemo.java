
public class CircleDemo {
	static Circle myCircle2; // 전역변수: 초기화 안해도 됨
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
		System.out.println(myCircle);
		System.out.println(myCircle2);
	}

}

class Circle {
	Circle(){ // 생성자
		System.out.println("생성자 실행");
		System.out.println(this);
	}
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea() {
		return 3.14 * getRadius() * getRadius();
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}

}
