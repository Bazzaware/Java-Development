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
        return _title;
        // return " " + _title + " " + _artist + " " + _bpm;
    }

    /* IMPORTANT */
    /*
     * *************************************************************************
     * If you override the equals method, you must override the hashCode method.
     * *************************************************************************
     */

    /*
     * The HashSet (or anyone else calling this method) sends it another song. The
     * method checks to see if the title of the song it was sent is the same as the
     * title of the song it was called on. If the titles are the same, the method
     * returns true. If the titles are different, the method returns false. 
     */
    @Override
    public boolean equals(Object aSong){
        SongV2 other = (SongV2) aSong;
        return _title.equals(other.getTitle());
    }

    /*
     * This overrides the default hashCode method. The default hashCode method
     * returns a unique number for each object. We want the hashCode method to
     * return the same number for two objects that are equal. So we override the
     * default hashCode method to return the hashCode of the title.
     */
    @Override
    public int hashCode(){
        return _title.hashCode();
    }
}
