package �߰������;

class Circle3{
	private void secret() {
		System.out.println("����̴�");
	}
	protected void findRadius() {
		System.out.println("�������� 10.0cm�̴�");
	}
	public void findArea() {
		System.out.println("������(3.14*������^2)�̴�");
	}
}

class Ball extends Circle3{
	private String color;
	public Ball(String color) {
		this.color = color;
	}
	public void findColor() {
		System.out.println(color + " ���̴�");
	}
	public void findArea() {
		System.out.println("���̴� 4*(3.14*������^2)�̴�.");
	}
	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(3.14*������^2)�̴�");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 c1 = new Circle3();
		Ball c2 = new Ball("������");
		
		System.out.println("��: ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n��: ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
	}

}
