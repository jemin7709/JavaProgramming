
public class Operator {

	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x<1)||(y--<1)); // �տ��͸� ���� �Ѿ (������)
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x<1)|(y--<1)); // �ڿ����� ���� �Ѿ (��Ʈ����)
		System.out.println("x = " + x + ", y = " + y);
	}

}
