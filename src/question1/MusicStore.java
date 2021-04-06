package question1;

import java.util.List;

public class MusicStore {

    public SongComponent songList = new SongComponent() {};
    public SongComponent getSongList() { return songList; }
    public void setSongList(SongComponent songList) { this.songList = songList; }

    public MusicStore(SongComponent everySong) {
        setSongList(everySong);
    }
}
