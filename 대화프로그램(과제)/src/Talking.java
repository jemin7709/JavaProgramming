import java.sql.Date;
import java.util.Scanner;

class Talk{
	void Talking(String command) {
		if(command.equals("�ȳ�")) {
			System.out.println("�ȳ��ϼ���");
		}
		else if(command.equals("���� ��¥ �˷���")) {
			Date now = new Date(System.currentTimeMillis());
			System.out.println(now);
		}
		else if(command.equals("3x3��?")) {
			System.out.println("9�Դϴ�");
		}
		else if(command.equals("������ �˷���")) {
			System.out.println("�߰��� �Է��ϸ� ����˴ϴ�");
		}
		else if(command.equals("��")) {
			System.out.println("��");
		}
		else if(command.equals("TV ����")) {
			System.out.println("�׷� ����� ���� �������� �ʽ��ϴ�");
		}
		else if(command.equals("���� �˷���")) {
			System.out.println("���� ������ ���� �Դϴ�");
		}
		else if(command.equals("30�� �Ŀ� �˶� ������")) {
			System.out.println("�׷� ����� ���� �������� �ʽ��ϴ�");
		}
		else if(command.equals("���� ��� �˷���")) {
			System.out.println("����� ��ȭ ��ɸ� �����մϴ�");
		}
		else if(command.equals("���� �˷���")) {
			System.out.println("�� ������ ��ǻ�Ͱ����Դϴ�");
		}
		else if(command.equals("���� ���� �������� �˷���")) {
			System.out.println("���� �ڹٷ� �������ϴ�");
		}
		else if(command.equals("�ڹٰ� ���� C++�� ����")) {
			System.out.println("���� ���̽��� ���ƿ�");
		}
		else {
			System.out.println("�𸣰ڽ��ϴ�");
		}
	}
	
}

public class Talking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Talk com = new Talk();
		String command = input.nextLine();
		while(!command.equals("�߰�")) {
			com.Talking(command);
			command = input.nextLine();
		}
	}

}
