package jsample;

public class App {
	public static void main(String[] args) {

		Sample1 sample1 = new Sample1();
		new Thread(() -> sample1.writeA()).start();
		new Thread(() -> sample1.writeB()).start();
		new Thread(() -> sample1.read()).start();
		
	}
}
