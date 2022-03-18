
/*the program takes the user input and goes through the site and prints the user purchase 
 * was successful or not and displays the total amount user spent on the product purchase
 */

/*The array will give you an error now that Product is abstract. Modify the objects 
inside the array to call respective subclass’s constructor. 
2) Everything else remains the same*/

//Scanner imported
import java.util.Scanner;

public class Shop {
	// static variable
	static double totalAmount = 0;

	// creating array that stores the 5 product
	static Product inventory[] = new Product[5];

//static method to display menu
	static void displayMenu() {
		System.out.println("Enter the product index (0 to 4) you want to buy. "
				+ "To exit the shopping cart enter any number other than 0 to 4");
		for (int i = 0; i <= inventory.length - 1; i++) {
			System.out.println((i + 0) + "." + (inventory[i].getName()));
		}
	}

//main method starts here
	public static void main(String[] args) {

		// object created for the array
		inventory[0] = new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth", "Books", "789");
		inventory[1] = new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman");
		inventory[2] = new Apparel("Men’s Business Casual Shirt", 57.10, 2, 'M', "Teal");
		inventory[3] = new Apparel("Business Ritual Women’s Long Sleeve Top", 65.39, 4, 'L', " Blue");
		inventory[4] = new Bath("Organic Turmeric Soap", 11.25, 1);
		// variable
		int userInput;
		// scanner
		Scanner sc = new Scanner(System.in);

		// loop starts from here
		while (true) {
			// display menu to take input from user
			displayMenu();
			userInput = sc.nextInt();
			sc.nextLine();

			// checks the condition and run the loop
			// removed the if condition just to use exception and break
			// if (userInput >= 0 && userInput <= 4) {
			try {
				if (inventory[userInput].buy()) {
					System.out.println("Your purchase was sucessful");
					// update the total amount if the purchase is successful
					totalAmount = totalAmount + (inventory[userInput].getPrice());
					inventory[userInput].getDetails();
				} else {
					System.out.println("Sorry this product is out of stock");
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Input out of bound");
				break;
			}
			// removed the do while to use break statement
//condition to check to run the loop comes out if the user input is false				
		} // while (userInput >= 0 && userInput <= 4);

		System.out.println("Thank you for shopping with us! The total amount is:" + totalAmount);
		// scanner closed
		sc.close();
	}
}
