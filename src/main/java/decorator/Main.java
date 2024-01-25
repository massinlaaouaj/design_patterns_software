package decorator;

public class Main {
    public static void main(String[] args) {
        Character revenant = new Character("revenant");  // Creamos el personaje
        revenant.levelUpCharacter();                     // Subimos de nivel el personaje, con lo que le asigna la skin dorada "GoldenSkin"
        revenant.infoCharacter();                        // Printamos para ver realmente el cambio
    }
}
