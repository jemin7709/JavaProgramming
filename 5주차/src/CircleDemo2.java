
class Circle2{
	private double radius;
	static int numOfCircles = 0;
	private int numCircles = 0;
	
	public Circle2(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getNumCircles() {
		return numCircles;
	}

	public void setNumCircles(int numCircles) {
		this.numCircles = numCircles;
	}
}
public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 myCircle2 = new Circle2(10.0);
		Circle2 yourCircle = new Circle2(5.0);
		
		System.out.println("원의 개수: "+ Circle2.numOfCircles);
		System.out.println("원의 개수: "+myCircle2.numOfCircles);
		System.out.println("원의 개수: "+yourCircle.numOfCircles);
	}

}
