package 중간고사대비;

class Circle3{
	private void secret() {
		System.out.println("비밀이다");
	}
	protected void findRadius() {
		System.out.println("반지름이 10.0cm이다");
	}
	public void findArea() {
		System.out.println("면적은(3.14*반지름^2)이다");
	}
}

class Ball extends Circle3{
	private String color;
	public Ball(String color) {
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + " 공이다");
	}
	public void findArea() {
		System.out.println("넓이는 4*(3.14*반지름^2)이다.");
	}
	public void findVolume() {
		System.out.println("부피는 4/3*(3.14*반지름^2)이다");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 c1 = new Circle3();
		Ball c2 = new Ball("빨간색");
		
		System.out.println("원: ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
	}

}
