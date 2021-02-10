package javaWeek4;

public class StringBuilerNotes {

	public static void main(String[] args) {
		
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		//method of String concat
		System.out.println(firstName.concat(lastName));
		
		//String builder
		
		StringBuilder fullName = new StringBuilder("Sam");//existing string builder
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
//		System.out.println(fullName.charAt(5));//prints out the letter where value 5 would be
//		System.out.println(fullName.deleteCharAt(5));//deletes the letter where value 5 would be
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
		//you use a String Builder when you want to dynamically create a string and you want a string when you don't want to change and keep it the same.
		

	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder(); //empty string builder
		for(int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
