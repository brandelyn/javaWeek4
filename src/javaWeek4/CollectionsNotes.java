package javaWeek4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsNotes {

	public static void main(String[] args) {

		// 3 types of collections list, set and map and each is a different data
		// structure

		/*
		 * list
		 * 
		 * Allows Duplicates
		 * keeps elements ordered by index
		 * Allows null values
		 * Common implementations:ArrayList, LinkedList, Vector. ArrayList is the most common used
		 */
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		for(String student: students) {
			System.out.println(student);
		}
		System.out.println(students.get(2));//sam
		System.out.println(students.get(0));//rob

		/*
		 * Set
		 * 
		 * No Duplicates
		 * Unordered
		 * Allows null value
		 * Common Implementations: HashSet, LinkedHashSet, TreeSet. HashSet is the most common used.
		 */
		Set<String> states = new HashSet<String>();
		states.add("Alabama");//if i were to put "Alabama" twice it would only print out once and delete the other one in the system
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		
		System.out.println(states.size());//checks the size of the list
		System.out.println(states.contains("Delaware"));//uses a boolean to check  if its in the list you created
		if(states.contains("Alabama")) { //you can use the if statement to also help remove
		states.remove("Alabama"); //removes whatever you want to remove from the list
		}
		
		for(String state : states) {
			System.out.println(state);
		}

		/*
		 * Map
		 * 
		 * Map<k,V> K is the key, and V is the Value
		 * 
		 * Key value pairs(Dictionary) 
		 * Values can be duplicate, but not keys
		 * so you could only have augment but different meanings for it since augment is a key and the meaning is a value
		 * Common Implementations: HashMap, LinkedHashMap, TreeMap, and Hashtable
		 */
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for(Integer key : racerKeys) {
			
		System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		for(String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("augment", "Make something greater by adding to it; increase");
		dictionary.put("Diminish", "Make or become less");
		dictionary.put("ostentatious", "Characterized by vulgur or pretentious display; designed to impress");
		
		

	}

}
