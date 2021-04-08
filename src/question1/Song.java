package question1;

public class Song extends SongComponent {
    private String songName;
    private String bandName;
    private int releaseYear;

    public Song(String title, String band, int year) {
        this.songName=title;
        this.bandName=band;
        this.releaseYear=year;
    }

    @Override
    public String getSongName() { return songName; }
    @Override
    public String getBandName() { return bandName; }
    @Override
    public int getReleaseYear() { return releaseYear; }
    @Override
    public void displaySongInfo() { System.out.println(getSongName()+" is a song of "+getBandName()+" released in "+getReleaseYear()); }
}
