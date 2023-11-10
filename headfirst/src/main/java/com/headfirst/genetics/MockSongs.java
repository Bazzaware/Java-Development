package com.headfirst.genetics;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    // public static List<String> getSongList() {
    //     /*
    //      * An ArrayList IS-A List, so we can return an ArrayList with a diamond operator.
    //      * Which means we can return a List of Strings, but the actual object is an ArrayList.
    //      * The compiler will know that the object is an ArrayList, but the code that calls this
    //      * method will only know that it's a List.
    //      * 
    //      * The diamond operator is a shorthand for the generic type. It's a shorthand for
    //      * ArrayList<String> songs = new ArrayList<String>();
    //      */
    //     List<String> songs = new ArrayList<>(); // diamond operator. No type on the right side.
    //     songs.add("somersault");
    //     songs.add("cassidy");
    //     songs.add("$10");
    //     songs.add("havana");
    //     songs.add("Cassidy");
    //     songs.add("50 Ways");
    //     return songs;
    // }   
    public static List<SongV2> getSongsV2 (){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 90));
        songs.add(new SongV2("cassidy", "grateful dead", 100));
        songs.add(new SongV2("$10", "shakey graves", 120));
        songs.add(new SongV2("havana", "camila cabello", 110));
        songs.add(new SongV2("$10", "shakey graves", 120));
        songs.add(new SongV2("Cassidy", "grateful dead", 100));
        songs.add(new SongV2("50 Ways", "paul simon", 120));
        return songs;}
}