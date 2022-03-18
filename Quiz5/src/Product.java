/*Name:Bijay wagle
 * Date:3/11/2022
 * Blueprint of e-commerce attribute
 */

/*
1) Product class will become an abstract class
2) Product will now have only 3 attributes – name, price and quantity. These attributes 
are inherited by all of the subclasses. Select the access modifier accordingly. Create 
public getters and setters for these 3 attributes. Remove all other attributes from 
product class. They’ll go into category specific sub classes. 
3) Product will have only one constructor that will set all 3 attributes.
4) Remove toString for Product class. You will be creating a toString() for each of the 
subclass that inherits from Product.
5) buy() method will still be Product’s instance method. Leave it as is.
6) Product class will have an abstract method called getDetails() that will not take 
any parameters and not return anything.*/
public abstract class Product {
	protected String name;
	protected double price;
	// private String category;
	protected int quantity;
	// private char size;
	// private String author;
	// private String color;

	// constructor with following attributes
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// instance method that checks the condition and return true or false
	public boolean buy() {
		// if condition to check
		if (this.quantity > 0) {
			this.quantity = this.quantity - 1;
			return true;
		} else {
			return false;
		}

	}
//abstract method
	public abstract void getDetails();

}
