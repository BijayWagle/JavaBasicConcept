/*Name:Bijay wagle
 * Date:3/7/2022
 * Blueprint of e-commerce attribute
 */
public class Product {
	// Private attributes
	private String name;
	private double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color;

	// constructor with following attributes
	public Product(String name, double price, String category, int quantity, char size, String color) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}

// constructor with following attributes
	public Product(String name, double price, String category, int quantity, String author) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.author = author;
	}

	// constructor with following attributes
	public Product(String name, double price, String category, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

//getters and setters for private attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
				+ ", size=" + size + ", author=" + author + ", color=" + color + "]";
	}

//instance method that checks the condition and return true or false 
	public boolean buy() {
		// if condition to check
		if (this.quantity > 0) {
			this.quantity = this.quantity - 1;
			return true;
		} else {
			return false;
		}
	}
}
