package com.headfirst.genetics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox {
    public void go() {
        /*
        * The original code used a List of Strings. We can change the code to use a
        * List of
        * SongV2 objects instead. The code that calls this method doesn't need to
        * change.
        */
        // List<String> songs = MockSongs.getSongList();
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println("Un ordered list of songs:");
        System.out.println(songList);

        System.out.println("\nOrdered list of songs:");
        Collections.sort(songList);
        System.out.println(songList);
        /*
        * java.util.Collections has a sort method that takes a List as an argument. The
        * List
        * must contain objects that implement the Comparable interface. The SongV2
        * class has to
        * implement Comparable, so we can sort the List of SongV2 objects.
        * https://devdocs.io/openjdk~17/java.base/java/util/collections#sort(java.util.
        * List)
        * public static <T extends Comparable<? super T>> void sort(List<T> list)
        * public static <T> void sort(List<T> list, Comparator<? super T> c)
        */
        /*
        * Long way to create a sort that implements Comparator<SongV2>
        */
        // ArtistCompare artistCompare = new ArtistCompare(); // New class created for
        // each sort
        // songList.sort(artistCompare);
        
        /*
        * Shorter way to sort using an inner class
        */
        // songList.sort(new Comparator<SongV2>() {
            //     public int compare(SongV2 one, SongV2 two) {
                //         return one.getArtist().compareTo(two.getArtist());
                //     }
        // });
        
        /*
        * Welcome to Lambda
        */
        System.out.println("\nSort by title Lambda");
        songList.sort((one,two)-> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        System.out.println("\nSort  descending by title Lambda");
        songList.sort((one,two)-> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);

        System.out.println("\nSort by artist Lambda");
        songList.sort((one,two)-> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        System.out.println("\nSort descending by artist Lambda");
        songList.sort((one,two)-> two.getArtist().compareTo(one.getArtist()));
        System.out.println(songList);
        
        System.out.println("\nSort descending by artist Lambda");
        songList.sort((one,two)-> two.getArtist().compareTo(one.getArtist()));
        System.out.println(songList);

        System.out.println("\nSort descending by BPM Lambda");
        songList.sort((one,two)-> two.getBpm() - one.getBpm());
        System.out.println(songList);
        
        System.out.println("");
        
    }
}
