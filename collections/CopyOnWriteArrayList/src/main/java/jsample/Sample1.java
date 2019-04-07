package jsample;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sample1 {

	public void traverseList() {

		List<String> list = new CopyOnWriteArrayList<>();
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");

		Iterator<String> iterator = list.iterator();
		boolean firstIteraion = true;
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
			if (firstIteraion) {
				/**
				 * Even though, list is modified, ConcurrentModificationException will not be
				 * thrown. Such type of iterator is called fail-safe iterator.
				 * 
				 * But, modifications performed in the list will not be reflected in this
				 * iterator.
				 **/
				list.remove(3);
				firstIteraion = false;
			}
		}
	}
}
