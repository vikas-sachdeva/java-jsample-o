package jsample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample1 {

	public List<String> getAllKeys(Map<String, String> map) {
		return map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
	}

	public List<String> getAllValues(Map<String, String> map) {
		return map.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
	}

}
