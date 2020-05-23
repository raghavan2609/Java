package works;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueDataCountInList {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		Set<String> uniqueSet = new HashSet<String>(list);
		Map<String, Integer> count = new HashMap<>();
		for (String temp : uniqueSet) {
		//	System.out.println(temp + ": " + Collections.frequency(list, temp));
			count.put(temp, Collections.frequency(list, temp));
		}
		System.out.println(count);

	}
}
