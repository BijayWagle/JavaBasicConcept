	/*the program takes the user input and goes through the site and prints the user purchase 
	 * was successful or not and displays the total amount user spent on the product purchase
	 */
	//Scanner imported
	import java.util.Scanner;
	public class Shopusingbreak {
		// static variable
		static double totalAmount = 0;

	//created object and array 
		static Product[] inventory = {
				new Product("Business Ritual Women’s Long Sleeve Top", 65.39, "Apparel", 4, 'L', " Blue"),
				new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
				new Product("Men’s Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
				new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
				new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman") };

	//static method to display menu
		static void displayMenu() {
			System.out.println(
					"Enter the product index (0 to 4) you want to buy. To exit the shopping cart enter any number other than 0 to 4");
			for (int i = 0; i <= inventory.length - 1; i++) {
				System.out.println((i+0)+"."+ (inventory[i].getName()));
			}
			}
			
	//main method starts here
		public static void main(String[] args) {
			// variable
			int userInput;
			// scanner
			Scanner sc = new Scanner(System.in);

			// loop starts from here
			//forever loop
			while (true){
				// display menu to take input from user
				displayMenu();
				userInput = sc.nextInt();
				sc.nextLine();
				
				// checks the condition and run the loop
						if (userInput >= 0 && userInput <= 4) {
						if (inventory[userInput].buy()) {
						System.out.println("Your purchase was sucessful");
						// update the total amount if the purchase is successful
						totalAmount = totalAmount + (inventory[userInput].getPrice());
						}
					else {
						System.out.println("Sorry this product is out of stock");
					}
				}
						else {
							break;
						}
					
	//condition to check to run the loop comes out if the user input is false				
			} //while (userInput >= 0 && userInput <= 4);

			System.out.println("Thank you for shopping with us! The total amount is:" + totalAmount);
			// scanner closed
			sc.close();
		}
	}

