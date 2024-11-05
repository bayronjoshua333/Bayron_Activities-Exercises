package Spotify;

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getDetails() {
        return title + " by " + artist;
    }
}
