
public class Method2Demo {

	public static long sum(int i1, int i2) {
		long starttime = System.currentTimeMillis();
		long sum = 0;
		for(int i = i1; i <= i2; i++) {
			sum += i;
		}
		long endtime = System.currentTimeMillis();
		System.out.println("�ð�: " + (endtime - starttime));
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum(1, 10));
		System.out.println(sum(10, 100));
		System.out.println(sum(100, 1000));
		System.out.println(sum(1, 10000000));
		
	}
	

}
