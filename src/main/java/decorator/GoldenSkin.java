package decorator;

// DECORATOR1: Skin dorado.
public class GoldenSkin extends LevelUpSkin {
    private String nameSkin = "Golden skin";

    public GoldenSkin(Skin skinSelected) {
        super(skinSelected);
    }

    @Override public String getNameSkin() {
        return this.nameSkin;
    }
}
