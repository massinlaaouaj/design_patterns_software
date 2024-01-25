package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NOTIFICADOR: Gestiona las suscripciones de notificaciones.
 */
public class YoutubeChannel implements NotificationManager {

    /* Attributes */
    private String notificationMessage;
    private List<NotificationSubscriber> clientToNotify = new ArrayList<>();

    /* Methods */
    @Override public void subscribeObserver(NotificationSubscriber newSubscriber) {
        this.clientToNotify.add(newSubscriber);
    }

    @Override public void unsubscribeObserver(NotificationSubscriber removeSubscriber) {
        this.clientToNotify.remove(removeSubscriber);
    }

    @Override public void notifyNewVideo() {
        for (NotificationSubscriber observer : this.clientToNotify) {
            observer.notification(this.notificationMessage);
        }
    }

    public void newVideo(String notificationMessage) {
        this.notificationMessage = notificationMessage;
        this.notifyNewVideo();
    }
}
