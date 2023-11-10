package com.headfirst.genetics;

/*
 * The SongV2 class implements the Comparable interface. The Comparable interface has one method
 * called compareTo. The compareTo method takes an object as an argument and returns an int. The
 * compareTo method is used by the Collections.sort method to sort the List of SongV2 objects.
 */
public class SongV2 implements Comparable<SongV2> {
    private String _title;
    private String _artist;
    private int _bpm;

    SongV2(String title, String artist, int bpm) {
        _title = title;
        _artist = artist;
        _bpm = bpm;
    }

    public String getTitle() {
        return _title;
    }

    public String getArtist() {
        return _artist;

    }

    public int getBpm() {
        return _bpm;
    }

    // This method is required by the Comparable interface.
    @Override
    public int compareTo(SongV2 s) {
        return _title.compareTo(s.getTitle());
    }

    @Override
    public String toString() {
        return " " + _title + " " + _artist + " " + _bpm;
    }
}
