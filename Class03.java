
package Java15;

class XTest extends Thread {
	private String id;

	public XTest(String str) {
		id = str;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 100000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

public class Class03 {
	public static void main(String args[]) {
		XTest hi = new XTest("Hello");
		XTest bye = new XTest("Good bye");
		hi.start();
		bye.start();
	}
}
