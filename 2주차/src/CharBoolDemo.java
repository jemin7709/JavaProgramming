
public class CharBoolDemo {

	public static void main(String[] args) {
		char ga1 = '��';
		char ga2 = '\uac00';
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "�� �ƴϸ� " + geojit + "�Դϴ�.");
		//char�� �� ����Ʈ���� Ȯ��;
		System.out.println(Character.BYTES);
		
		//����ȯ
		int i;
		double d;
		i = 7/4;
		System.out.println(i);
		d = 7/4;
		System.out.println(d);
		d = 7/(double)4;
		System.out.println(d);
		d = 7/4.0;
		System.out.println(d);
		d = 7/4f;
		System.out.println(d);
		
		//�����÷ο�
		byte b = 127;
		System.out.println(++b);
	}

}
