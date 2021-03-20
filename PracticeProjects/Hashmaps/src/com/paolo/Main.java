package com.paolo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Main main;
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> artistSongs = new HashMap<>();
        ArrayList<String> songList = new ArrayList<>();
        artistSongs.put("The National", songList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter artist to check: \n" );
        String artistInput = scan.nextLine();
        if (artistSongs.containsKey(artistInput)){
            songList = artistSongs.get(artistInput);
            System.out.println("Enter songs to check under this artist: \n");
            String newSong = scan.nextLine();
            if (songList.contains(newSong)){
                System.out.println("Entered song is already in the list.");
            } else {
                System.out.println("Song is not yet on the list. Adding song " + newSong);
                songList.add(newSong);
                System.out.println("Listed song under artist: " + artistInput);
                System.out.println(songList);
            }
        } else {
            System.out.println("Artist is not yet listed.");
            System.out.println("Adding artist: " + artistInput + " on the list.");
            artistSongs.put(artistInput, null);
        }
    }
}
