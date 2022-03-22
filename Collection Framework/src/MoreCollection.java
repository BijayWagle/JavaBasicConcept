//import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
public class MoreCollection {
public static void main(String[] args) {
	//create an array list
	ArrayList<String>tvshows=new ArrayList<String>();

	tvshows.add("Office");
	tvshows.add("Park and recreation");
	tvshows.add("Friends");
	tvshows.add("Lost In the Space");
	tvshows.add("Sam and Cat");
	tvshows.add("Doctor");
	tvshows.add("Big Bang Theory");
	tvshows.add("Friends");
	
	System.out.println(tvshows);
	
	//create a hashset
	HashSet<String>uniqueTvShows=new HashSet<String>(tvshows);
	
	//prints the hashset but ignore the dublicate
	System.out.println(uniqueTvShows);
	
	// creating hashmap
	HashMap<String,String>capitalCities=new HashMap<String,String>();
	//inserting key and values in hash map
	capitalCities.put("North carolina","Raleigh");
	capitalCities.put("Kathmandu","ktm");
	
	System.out.println(capitalCities);
	//it will replace the value in key kathmandu
	capitalCities.put("Kathmandu","kathmandu");
	System.out.println(capitalCities);
	
	//printing the value of key
	System.out.println(capitalCities.get("North carolina"));
	
	//removing the key
	capitalCities.remove("Kathmandu");
	System.out.println(capitalCities);
	
	//create hash map
	HashMap<String, Integer>weather=new HashMap<String,Integer>();
	weather.put("wind", 55);
	weather.put("minTempreture", 30);
	weather.put("maxTemperature", 85);
	weather.put("airPressure", 15);

//iteration using for each loop
	for(HashMap.Entry<String, Integer> a:weather.entrySet()){
		System.out.println("using for loop"+a.getKey()+"="+ a.getValue());
	}
	
	//iteration using for each
	weather.forEach((key,value)
		->System.out.println(key+"="+value));
	
	//using entry set iterator
	Iterator<Entry<String,Integer>> b=weather.entrySet().iterator();
		while(b.hasNext()) {
		HashMap.Entry<String, Integer> c=(Map.Entry<String,Integer>)b.next();
		
		//display hash map
        System.out.println("iteration"+c.getKey()+"="+c.getValue());		
	}
	
 
   //iteration using lambda expression
	weather.forEach((key,value)
			->System.out.println(key+"="+value));
	
}
}
