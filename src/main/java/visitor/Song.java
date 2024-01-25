package visitor;

import java.time.LocalDate;
import java.util.List;

public class Song {
    private String title;
    private String description;
    private LocalDate datePublication;
    private List<Artist> artists;
    private int duration;

    public Song(String title, String description, List<Artist> artists, int duration) {
        this.title = title;
        this.description = description;
        this.datePublication = LocalDate.now();
        this.artists = artists;
        this.duration = duration;
    }
}
