package �߰������;

abstract class Shape{
	double width = 5;
	abstract void draw();
	public double findArea() {
		return 0.0;
	}
}
class Square extends Shape{
	int height;
	public Square(int height) {
		this.height = height;
	}
	public void draw() {
		System.out.println("�簢���� �׸���");
	}
	public double findArea() {
		return width*height;
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(5);
		s.draw();
		System.out.println("�簢���� ���̴�: "+s.findArea());
	}

}
