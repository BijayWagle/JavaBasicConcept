import java.util.ArrayList;
import java.util.ListIterator;

public class TvShow {
	public static void main(String[] args) {
		ArrayList<String> tvShows = new ArrayList<String>();

		tvShows.add("Office");
		tvShows.add("Park and recreation");
		tvShows.add("Friends");
		tvShows.add("Lost In the Space");
		tvShows.add("Sam and Cat");
		tvShows.add("Doctor");
		tvShows.add("Big Bang Theory");
		tvShows.add("One");

//iteration through for loop
		for (int i = 0; i < tvShows.size() - 1; i++) {
			System.out.println(tvShows.get(i));
		}
//iteration through for each loop
		for (String a : tvShows) {
			System.out.println(a);
		}
//iteration through listI=iterator
		ListIterator iterate = tvShows.listIterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
//iteration through lambda
		tvShows.forEach(tvShow -> System.out.println("lambda:" + tvShow));

//number of element in tv show
		System.out.println(tvShows.size());

//check what it prints
		System.out.println(tvShows);

//checking the show is my tvshow list or not
		System.out.println(tvShows.contains("Friends"));

//print first element in array list
		System.out.println(" my first favorite tv show is:" + tvShows.get(0));

//print last element in array list
		System.out.println("last tv show i watched:" + tvShows.get(tvShows.size() - 1));

//repalce the tv show
		System.out.println("replaced:" + tvShows.set(4, "Loki"));

//changing the array list element and moving other to right

		tvShows.add(0, "Young Sheldon");
		System.out.println(tvShows);

//check if tvshow is emplty
		System.out.println("Check:" + tvShows.isEmpty());

//clearing the array list
		System.out.println("clear it now:");
		tvShows.clear();
		System.out.println("number of element in array" + tvShows);
	}

}
