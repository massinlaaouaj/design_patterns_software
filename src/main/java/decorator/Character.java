package decorator;

// PERSONAJE PRINCIPAL: Personaje del videojuego.
public class Character {
    private String characterName;
    private Skin characterSkin = new Base();
    private int level = 0;

    public Character(String characterName) {
        this.characterName = characterName;
    }

    public void levelUpCharacter() {
        this.level+=1;
        this.characterSkin = this.characterSkin.levelUpSkin();
    }

    public void infoCharacter() {
        System.out.println("Character name: " + this.characterName
                + "\nCharacter level: " + this.level
                + "\nCharacter skin: " + this.characterSkin.getNameSkin());
    }
}
