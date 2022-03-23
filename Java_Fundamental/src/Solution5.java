/*Write a program to ask the user for a decimal number, and print the floor,
 *  ceil, round of that number
This question involves java.lang.Math class
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Solution5 {
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	try {
	System.out.println("Enter the decimal number i will give you floor and ceil for that:");
	double user=sc.nextDouble();
	System.out.println("Floor for the number is:"+Math.floor(user));
	System.out.println("Ceil for the number is:"+Math.ceil(user));
	}
	catch(InputMismatchException e ) {
		System.out.println("The input is wrong");
	}
	finally {
	
	sc.close();
}
}
}