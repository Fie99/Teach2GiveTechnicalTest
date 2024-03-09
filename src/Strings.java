

/*Question 4: Capitalise Words
Write a program that accepts a string as input, capitalises the first letter of each word in the
string, and then returns the result string.*/

import java.util.Scanner;
public class Strings {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        String capitalizedString = capitalizeFirstLetter(input);
	        System.out.println(input + " => " + capitalizedString + "\"");
	    
	    }


	    public static String capitalizeFirstLetter(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }

	        StringBuilder result = new StringBuilder();
	        String[] words = input.split("\\s");

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                char firstChar = Character.toUpperCase(word.charAt(0));
	                result.append(firstChar).append(word.substring(1)).append(" ");
	            }
	        }

	        return result.toString().trim();
	    }

	}


