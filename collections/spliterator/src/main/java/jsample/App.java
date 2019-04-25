package jsample;

public class App {
	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		System.out.println("Sequential -");
		sample1.sequentialTraverse();

		System.out.println("Sequential using TryAdvance -");
		sample1.sequentialTraverse();

		System.out.println("\n\nParallel -");

		sample1.parallelTraverse();
	}
}
