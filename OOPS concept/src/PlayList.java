import java.io.Serializable;
import java.util.ArrayList;

public class PlayList implements Serializable  {
	
	protected String name;
	ArrayList<Song>playList=new ArrayList<Song>();
	//private String a;
		

	public void getList() {
		for (Song a: playList) {
		System.out.println(a.getTitle());
		}
		}
	
	boolean findSong(String song) {
		for(Song b:playList) {
		if (b.getTitle().equals(song)) {
			return true;
		}
	
	}
		return false;
	}
}
