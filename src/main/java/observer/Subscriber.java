package observer;
/**
 * SUSCRIPTOR: Quien desea recibir el mensaje de notificación.
 */
public class Subscriber implements NotificationSubscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override public void notification(String notificationMessage) {
        System.out.println("New Video: " + notificationMessage);
    }
}
