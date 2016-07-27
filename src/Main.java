import com.chyld.*;

/**
 * Created by chyld on 7/27/16.
 */
public class Main {
    public static void main(String[] args){
        Song s1 = new Song("song 1", "blah blah blah", (short) 3);
        Song s2 = new Song("song 2", "blah blah blah", (short) 4);
        Song s3 = new Song("song 3", "blah blah blah", (short) 5);
        Album a1 = new Album("album 1", "rock", "rock.jpg");
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        a1.deleteSong("song 2");
        Artist ar = new Artist("artist 1");
        ar.addAlbum(a1);
    }
}
