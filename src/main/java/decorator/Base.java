package decorator;

// SKIN BASE: Skin basica que viene con el personaje por defecto.
public class Base implements Skin {
    private String nameSkin = "Base skin";
    private Skin nextLevelSkin = new LevelUpSkin(this);

    @Override public String getNameSkin() {
        return this.nameSkin;
    }

    @Override public Skin levelUpSkin() {
        return this.nextLevelSkin.levelUpSkin();
    }
}
