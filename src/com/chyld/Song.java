package com.chyld;

/**
 * Created by chyld on 7/27/16.
 */
public class Song implements Playable {
    private String name;
    private String lyrics;
    private int duration;

    public Song(String name, String lyrics, int duration) {
        this.name = name;
        this.lyrics = lyrics;
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getLyrics() {
        return lyrics;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("song " + this.name + " is playing for " + this.duration + " seconds");
    }
}
