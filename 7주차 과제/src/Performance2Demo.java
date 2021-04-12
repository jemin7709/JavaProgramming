import java.util.ArrayList;
import java.util.LinkedList;

public class Performance2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 100000; i++) {
			al.add(0, i);
		}
		for (int i = 0; i < 100000; i++) {
			ll.addFirst(i);
		}
		
		Long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			al.get(i);
		}
		Long end = System.nanoTime();
		Long duration = end - start;
		System.out.println("ArrayList로 처리한 시간: " + duration);

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			ll.get(i);
		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList로 처리한 시간: " + duration);
	}

}
