import java.util.Scanner;

public class Array1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		int length = scores.length;

		for (int i = 0; i < length; i++) {
			scores[i] = in.nextInt();
		}
		for (int i = 0; i < length; i++) {
			sum += scores[i];
		}
		System.out.println("ЦђБе: " + sum / (double) length);
	}

}
