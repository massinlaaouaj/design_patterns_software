package observer;

/**
 * CONTRATO NOTIFICADOR: Gestiona las suscripciones de notificaciones.
 */
public interface NotificationManager {
    /* Contrato: */
    void subscribeObserver(NotificationSubscriber newSubscriber);
    void unsubscribeObserver(NotificationSubscriber removeSubscriber);
    void notifyNewVideo();
}
