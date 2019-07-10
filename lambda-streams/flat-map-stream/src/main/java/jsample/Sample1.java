package jsample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample1 {

	@SafeVarargs
	public final List<String> merge(List<String>... list) {
		return Stream.of(list).flatMap(e -> e.stream()).collect(Collectors.toList());
	}

	public List<Integer> getSquares(List<Integer> elements) {
		return elements.stream().flatMap(e -> Stream.of(e * e)).collect(Collectors.toList());
	}

	public List<String> prefixX(List<Integer> elements) {
		return elements.stream().flatMap(e -> Stream.of("X" + e)).collect(Collectors.toList());
	}
}
