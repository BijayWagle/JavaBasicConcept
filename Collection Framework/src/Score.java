import java.util.ArrayList;

public class Score {
public static void main(String []args) {
	// array list of an integer
	ArrayList<Integer> scores=new ArrayList<Integer>();
	ArrayList<String> names=new ArrayList<String>();
	//prints number of elements in array list in array we use (size.length)
	System.out.println(scores.size());
	
	//adding values in arraylist
	scores.add(2);// autoboxing converting primitive to object
	
	scores.add(5);
	scores.add(2);
	scores.add(3);
	scores.add(0,56);//insert element 56 at index 0 and push the element at 0 to 1 index
	System.out.println(scores.size());
	
	int[] scoresArray=new int[5];
	System.out.println(scoresArray.length);//this will print five as it is fixed 
	
	//scores.remove(0);//remove elements from that index
	//scores.(object);//remove object from elements
	
	//(TypeThatArrayListHolds variableName:arrayListName)
	//for each loop (loop through each elements in array and arraylist)
	for(Integer a: scores) {//runs through 0 to length-1(we don't have to specify it though)
		System.out.println(a);
	}
	for(int i=0;i<=scores.size()-1;i++) {
		System.out.println(scores.get(i));
	}
	System.out.println(scores.isEmpty());//false (check size.score==0)

	names.add("Bijay");
	names.add("Henry");
	names.add("Harry");
	
	System.out.println(names.size());//3
	System.out.println(names.isEmpty());//false
	names.set(1, "shane");
	names.remove("henry");
	
	System.out.println(names.size());
	System.out.println(names.get(2));
	
}
}


