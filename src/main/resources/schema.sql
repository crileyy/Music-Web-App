CREATE TABLE SONGS(
  SONG_ID INT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(100) NOT NULL,
  ARTIST VARCHAR(100) NOT NULL,
  YOUTUBE_ID VARCHAR(100) NOT NULL,
  GENRE VARCHAR(50) NULL
);

CREATE TABLE PLAYLISTS(
  PLAYLIST_ID INT AUTO_INCREMENT PRIMARY KEY,
  TITLE VARCHAR(100) NOT NULL
);

CREATE TABLE PLAYLIST_SONGS(
  ID INT AUTO_INCREMENT PRIMARY KEY,
  PLAYLIST_ID INT NOT NULL,
  SONG_ID INT NOT NULL,
  FOREIGN KEY (PLAYLIST_ID) REFERENCES PLAYLISTS (PLAYLIST_ID),
  FOREIGN KEY (SONG_ID) REFERENCES SONGS (SONG_ID)
);