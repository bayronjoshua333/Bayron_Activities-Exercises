package Spotify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        while(true) {
        	System.out.println("\n1. Add a Song\n2. Display Playlist \n3. Remove a Song \n4. Play a Song \n5. Exit");
        	System.out.print("Enter your choice: ");
        	int choice = scanner.nextInt();
        	scanner.nextLine();
        	
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
        			myPlaylist.displayNextSong();
        			break;
        		case 5:
        			System.out.println("Exiting Spotify Playlist.");
        			System.exit(choice);
        		default:
        			System.out.println("Invalid Choice. Please try again.");
        	}
        }
    }
}
