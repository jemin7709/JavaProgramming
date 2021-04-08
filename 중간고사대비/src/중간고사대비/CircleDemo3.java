package 중간고사대비;

public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle = new Circle2();
		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}

class Circle2{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		this.radius =r;
	}
	double findArea() {
		return 3.14*radius*radius;
	}
	void show(double x, double y) {
		System.out.println("반지름= " + x + ", 넓이= " + y);
	}
}
