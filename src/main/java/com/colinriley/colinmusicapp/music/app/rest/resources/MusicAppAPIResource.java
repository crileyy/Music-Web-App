package com.colinriley.colinmusicapp.music.app.rest.resources;

import com.colinriley.colinmusicapp.music.app.models.Song;
import com.colinriley.colinmusicapp.music.app.repositories.SongRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by criley on 2/18/18.
 */
@RestController
@RequestMapping("/v1")
public class MusicAppAPIResource {

  @Autowired
  private SongRepository repository;

  @RequestMapping(path = "songs", method = RequestMethod.GET)
  List<Song> findAllSongs() {
    List<Song> songs = new ArrayList<>();
    songs.add(this.repository.findByTitle("HELLO"));
    return songs;
  }
}
