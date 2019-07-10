package jsample;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		Sample1 sample1 = new Sample1();
		Map<String, String> map = new HashMap<>();
		map.put("first", "1");
		map.put("second", "2");
		map.put("third", "3");
		map.put("fourth", "4");
		System.out.println("All keys in the map - ");
		sample1.getAllKeys(map).forEach(System.out::println);
		System.out.println("All values in the map - ");
		sample1.getAllValues(map).forEach(System.out::println);
	}
}
