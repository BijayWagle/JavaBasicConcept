
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// 1.Write a program to ask the user to enter a year and tell them if it's a
		// leap year or not
		// 2.A leap year is divisible by 4 but not divisible by 100, OR it is divisible
		// by 400
		// HINT: % operator can be used to check if a number is divisible by another
		// number. If the number is divisible % will be equal to 0
		// This question involves logical operators and conditional statements
		Scanner userInput = new Scanner(System.in);// inserting scanner to allow user interaction
		int year; //
		System.out.println("Enter a year: ");
		year = userInput.nextInt(); // creating scanner object that allows user to carry on the program once he or
									// she has inserted a year which we declared as an integer
		if (year % 4 == 0 || year % 400 == 0) { // condition statement checking point 2 above

			System.out.println(year + " is a leap year ");
		} else {
			System.out.println(year + " is not a leap year ");
		}
		userInput.close();
	}

}
