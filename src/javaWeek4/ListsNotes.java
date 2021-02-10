package javaWeek4;

import java.util.ArrayList;
import java.util.List;

public class ListsNotes {

	public static void main(String[] args) {
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//a list is like an array but it over comes the limitations like an array.
		
		//List<String> reads as "List of String" where string is you want what data type
		//List<E> list of E where E is the generic that will be replaced with the type
		
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		for(int i = 0; i < sports.size(); i++) { //size is also a type of method
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		//if a method uses int you can use Integer instead since lists only use objects not primitive data types
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		//isEmpty will check if the list is empty or not using a boolean 
		//going forward your more likely to use a list over an array.
		
		   
		

	}

}
