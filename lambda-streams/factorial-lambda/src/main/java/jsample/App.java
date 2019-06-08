package jsample;

public class App {
	public static void main(String[] args) {

		Sample1 sample1 = new Sample1();
		System.out.println("Factorial of 4 is " + sample1.getFactorial(4));

		System.out.println("Factorial of 3 is " + sample1.getFactorial(3));

		System.out.println("Factorial of 2 is " + sample1.getFactorial(2));

		System.out.println("Factorial of 1 is " + sample1.getFactorial(1));
		
		System.out.println("Factorial of 0 is " + sample1.getFactorial(0));
	}
}
