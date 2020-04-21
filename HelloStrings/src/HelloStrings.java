import java.util.Scanner;

public class HelloStrings {

	public static void main(String[] args) {

		//Sequence of characters
		String fullText = "Eu adoro programar em Java!";
		System.out.println(fullText + "is a " + fullText.getClass());
		
		//Some methods
		System.out.println(fullText.length());
		System.out.println(fullText.substring(3, 9));
		System.out.println(fullText.contains("adoro"));
		System.out.println(fullText.contains("adoros"));
		System.out.println(fullText.toUpperCase());
		System.out.println(fullText.toLowerCase());
		
		//We have a "problem" here!
		fullText.concat("Muito mesmo!");
		System.out.println(fullText);
		
		String newFullText = fullText.concat(" Muito mesmo!");
		System.out.println(newFullText);
		
		
		String firstName = "Winglerson";
		String anotherFirstName = "winglerson";
		
		System.out.println(firstName.equals(anotherFirstName));
		System.out.println(firstName.equalsIgnoreCase(anotherFirstName));

		//Both are valid declarations		
		int someOddsNumbers[] = {1, 3, 5, 7};
		int[] moreOddsNumbers = {9, 11, 13, 15};
		
		
		//Iterate over arrays
		
		//for loop
		for (int i = 0 ; i < someOddsNumbers.length ; i ++) {
			System.out.print(someOddsNumbers[i] + " ");
		}
		
		System.out.println();
		//for each loop
		for (int oddNumber : moreOddsNumbers) {
			System.out.print(oddNumber + " ");
		}

	}
	

}