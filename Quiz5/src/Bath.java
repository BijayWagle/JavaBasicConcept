/*No private attributes. Constructor will just take name, price and quantity and call 
the parent’s constructor.
2) getDetails() will print “We sell organic bath products!
 */
public class Bath extends Product {

	//constructor extended from parent class
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
@Override
	public void getDetails() {
		System.out.println("We sell organic bath products");
	}
}
