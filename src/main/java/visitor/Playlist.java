package visitor;

import java.util.ArrayList;
import java.util.List;

/* Clases necesarias para el funcionamiento: */
public class Playlist {
    private String playlistName;
    private List<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songs = new ArrayList<Song>();
    }

    public void addSongToPlaylist(Song songToAdd) {
        this.songs.add(songToAdd);
    }
}
