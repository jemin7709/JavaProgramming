package 중간고사대비;

public class CircleDemo1 {
	static double radius;
	static double findArea() {
		return 3.14*radius*radius;
	}
	static void show(double x, double y) {
		System.out.println("반지름= "+x+", 넓이= "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius = 10.0;
		double area = findArea();
		show(radius, area);
	}

}
