package javaWeek4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaWeek4Homework {

	public static void main(String[] args) {

		// Create an instance of an ArrayList of String called employeeNames

		List<String> employeeNames = new ArrayList<String>();

		// Create an instance of a HashSet of Integer called ids

		Set<Integer> ids = new HashSet<Integer>();

		// Create an instance of a HashMap of Integer, String called employeeMap

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		// Add at least five entries to the employeeNames and ids (make sure both
		// collections have the same number of entries).

		employeeNames.add("Tom Smith");
		employeeNames.add("Shelly Ritz");
		employeeNames.add("Frank Johnson");
		employeeNames.add("Mary Lopez");
		employeeNames.add("Matt Mendoza");

		ids.add(256987);
		ids.add(956825);
		ids.add(159824);
		ids.add(419862);
		ids.add(719245);

		// Create a variable int i = 0; then iterate over ids using an enhanced for
		// loop. Inside the enhanced for loop use employeeMap.put() to add a new entry
		// to the map. The entry should consist of a key that is the id in the enhanced
		// loop’s current iteration, and a value that is the employeeName at position i
		// of the employeeNames ArrayList. Increment i so that each iteration grabs the
		// next element in the ArrayList.

		int i = 0;

		for (Integer id : ids) {
			String employeeName = employeeNames.get(i++);
			employeeMap.put(id, employeeName);
		}

		// Once the employeeMap is fully populated, use another enhanced for loop to
		// iterate over the employeeMap.keySet(), and use the key for each current
		// iteration to print to the console both the current key and its associated
		// value in the map.
		
		for(Integer id : employeeMap.keySet()) {
			System.out.println(id + "-" + employeeMap.get(id));
		}
		
		//Create a StringBuilder called idsBuilder.
		
		StringBuilder idsBuilder = new StringBuilder();
		
		//Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		
		for(Integer id : ids) {
			idsBuilder.append(id).append("-");
		}
		idsBuilder.deleteCharAt(idsBuilder.length() - 1);
		
		//Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
		
		//Create another StringBuilder called namesBuilder.
		
		StringBuilder namesBuilder = new StringBuilder();
		
		//Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		
		for(String employeeName : employeeNames) {
			namesBuilder.append(employeeName).append(" ");
		}
		namesBuilder.deleteCharAt(namesBuilder.length() - 1);
		System.out.println(namesBuilder.toString());


	}

}
