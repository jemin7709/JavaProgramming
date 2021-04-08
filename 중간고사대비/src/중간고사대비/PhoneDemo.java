package 중간고사대비;

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "만원 짜리 " + model);
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.model = "아이폰se";
		myPhone.value = 15;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "폴드2";
		yourPhone.value = 250;
		yourPhone.print();
	}

}
