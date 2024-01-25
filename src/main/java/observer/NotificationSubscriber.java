package observer;

/**
 * CONTRATO CLIENTE: Interficie para ser implementada por objetos que deseen ser notificados de cambios en un objeto observado "Observable".
 */
public interface NotificationSubscriber {
    void notification(String notificationMessage);
}
