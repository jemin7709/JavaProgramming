import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("������ �Է��ϼ���: ");
		int score = in.nextInt();
		/*
		 * if(score >= 90) { grade = "A"; } else if(score >= 80) { grade = "B"; } else
		 * if(score >= 70) { grade = "C"; } else if(score >= 60) { grade = "D"; } else {
		 * grade = "F"; }
		 */
		grade = score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? "D" : "F"; 
		System.out.println("����� ������ " + grade);
	}

}
