package com.colinriley.colinmusicapp.music.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by criley on 2/18/18.
 */
@Entity
@Table(name="SONGS")
public class Song {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  @Column(name = "SONG_ID")
  private Integer songId;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "ARTIST")
  private String artist;

  @Column(name = "YOUTUBE_ID")
  private String youtubeId;

  @Column(name = "GENRE")
  private String genre;

  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public Song() {

  }

  public Integer getSongId() {
    return songId;
  }

  public void setSongId(Integer songId) {
    this.songId = songId;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getYoutubeId() {
    return youtubeId;
  }

  public void setYoutubeId(String youtubeId) {
    this.youtubeId = youtubeId;
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
