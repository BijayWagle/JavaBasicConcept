import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
public class IntArrayList {
public static void main (String[] args) {
	ArrayList<Integer>nums=new ArrayList<Integer>();

	nums.add(13);
	nums.add(5);
	nums.add(8);
	nums.add(9);
	nums.add(11);
	//Integer a;
	System.out.println("Number in array list:"+nums);
// remove all even number
	ListIterator <Integer>iterate=nums.listIterator();
	while(iterate.hasNext()) {
	//a=iterate.next();	
				if(iterate.next()%2==0) {
				iterate.remove();
					}
				}
	
	System.out.println("arraylist after removing even number:"+nums);
	//sort the arraylist
		Collections.sort(nums);
		System.out.println("sorted:"+nums);


}
}
