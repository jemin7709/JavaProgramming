import java.sql.Date;
import java.util.Scanner;

class Talk{
	void Talking(String command) {
		if(command.equals("안녕")) {
			System.out.println("안녕하세요");
		}
		else if(command.equals("오늘 날짜 알려줘")) {
			Date now = new Date(System.currentTimeMillis());
			System.out.println(now);
		}
		else if(command.equals("3x3은?")) {
			System.out.println("9입니다");
		}
		else if(command.equals("종료방법 알려줘")) {
			System.out.println("잘가를 입력하면 종료됩니다");
		}
		else if(command.equals("야")) {
			System.out.println("네");
		}
		else if(command.equals("TV 켜줘")) {
			System.out.println("그런 기능은 현재 지원하지 않습니다");
		}
		else if(command.equals("날씨 알려줘")) {
			System.out.println("현재 날씨는 좋음 입니다");
		}
		else if(command.equals("30분 후에 알람 맞춰줘")) {
			System.out.println("그런 기능은 현재 지원하지 않습니다");
		}
		else if(command.equals("지원 기능 알려줘")) {
			System.out.println("현재는 대화 기능만 지원합니다");
		}
		else if(command.equals("전공 알려줘")) {
			System.out.println("제 전공은 컴퓨터공학입니다");
		}
		else if(command.equals("무슨 언어로 쓰였는지 알려줘")) {
			System.out.println("저는 자바로 쓰였습니다");
		}
		else if(command.equals("자바가 좋아 C++가 좋아")) {
			System.out.println("저는 파이썬이 좋아요");
		}
		else {
			System.out.println("모르겠습니다");
		}
	}
	
}

public class Talking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Talk com = new Talk();
		String command = input.nextLine();
		while(!command.equals("잘가")) {
			com.Talking(command);
			command = input.nextLine();
		}
	}

}
