/*Write a program that declares and initializes a counter to 0. Run a forever while loop, 
 * increment counter by 1 with every iteration. break the loop when counter is 5.
 *  continue the loop without printing the number when counter is 3.
 *  Print the counter for all other values.
 */
public class Solution3 {
	public static void main(String[] args) {
		int counter = 0;

		while (counter >= 0) {
			counter++;
			System.out.println(counter);
			if (counter == 2) {
				counter++;
				continue;

			} else if (counter == 4) {
				counter++;
				break;
			}
		}
	}
}
