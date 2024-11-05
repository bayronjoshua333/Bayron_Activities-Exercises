package Spotify;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<Song> playlist;
    private int currentSongIndex;

    // Constructor
    public Playlist() {
        playlist = new LinkedList<>();
        currentSongIndex = -1;
    }

    // Method to add a song
    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        playlist.add(newSong);
        System.out.println("Song added: " + title);
    }

    // Method to display the playlist
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i).getDetails());
            }
        }
    }

    // Method to remove a song by title
    public void removeSong(String title) {
        boolean removed = false;
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getDetails().contains(title)) {
                playlist.remove(i);
                removed = true;
                System.out.println("Song removed: " + title);
                break;
            }
        }
        if (!removed) {
            System.out.println("Song not found.");
        }
    }

    // Method to display the current song
    public void displayCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < playlist.size()) {
            System.out.println("Current song: " + playlist.get(currentSongIndex).getDetails());
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    // Method to display the next song
    public void displayNextSong() {
        if (currentSongIndex + 1 < playlist.size()) {
            currentSongIndex++;
            System.out.println("Next song: " + playlist.get(currentSongIndex).getDetails());
        } else {
            System.out.println("End of the playlist.");
        }
    }
}
