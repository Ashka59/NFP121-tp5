package question1;


import java.util.ArrayList;
import java.util.List;

public class SongGroup extends SongComponent {

    public List<SongComponent> songComponents = new ArrayList<SongComponent>();

    public SongGroup(String industrial, String s) {
        super();
    }

    @Override
    public void add(SongComponent newSongComponent) {
        super.add(newSongComponent);
        songComponents.add(newSongComponent);
    }
}
