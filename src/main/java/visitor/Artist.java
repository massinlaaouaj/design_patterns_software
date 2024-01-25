package visitor;

import java.util.ArrayList;
import java.util.List;

public class Artist implements Account {
    private String name;
    public List<Account> followers;
    private List<Playlist> playlists;

    public Artist(String artistName) {
        this.name = artistName;
        this.followers = new ArrayList<Account>();
        this.playlists = new ArrayList<Playlist>();
    }

    // Método del visitante, le pasamos por referència la instància actual, para que pueda añadir operaciones.
    @Override public String accept(AccountVisitor v) {
        return v.visit(this);
    }

    @Override public String getAccountName() {
        return this.name;
    }

    protected List<Account> getListFollowers() {
        return this.followers;
    }
}
