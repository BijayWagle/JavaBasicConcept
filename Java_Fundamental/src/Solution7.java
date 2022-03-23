
/*Write a program that asks user for 2 integers and print the divison of the 2 integers. 
 * Handle ArithmeticException and print its stacktrace. Handle all other RuntimeException 
 * and print its message. 
 * Irrespective of whether an exception ocurred or not, print a "Thank you" message.
 */
import java.util.Scanner;

public class Solution7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			int num = sc.nextInt();

			System.out.println("Enter the second number:");
			int num1 = sc.nextInt();

			System.out.println(Math.floorDiv(num, num1));

		}

		catch (ArithmeticException e) {
			e.getStackTrace();
		}

		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Thank you");
			sc.close();
		}
	}

}
