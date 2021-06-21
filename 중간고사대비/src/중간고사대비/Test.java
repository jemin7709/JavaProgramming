package 중간고사대비;

class MT extends Thread{
	public void run() {
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
	}
}

public class Test {
	interface func{
		public abstract int plus(int a,int b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func f = (int a,int b)->{return a+b;};
		System.out.println(f.plus(5, 10));
		new Thread(()->{
			
		}).start();
		MT thread = new MT();
		thread.start();
	}

}
