
public class Operator {

	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x<1)||(y--<1)); // 앞에것만 보고 넘어감 (논리연산)
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		System.out.println((x<1)|(y--<1)); // 뒤에까지 보고 넘어감 (비트연산)
		System.out.println("x = " + x + ", y = " + y);
	}

}
