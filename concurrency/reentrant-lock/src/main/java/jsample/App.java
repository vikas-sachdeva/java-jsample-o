package jsample;

public class App {
	public static void main(String[] args) {

		Sample1 sample1 = new Sample1();

		new Thread(() -> sample1.put("first", "first")).start();

		new Thread(() -> sample1.put("second", "second")).start();

		new Thread(() -> sample1.put("third", "third")).start();
		
		new Thread(() -> sample1.put("third", "first")).start();

		new Thread(() -> sample1.delete("second")).start();

		new Thread(() -> System.out.println(sample1.get("second"))).start();

		new Thread(() -> System.out.println(sample1.get("third"))).start();
		
		new Thread(() -> sample1.update("third", "second")).start();

	}
}
