package visitor;

import java.util.ArrayList;
import java.util.List;

// NORMAL USER: Usuarios no artistas.
public class User implements Account {
    private String userName;
    public List<Account> followers;
    private List<Playlist> playlists;

    public User(String userName) {
        this.userName = userName;
        this.followers = new ArrayList<Account>();
        this.playlists = new ArrayList<Playlist>();
    }

    // Método del visitante, le pasamos por referència la instància actual, para que pueda añadir operaciones.
    @Override public String accept(AccountVisitor v) {
        return v.visit(this);
    }

    @Override public String getAccountName() {
        return this.userName;
    }

    protected List<Account> getListFollowers() {
        return this.followers;
    }
}
