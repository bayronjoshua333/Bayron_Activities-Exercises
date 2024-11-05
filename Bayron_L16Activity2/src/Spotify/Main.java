package Spotify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSpotify Playlist");
            System.out.println("1. Add a Song");
            System.out.println("2. Display Playlist");
            System.out.println("3. Remove a Song");
            System.out.println("4. Play Current Song");
            System.out.println("5. Play Next Song");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    myPlaylist.addSong(title, artist);
                    break;

                case 2:
                    myPlaylist.displayPlaylist();
                    break;

                case 3:
                    System.out.print("Enter song title to remove: ");
                    String songToRemove = scanner.nextLine();
                    myPlaylist.removeSong(songToRemove);
                    break;

                case 4:
                    myPlaylist.displayCurrentSong();
                    break;

                case 5:
                    myPlaylist.displayNextSong();
                    break;

                case 6:
                    System.out.println("Exiting Spotify Playlist.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
