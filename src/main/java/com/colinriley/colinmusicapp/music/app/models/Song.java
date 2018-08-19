package com.colinriley.colinmusicapp.music.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by criley on 2/18/18.
 */
@Entity
@Table(name="song")
public class Song {

  @Id
  @Column(name = "title")
  private String title;

  @Column(name = "artist")
  private String artist;

  @Column(name = "youtube")
  private String youtube;

  @Column(name = "genre")
  private String genre;

  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public Song() {

  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getYoutube() {
    return youtube;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }
}
