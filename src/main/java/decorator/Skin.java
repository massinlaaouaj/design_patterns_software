package decorator;

// CONTRATO SKIN: Cada nuevo skin tendrá el siguiente contrato/métodos a cumplir.
public interface Skin {
    public String getNameSkin();
    public Skin levelUpSkin();
}
