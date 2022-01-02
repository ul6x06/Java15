
package Java15;

class KTest extends Thread implements Runnable {
	private String id;
	private int sec;

	public KTest(String str, int s) {
		id = str;
		sec = s;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(sec);
			} catch (InterruptedException e) {
			}
			System.out.println(id + " is running..");
		}
	}
}

public class Class09 {
	public static void main(String args[]) {
		KTest one = new KTest("Thread 1", 1000);
		KTest two = new KTest("Thread 2", 2500);
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.start();
		t2.start();
	}
}
