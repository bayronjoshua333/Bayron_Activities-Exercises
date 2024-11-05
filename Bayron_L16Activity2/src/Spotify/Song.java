package Spotify;

public class Song {
    private String title;
    private String artist;

    // Parameterized constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Method to get song details
    public String getDetails() {
        return "Title: " + title + ", Artist: " + artist;
    }
}
