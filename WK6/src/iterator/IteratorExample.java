package iterator;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		list.add("T");
		list.add("H");
		list.add("U");
		list.add("R");
		list.add("S");
		list.add("D");
		list.add("A");
		list.add("Y");
		
		System.out.println("Original list: " + list);
		
		/**
		 * Loop through the list using ListIterator 
		 */
		ListIterator iterator = list.listIterator();
		
		while (iterator.hasNext()) {
			Object i = iterator.next();
			System.out.println("Element: " + i);
		}
		
		/**
		 * Set updates the list but DOES NOT print it
		 */
		ListIterator newList = list.listIterator();
		
		while (newList.hasNext()) {
			Object i = newList.next();
			newList.set(i + "+");
		}
		
		System.out.println("List updated.");
		
		/**
		 * To print the list you need to loop throug the list agian
		 */
		ListIterator printUpdatedList = list.listIterator();
		
		while (printUpdatedList.hasNext()) {
			Object updatedList = printUpdatedList.next();
			System.out.println("Element: " + updatedList);
		}
		
		System.out.println("New list: " + list);
		
	}
		
}