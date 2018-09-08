package com.colinriley.colinmusicapp.music.app.rest.resources;

import com.colinriley.colinmusicapp.music.app.models.Song;
import com.colinriley.colinmusicapp.music.app.repositories.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by criley on 2/18/18.
 */
@RestController
@RequestMapping("/api")
public class MusicAppAPIResource {

  @Autowired
  private SongRepository repository;

  /**
   * Retrieve all the stored songs.
   *
   * @return A ResponseEntity with a List of all Songs
   */
  @RequestMapping(path = "songs", method = RequestMethod.GET)
  public ResponseEntity<?> findAllSongs() {
    List<Song> songs = new ArrayList<>();
    for (Song song : this.repository.findAll()) {
      songs.add(song);
    }
    return new ResponseEntity<>(songs, HttpStatus.OK);
  }

  @RequestMapping(path = "song", method = RequestMethod.GET)
  public ResponseEntity<Song> findSongByTitle(@RequestParam("title") String title) {
    Song song = this.repository.findByTitleIgnoreCaseContaining(title);
    return new ResponseEntity<>(song, HttpStatus.OK);
  }

  @RequestMapping(path = "song/{songId}", method = RequestMethod.GET)
  public ResponseEntity<Song> findSongBySongId(@PathVariable("songId") Integer songId) {
    Song song = this.repository.findBySongId(songId);
    return new ResponseEntity<>(song, HttpStatus.OK);
  }

  @RequestMapping(path = "songsByArtist/{artist}", method = RequestMethod.GET)
  public ResponseEntity<List<Song>> findSongsByArtist(@PathVariable("artist") String artist) {
    List<Song> songs = this.repository.findAllByArtist(artist);
    return new ResponseEntity<>(songs, HttpStatus.OK);
  }

  //Create or update a song
  @RequestMapping(path = "song", method = RequestMethod.POST)
  public ResponseEntity<Song> addSong(@RequestBody Song song) {
    Song response = this.repository.save(song);
    return new ResponseEntity<>(response,
            response != null ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @RequestMapping(path = "link", method = RequestMethod.GET)
  public ResponseEntity<String> linkFromTitle(@RequestParam("title") String title) {
    Song song = this.repository.findByTitleIgnoreCaseContaining(title);
    return new ResponseEntity<>(song.getYoutubeId(), HttpStatus.OK);
  }

  /**
   * Layout: Itunes layout, select a song and it will play the youtube music not show video though, add song title artist genre youtube link
   API: get a song and it's info from title, from artist, get all songs, add song, get youtube link from song
   Use YouTube APIs to play video without sound - IFrame API 0x0 - use javascript API to control playback
   */

//  Layout: Itunes layout, select a song and it will play the youtube music not show video though, add song title artist genre youtube link
//  API: get a song and it's info from title, songs from artist, get all songs, add song, get youtube link from song
//  Use YouTube APIs to play video without sound - IFrame API 0x0 - use javascript API to control playback
  // https://developers.google.com/youtube/youtube_player_demo
  //FUTURE create, update for playlists - just be able to add a song title, then pick from the youtube vids that come up

  /**
   * CREATE TABLE SONG(
   title VARCHAR(100) NOT NULL,
   artist VARCHAR (100) NOT NULL
   link VARCHAR (100) NOT NULL
   genre VARCHAR
   );


   Tables: songs, genres, playlists, playlist_songs, artists
   */

}
