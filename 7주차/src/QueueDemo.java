import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.poll());
		q.offer("���");
		System.out.println("�ٳ����� �߰��߳���> "+ q.offer("�ٳ���"));
		
		try {
			q.add("ü��");
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("��� ������: " + q.peek());
		String head = null;
		
		try {
			head = q.remove();
			System.out.println(head + " �����ϱ�");
			System.out.println("���ο� ���: "+q.element());
		} catch (Exception e) {
			// TODO: handle exception
		}
		head = q.poll();
		System.out.println(head + " �����ϱ�");
		System.out.println("���ο� ���: "+q.peek());
		
		System.out.println("ü���� �����ϰ� �ֳ���? " +q.contains("ü��"));
		System.out.println("����� �����ϰ� �ֳ���? " +q.contains("���"));
	}

}
