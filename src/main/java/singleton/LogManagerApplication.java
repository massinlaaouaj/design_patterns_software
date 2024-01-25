package singleton;

// Nuestra clase log centralizado
public class LogManagerApplication {
    private static LogManagerApplication instance;

    // Aquí esta la clave para entender el Singleton, hacemos que
    // el contructor sea un privado!
    private LogManagerApplication() {}

    // Hacemos el método que crea la insancia "static".
    public static LogManagerApplication getInstance() {

        // Miramos si ya hay una instancia creada, en caso contrario la creamos.
        if (instance == null) {
            // Si no ha sido creada, crea una nueva instancia.
            instance = new LogManagerApplication();
        }

        // Devuelve la instancia única.
        return instance;
    }

    /* ... */
}
