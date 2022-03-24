//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.ArrayList;

/*Create a Main class with the main method

Create an object of PlayList, give it a name and an empty arraylist to begin with
Create some Song objects and add it to object's playList
Print all the songs in the playlist
Find a song in the playlist
Write the playlist object to an object file.
 */

public class Main {
public static void main(String[] args) {
	
	PlayList play=new PlayList();
	
	play.playList.add(new Song ("Shake it off",4.10));
	play.playList.add(new Song ("let her go",3.35));
	play.playList.add(new Song("roar",4.5));
	
	System.out.println("Song you have on playlist:");
	play.getList();
	
	System.out.println("checking the song existence on playlist:"+
	play.findSong("Shake it off"));
	
	try {
	File file=new File("C:\\Users\\BijayaWagle\\OneDrive - "
			+ "Xpanxion\\Desktop\\java training\\Write\\playlist.txt");
	//it writes the data in the file whether it is there or not by creating new one
	FileOutputStream fos=new FileOutputStream(file);
	//takes an object as the source for the file and write in byte code
	ObjectOutputStream oop=new ObjectOutputStream(fos);
	//write the object in file destination
	oop.writeObject(play);
	
	
	System.out.println("The task was sucessful:");
	
	
	fos.close();
	oop.close();
	
	}
	catch (IOException e) {
		System.out.println(e.getMessage());
	}
}
}
