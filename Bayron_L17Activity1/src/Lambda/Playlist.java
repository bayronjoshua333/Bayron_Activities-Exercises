package Lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    private LinkedList<Song> playlist;
    private int currentSongIndex;

    public Playlist() {
        playlist = new LinkedList<>();
        currentSongIndex = -1;
    }

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        playlist.add(newSong);
        System.out.println("Song added: " + title);
    }

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

    public void displayCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < playlist.size()) {
            System.out.println("Current song: " + playlist.get(currentSongIndex).getDetails());
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public void displayNextSong() {
        if (currentSongIndex + 1 < playlist.size()) {
            currentSongIndex++;
            System.out.println("Next song: " + playlist.get(currentSongIndex).getDetails());
        } else {
            System.out.println("End of the playlist.");
        }
    }

    public void searchSong(String artistName) {
        List<Song> songsByArtist = playlist.stream()
            .filter(song -> song.getArtist().equalsIgnoreCase(artistName))
            .collect(Collectors.toList());

        if (songsByArtist.isEmpty()) {
            System.out.println("No songs found for artist: " + artistName);
        } else {
            System.out.println("Songs by " + artistName + ":");
            songsByArtist.forEach(song -> System.out.println(song.getDetails()));
        }
    }
}
