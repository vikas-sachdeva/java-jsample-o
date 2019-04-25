package jsample;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample1 {

	public void sequentialTraverse() {
		List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
		Spliterator<Integer> splitIterator = list.spliterator();

		System.out.println("Estimated size " + splitIterator.estimateSize());

		System.out.println("Get Exact size " + splitIterator.getExactSizeIfKnown());
		System.out.println("List elements -");
		splitIterator.forEachRemaining(System.out::println);
	}

	public void sequentialTraverseUsingTryAdvance() {
		List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());
		Spliterator<Integer> splitIterator = list.spliterator();

		System.out.println("Estimated size " + splitIterator.estimateSize());

		System.out.println("Get Exact size " + splitIterator.getExactSizeIfKnown());
		System.out.println("List elements -");

		while (splitIterator.tryAdvance(System.out::println))
			;

	}

	public void parallelTraverse() {
		List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList());

		Spliterator<Integer> splitIterator = list.spliterator();

		System.out.println("Estimated size " + splitIterator.estimateSize());

		System.out.println("Get Exact size " + splitIterator.getExactSizeIfKnown());

		System.out.println("Split iterator -");

		Spliterator<Integer> splitIterator1 = splitIterator.trySplit();

		System.out.println("Estimated size after splitting " + splitIterator.estimateSize());

		System.out.println("Get Exact size after splitting " + splitIterator.getExactSizeIfKnown());

		System.out.println("List elements -");

		splitIterator.forEachRemaining(System.out::println);

		System.out.println("Estimated size " + splitIterator1.estimateSize());

		System.out.println("Get Exact size " + splitIterator1.getExactSizeIfKnown());

		splitIterator1.forEachRemaining(System.out::println);

	}
}
