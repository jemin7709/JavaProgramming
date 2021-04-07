import java.util.Scanner;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int score[] = new int[5];
		int sum = 0;
		int length = score.length;
		for (int i = 0; i < length; i++) {
			score[i] = in.nextInt();
		}
		for (int s : score) {
			sum += s;
		}
		System.out.println("ЦђБе = " + sum / (double) length);
	}

}

