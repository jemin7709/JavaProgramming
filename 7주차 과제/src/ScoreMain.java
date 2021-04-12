import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ScoreMain {
	static char getDegree(int score) {//getDegree�Լ�: score�� �Է¹޾� degree�� ��ȯ
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����
		Queue<String> nameQ = new LinkedList<>(); // name�� ������ queue
		Queue<Character> degreeQ = new LinkedList<>(); // degree�� ������ queue
		Scanner sc = new Scanner(System.in); // Scanner ��ü
		String name;
		int score;
		
		//�Էº�
		for (int i = 0;; i++) { //���ѷ���
			System.out.print("�л� " + (i + 1) + "�� �̸��� �Է��ϼ���? : ");
			name = sc.next();
			if (name.equals("exit")) { // name�� exit��� �ݺ��� ����
				break;
			}
			System.out.print("���� " + (i + 1) + "�� �Է��ϼ��� : ");
			score = sc.nextInt();
			nameQ.offer(name); // name�� nameť�� push
			degreeQ.offer(getDegree(score)); // score�� getDegree���� degree�� �ٲ� �� degreeť�� push
		}
		
		sc.close(); // sc��ü�� �ݱ�
		final int length = nameQ.size(); // �ٷ� ť.size()�� ���� ť�� ���ŵǸ鼭 �ݺ����� ����� ���ư��� �ʱ� ������ ����� ������ֱ�
		
		//��º�
		for (int i = 0; i < length; i++) {
			System.out.println((i + 1) + "�� �л� " + nameQ.poll() + "�� ����� " + degreeQ.poll() + "�Դϴ�."); // pop �ϸ鼭 ���
		}
	}

}
