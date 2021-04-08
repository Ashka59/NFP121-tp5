package question1;

import java.util.List;

public class MusicStore {
    public SongComponent songList;
    public void getSongList() { songList.displaySongInfo(); }
    public MusicStore(SongComponent songList) { this.songList = songList; }
}
