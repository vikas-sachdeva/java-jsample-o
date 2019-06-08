package jsample;

import java.util.function.UnaryOperator;

public class Sample1 {

	private UnaryOperator<Integer> unaryOperator = n -> {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact *= i;
		}
		return fact;
	};

	public int getFactorial(int num) {

		return (int) unaryOperator.apply(num);

	}
}
