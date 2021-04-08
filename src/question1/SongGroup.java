package question1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {
    private String genre;
    private String description;
    public List songComponents = new ArrayList();

    public SongGroup(String genre, String description) {
        this.genre=genre;
        this.description=description;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        this.songComponents.add(newSongComponent);
        super.add(newSongComponent);
    }
    @Override
    public void remove(SongComponent newSongComponent) {
        this.songComponents.remove(newSongComponent);
        super.remove(newSongComponent);
    }
    @Override
    public SongComponent getComponent(int componentIndex) {
        return (SongComponent) this.songComponents.get(componentIndex);
    }
    @Override
    public void displaySongInfo() {
        System.out.println(this.genre+" "+this.description);
        Iterator songIterator = this.songComponents.iterator();
        while (songIterator.hasNext()){
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
