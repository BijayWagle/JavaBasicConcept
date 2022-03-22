import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Practice {
	public static void main(String[] args) {
ArrayList<String>books=new ArrayList<String>();

books.add("Hamlet");
books.add("Sharp Object");
books.add("The whistler");
books.add("Saya");
books.add("Eleven Minutes");
books.add("Hamlet");

System.out.println(books);


//returns the unique value from array list as books is passed as parameter
HashSet<String>num=new HashSet<String>(books);
System.out.println(num);

//creating hash map it holds the value and store the value as a bucket storage
HashMap<Integer,String>info=new HashMap<Integer,String>();
info.put(1,"Sam");
info.put(2, "Henry");
info.put(3, "jon");
info.put(4, "Bijay");



	}
}
