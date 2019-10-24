package playlist;
import java.util.ArrayList;

public class playlist {
	
	 public static void main(String[] args) {
		    ArrayList<String> playlist = new ArrayList<String>();
		    playlist.add("black keys");
		    playlist.add("CCWR");
		    playlist.add("Altj");
		    playlist.add("avett brothers");
		    playlist.add("Artic Monkeys");
		    playlist.remove(4);
		    int indexA = playlist.indexOf("Altj");
		    int indexB = playlist.indexOf("CCWR");
		    
		    playlist.set(indexA, "CCWR");
		    playlist.set(indexB, "Altj");
		    System.out.println(playlist);
		    
		  }

}
