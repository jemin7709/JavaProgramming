
public class Rule {
	//전역변수 -> 초기화를 안해줘도 괜찮음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기 안에 있으면 지역변수
		int radius = 10; // 참조객체 x, 초기화를 꼭 해줘야함
		Integer r = 10; // 참조객체(Integer 클래스)
		r = radius; //이것도 가능
		//radius = null; // 얘는 안됨
		r = null; // 얘는 됨
		System.out.println(Integer.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Long.BYTES);
	}

}
