import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.HashMap;

/*Write a program that counts the occurances of each word in a text file (the_prince_quotes.txt in the
 *  same repository). Make it case-insensitive by coverting each word to lower case before counting
 *  Involves text file reading, using String's .split() method, using HashMap to store the word
 *   to count mapping

 */

public class Solution8 {
	public static void main(String[] args) {
		BufferedReader read = null;

		try {
			read = new BufferedReader(new FileReader("C:\\Users\\BijayaWagle\\OneDrive - "
					+ "Xpanxion\\Desktop\\java training\\Read\\the_prince_quotes.txt"));

			HashMap<String, Integer> count = new HashMap<String, Integer>();
			// ArrayList<String>file=new ArrayList<String>();
			String lineReader;
			while ((lineReader = read.readLine()) != null) {
				lineReader.toLowerCase();
				System.out.println(lineReader);

				if (lineReader != null) {
					String[] file = lineReader.split(" ");
					// count.put(lineReader, null);
					for (String word : file) {
						// count.put(lineReader, null);
						Integer num = count.get(word);

						if (num == null) {
							count.put(word, 1);
						} else {
							count.put(word, num + 1);
						}

					}

				}

			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("No problem");
		} finally {
			if (read != null) {
				// read.close();
			}
		}
	}
}
