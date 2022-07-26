/* Name: Akkahshh Narendra Agarwaal
 * Email ID: akkahshh24@gmail.com
 * Guided_Assignment_2022_07_26
 * Assignment 32_01_a
 */

package array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ArrayListExercise {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		// adding elements to the list
		strList.add("listen");
		strList.add("triangle");
		strList.add("silent");
		strList.add("integral");
		strList.add("Python");
		strList.add("Java");
		
		// size of list
		System.out.println("Size of the ArrayList: " + strList.size());
		
		// empty or not
		System.out.println("ArrayList isEmpty: " + strList.isEmpty());
		
		// printing index and element
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("ArrayList at index " + i + ": " + strList.get(i));
		}
		
		// replacing the fifth element
		strList.set(5, "MySQL");
		System.out.println("List after changes: " + strList);
		
		// creating a second list
		List<String> strList2 = new ArrayList<String>();
		
		// adding elements to the second list
		strList2.add("race");
		strList2.add("cab");
		strList2.add("abc");
		strList2.add("care");
		
		// appending second list to first list
		strList.addAll(strList2);
		System.out.println("After appending the list: " + strList);
		
		// printing anagrams from the list
	    HashMap<String, List<String>> anagramMap = new HashMap<>();
	    
	    for(String str: strList) {
	    	char[] chars = str.toCharArray();
	    	Arrays.sort(chars);
	    	String key = new String(chars);
	    	if(anagramMap.containsKey(key)) {
	    		anagramMap.get(key).add(str);
	    	}
	    	else {
	    		List<String> anagramList = new ArrayList<String>();
	    		anagramList.add(str);
	    		anagramMap.put(key, anagramList);
	    	}
	    }
	    System.out.print("Anagrams in the List: ");
	    
	    for(Entry<String, List<String>> entry: anagramMap.entrySet()) {
	    	if(entry.getValue().size() > 1)
	    		System.out.print(entry.getValue() + " ");
	    }
	}

}

/* 
OUTPUT:
Size of the ArrayList: 6
ArrayList isEmpty: false
ArrayList at index 0: listen
ArrayList at index 1: triangle
ArrayList at index 2: silent
ArrayList at index 3: integral
ArrayList at index 4: Python
ArrayList at index 5: Java
List after changes: [listen, triangle, silent, integral, Python, MySQL]
After appending the list: [listen, triangle, silent, integral, Python, MySQL, race, cab, abc, care]
Anagrams in the List: [race, care] [cab, abc] [listen, silent] [triangle, integral] 
*/
