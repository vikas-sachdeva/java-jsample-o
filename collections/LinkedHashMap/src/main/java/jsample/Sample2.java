package jsample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sample2 {

	public void traverseMap() {

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("first", "1");
		map.put("second", "2");
		map.put("third", "3");
		map.put("fourth", "4");
		
		map.get("second");

		for (Entry<String, String> entry : map.entrySet()) {

			System.out.println("Key = " + entry.getKey() + " , value =  " + entry.getValue());

		}
	}
}
