
/*Write a program to ask the user for states they have visited in the US. 
 * Ignore case by converting their input to lower case. Ignore duplicate inputs.
 *  Order of input doesn't matter. The program runs forever until the user types "done".
 *   When the user types "done", display the unique list of states back to the user.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Solution6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String user1 = "done";
		ArrayList<String> user = new ArrayList<String>();
		String state;
		System.out.println("Enter the states you have visited one at a time:");
		do {
			System.out.println("State name please type done to exit:");
			state = input.nextLine();
			user.add(state);

			if (state.equalsIgnoreCase(user1)) {
				System.out.println("Thank you and good day");
				break;
			}

		} while (state != user1);
		input.close();

		HashSet<String> stateName = new HashSet<String>(user);
		System.out.println(stateName);

	}
}