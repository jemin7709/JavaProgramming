package �߰������;

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "���� ¥�� " + model);
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.model = "������se";
		myPhone.value = 15;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "����2";
		yourPhone.value = 250;
		yourPhone.print();
	}

}
