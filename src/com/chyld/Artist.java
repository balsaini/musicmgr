package com.chyld;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by chyld on 7/27/16.
 */
public class Artist {
    private String name;
    private ArrayList<Album> albums;

    public void addAlbum(Album a){
        albums.add(a);
    }

    public void deleteAlbum(String name){
        Iterator<Album> iterator = albums.iterator();
        while(iterator.hasNext())
        {
            Album a = iterator.next();
            if (a.getName() == name)
            {
                iterator.remove();
                break;
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Artist(String name) {
        this.name = name;
        albums = new ArrayList<>();
    }
}
