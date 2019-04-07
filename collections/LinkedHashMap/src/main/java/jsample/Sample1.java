package jsample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sample1 {

	public void traverseMap() {

		Map<String, String> map = new LinkedHashMap<String, String>(16, 0.75f, true);

		map.put("first", "1");
		map.put("second", "2");
		map.put("third", "3");
		map.put("fourth", "4");

		// accessed key will move to end.
		map.get("second");

		for (Entry<String, String> entry : map.entrySet()) {

			System.out.println("Key = " + entry.getKey() + " , value =  " + entry.getValue());

		}
	}
}
