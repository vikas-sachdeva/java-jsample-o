package jsample;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {

		Sample1 sample1 = new Sample1();
		sample1.getSquares(Arrays.asList(9, 8, 7, 6)).forEach(System.out::println);
		
		sample1.prefixX(Arrays.asList(9, 8, 7, 6, 3)).forEach(System.out::println);
	}
}
