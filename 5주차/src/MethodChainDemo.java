
public class MethodChainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("?α?").setAge(21).sayHello();
		System.out.println(person);
		System.out.println(person.setName("?α?"));
		System.out.println(person.setName("?α?").setAge(21));
	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("?ȳ?, ???? " + name + "?̰? " + age + "???̾?.");
	}
}