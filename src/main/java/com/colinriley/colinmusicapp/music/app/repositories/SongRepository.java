package com.colinriley.colinmusicapp.music.app.repositories;

import com.colinriley.colinmusicapp.music.app.models.Song;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by criley on 2/18/18.
 */
public interface SongRepository extends CrudRepository<Song, String> {
  Song findByArtist(String artist);

  Song findByTitleIgnoreCase(String title);

  Song findByTitleIgnoreCaseContaining(String title);

  List<Song> findAllByArtist(String artist);
}
