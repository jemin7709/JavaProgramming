package �߰������;
class Person1{
	void test() {}
}

class Student extends Person1{
	
}

public class InstanceofDemo {
	static void downcast(Person1 p) {
		if(p instanceof Student) {
			Student s =(Student)p;
			System.out.println("���� Ÿ�� ��ȯ �Ϸ�");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Person1 p = new Person1();
		System.out.println(s instanceof Person1);
		System.out.println(s instanceof Student);
		System.out.println(p instanceof Student);
		downcast(s);
	}

}
