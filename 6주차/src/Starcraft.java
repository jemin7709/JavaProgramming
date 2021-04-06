abstract class Unit {
	int hp;
	String name;

	int getHp() {
		return this.hp;
	}

	void setHp(int hp) {
		this.hp = hp;
	}

	void move() {
		System.out.println("�̵�");
	}

	void stop() {
		System.out.println("����");
	}

	abstract void attack();
}

class Marine extends Unit {
	Marine() {
		name = "Marine";
		hp = 40;
	}

	void attack() {
		System.out.println("����, ������ ����");
	}

	void stimPack() {
		if (hp <= 10) {
			System.out.println("�����ִ� ü���� ������� �ʽ��ϴ�");
		} else {
			System.out.println("ah yeah!");
			hp -= 10;
		}
	}
}

class Tank extends Unit{
	Tank(){
		name="Tank";
		hp=150;
	}
	void attack(){
		System.out.println("������ ����");
	}
	void siegeMode() {
		System.out.println("������");
	}
}

class DropShip extends Unit{
	DropShip(){
		name = "DropShip";
		hp=150;
	}
	void getOn(Unit u) {
		System.out.println(u.name + "�� ž�½�ŵ�ϴ�");
	}
	void drop(Unit u) {
		System.out.println(u.name + "�� ������ŵ�ϴ�");
	}
	void attack() {
		System.out.println("�� ������ �����Ҽ� �����ϴ�");
	}
}

public class Starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marine raynor = new Marine();
		Tank duke = new Tank();
		DropShip fivebyfive = new DropShip();
		
		raynor.attack();
		raynor.stimPack();
		
		duke.attack();
		duke.siegeMode();
		
		fivebyfive.attack();
		fivebyfive.getOn(duke);
		fivebyfive.drop(raynor);
	
	}

}
