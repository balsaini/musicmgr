package com.chyld;

import java.util.*;

/**
 * Created by chyld on 7/27/16.
 */
public class Album implements Playable {
    private String name;
    private String genre;
    private String art;
    private ArrayList<Song> songs;

    public void addSong(Song s){
        songs.add(s);
    }

    public int length(){
        return songs.stream().map(s -> s.getDuration()).reduce(0, (sum, val) -> sum + val);
    }

    public void deleteSong(String name){
        Iterator<Song> iterator = songs.iterator();
        while(iterator.hasNext())
        {
            Song s = iterator.next();
            if (s.getName() == name)
            {
                iterator.remove();
                break;
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getArt() {
        return art;
    }

    public Album(String name, String genre, String art) {
        this.name = name;
        this.genre = genre;
        this.art = art;
        this.songs = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("album is playing");
    }
}
