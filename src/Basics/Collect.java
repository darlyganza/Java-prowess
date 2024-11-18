package Basics;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collect {
	public static void main(String[] args) {
//		List of items
		Set items = new HashSet();
		items.add(101);
		items.add("Darlene");
		items.add("3.14");
		items.add(new Date());
		for (Object o: items) {
		System.out.println(o);
		}
	}
}
