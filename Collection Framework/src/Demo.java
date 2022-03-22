import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	static ArrayList<Book> books = new ArrayList<Book>();
	private static String done = "done";

	public static void main(String[] args) {
		// scanner input
		Scanner input = new Scanner(System.in);

		// loop condition to check
		while (true) {
			System.out.println("Enter the title of the book (or 'done' to exit):");
			String title = input.nextLine();
			// checks the condition
			if (title.equalsIgnoreCase(done)) {
				System.out.println("Thank You");
				break;
			}
			// asking user to input
			System.out.println("Author name");
			String author = input.nextLine();
			// user input
			System.out.println("Book isbn");
			long isbn = input.nextLong();
			// user input
			System.out.println("Rental price");
			double rent = input.nextDouble();
			// user input
			System.out.println("Is the book borrowed true/false");
			boolean condition = input.nextBoolean();
			input.nextLine();
			// array list to hold the value inserted by user
			books.add(new Book(title, author, isbn, rent, condition));
			// break;

		}
		input.close();
		System.out.println("....................");
		// for each loop to print user input
		for (Book b : books) {
			System.out.println("The book you entered is:" + b);

		}
		
		for (Book a:books) {
			System.out.println("Title:"+a.getTitle()+"ISBN:"+a.getIsbn());
		}
	}
}