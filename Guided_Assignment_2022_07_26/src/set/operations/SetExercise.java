/* Name: Akkahshh Narendra Agarwaal
 * Email ID: akkahshh24@gmail.com
 * Guided_Assignment_2022_07_26
 * Assignment 32_01_c
 */

package set.operations;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<Integer>();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(2); // duplicate element not added in set
		
		Set<Integer> setB = new HashSet<Integer>();
		setB.add(2);
		setB.add(3);
		setB.add(4);
		
		System.out.println("First set: " + setA);
		System.out.println("Second set: " + setB);
		
		Set<Integer> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);
		System.out.println("Elements in both sets: " + intersection);
		
	}

}

/*
OUTPUT:
First set: [1, 2, 3]
Second set: [2, 3, 4]
Elements in both sets: [2, 3]
*/
