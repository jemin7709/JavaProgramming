
public class CharBoolDemo {

	public static void main(String[] args) {
		char ga1 = '가';
		char ga2 = '\uac00';
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "가 아니면 " + geojit + "입니다.");
		//char가 몇 바이트인지 확인;
		System.out.println(Character.BYTES);
		
		//형변환
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
		
		//오버플로우
		byte b = 127;
		System.out.println(++b);
	}

}
