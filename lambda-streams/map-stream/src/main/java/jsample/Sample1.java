package jsample;

import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {

	public List<Integer> getSquares(List<Integer> elements) {
		return elements.stream().map(e -> e * e).collect(Collectors.toList());
	}

	public List<String> prefixX(List<Integer> elements) {
		return elements.stream().map(e -> "X" + e).collect(Collectors.toList());
	}
}