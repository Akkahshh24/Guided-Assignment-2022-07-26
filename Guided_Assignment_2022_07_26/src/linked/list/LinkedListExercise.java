/* Name: Akkahshh Narendra Agarwaal
 * Email ID: akkahshh24@gmail.com
 * Guided_Assignment_2022_07_26
 * Assignment 32_01_b
 */

package linked.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		
		List<String> places = new ArrayList<String>();
		places.add("USA");
		places.add("Canada");
		places.add("Australia");
		
		// addAll() method
		names.addAll(places);
		System.out.println("LinkedList after addAll: " + names);
		
		System.out.println("-----------------------------------");
		
		// addFirst() method
		names.addFirst("Germany");
		System.out.println("LinkedList after addFrist: " + names);
		
		System.out.println("-----------------------------------");
		
		// addLast() method
		names.addLast("UK");
		System.out.println("LinkedList after addLast: " + names);
		
		System.out.println("-----------------------------------");
		
		// indexOf() method
		System.out.println("Index of USA in list: " + names.indexOf("USA"));
		System.out.println("Index of UK in list: " + names.indexOf("UK"));
		
		System.out.println("-----------------------------------");
		
		// lastIndexOf() method
		names.add("Germany");
		System.out.println("LinkedList: " + names);
		System.out.println("lastIndexOf Germany in list: " + names.lastIndexOf("Germany"));
		
		System.out.println("-----------------------------------");
		
		// peekFirst() method
		System.out.println("peekFirst: " + names.peekFirst());
		
		System.out.println("-----------------------------------");
		
		// peekLast() method
		System.out.println("peekLast: " + names.peekLast());
		
		System.out.println("-----------------------------------");
		
		// pollFirst() method
		System.out.println("LinkedList before pollFirst: " + names);
		System.out.println("pollFirst: " + names.pollFirst());
		System.out.println("LinkedList after pollFirst: " + names);
		
		System.out.println("-----------------------------------");
		
		// pollLast() method
		System.out.println("LinkedList before pollLast: " + names);
		System.out.println("pollLast: " + names.pollLast());
		System.out.println("LinkedList after pollLast: " + names);
		
		System.out.println("-----------------------------------");
		
		// size() method
		System.out.println("size: " + names.size());

	}

}

/*
OUTPUT:
LinkedList after addAll: [USA, Canada, Australia]
-----------------------------------
LinkedList after addFrist: [Germany, USA, Canada, Australia]
-----------------------------------
LinkedList after addLast: [Germany, USA, Canada, Australia, UK]
-----------------------------------
Index of USA in list: 1
Index of UK in list: 4
-----------------------------------
LinkedList: [Germany, USA, Canada, Australia, UK, Germany]
lastIndexOf Germany in list: 5
-----------------------------------
peekFirst: Germany
-----------------------------------
peekLast: Germany
-----------------------------------
LinkedList before pollFirst: [Germany, USA, Canada, Australia, UK, Germany]
pollFirst: Germany
LinkedList after pollFirst: [USA, Canada, Australia, UK, Germany]
-----------------------------------
LinkedList before pollLast: [USA, Canada, Australia, UK, Germany]
pollLast: Germany
LinkedList after pollLast: [USA, Canada, Australia, UK]
-----------------------------------
size: 4
*/