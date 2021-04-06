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
		System.out.println("이동");
	}

	void stop() {
		System.out.println("정지");
	}

	abstract void attack();
}

class Marine extends Unit {
	Marine() {
		name = "Marine";
		hp = 40;
	}

	void attack() {
		System.out.println("지상, 공중을 공격");
	}

	void stimPack() {
		if (hp <= 10) {
			System.out.println("남아있는 체력이 충분하지 않습니다");
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
		System.out.println("지상을 공격");
	}
	void siegeMode() {
		System.out.println("시즈모드");
	}
}

class DropShip extends Unit{
	DropShip(){
		name = "DropShip";
		hp=150;
	}
	void getOn(Unit u) {
		System.out.println(u.name + "을 탑승시킵니다");
	}
	void drop(Unit u) {
		System.out.println(u.name + "을 하차시킵니다");
	}
	void attack() {
		System.out.println("이 유닛은 공격할수 없습니다");
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
