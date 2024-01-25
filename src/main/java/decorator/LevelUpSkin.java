package decorator;

// CONTRATO DECORATOR: Cuando se sube de nivel se le asigna el skin "GoldenSkin".
public class LevelUpSkin implements Skin {
    protected Skin skinSelected;

    public LevelUpSkin(Skin skinSelected) {
        this.skinSelected = skinSelected;
    }


    @Override public String getNameSkin() {
        return this.skinSelected.getNameSkin();
    }

    @Override public Skin levelUpSkin() {
        return new GoldenSkin(skinSelected);
    }
}
