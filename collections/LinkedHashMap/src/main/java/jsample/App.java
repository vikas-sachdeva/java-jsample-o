package jsample;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Traversing with access order -");
		
		Sample1 sample1 = new Sample1();
		sample1.traverseMap();
		
		System.out.println("\nTraversing with insertion order -");
		
		Sample2 sample2 = new Sample2();
		sample2.traverseMap();
	}
}
