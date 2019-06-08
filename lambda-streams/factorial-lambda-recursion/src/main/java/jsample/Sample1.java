package jsample;

import java.util.function.UnaryOperator;

public class Sample1 {

	/*
	 * Calling lambda function using "this" keyword is mandatory. Without "this"
	 * keyword, it will throw compilation error -
	 * 
	 * Cannot reference a field before it is defined
	 */
	private UnaryOperator<Integer> unaryOperator = n -> n <= 1 ? 1 : n * this.unaryOperator.apply(n - 1);

	public int getFactorial(int num) {

		return (int) unaryOperator.apply(num);

	}
}
