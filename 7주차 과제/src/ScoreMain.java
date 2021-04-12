import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ScoreMain {
	static char getDegree(int score) {//getDegree함수: score을 입력받아 degree로 변환
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
		//선언부
		Queue<String> nameQ = new LinkedList<>(); // name을 저장할 queue
		Queue<Character> degreeQ = new LinkedList<>(); // degree를 저장할 queue
		Scanner sc = new Scanner(System.in); // Scanner 객체
		String name;
		int score;
		
		//입력부
		for (int i = 0;; i++) { //무한루프
			System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요? : ");
			name = sc.next();
			if (name.equals("exit")) { // name이 exit라면 반복문 종료
				break;
			}
			System.out.print("점수 " + (i + 1) + "을 입력하세요 : ");
			score = sc.nextInt();
			nameQ.offer(name); // name을 name큐에 push
			degreeQ.offer(getDegree(score)); // score를 getDegree으로 degree로 바꾼 후 degree큐에 push
		}
		
		sc.close(); // sc객체를 닫기
		final int length = nameQ.size(); // 바로 큐.size()를 쓰면 큐가 제거되면서 반복문이 제대로 돌아가지 않기 때문에 상수로 만들어주기
		
		//출력부
		for (int i = 0; i < length; i++) {
			System.out.println((i + 1) + "번 학생 " + nameQ.poll() + "의 등급은 " + degreeQ.poll() + "입니다."); // pop 하면서 출력
		}
	}

}
