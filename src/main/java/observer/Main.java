package observer;

public class Main {
    public static void main(String[] args) {

        // Youtuber
        YoutubeChannel MrBeast = new YoutubeChannel();

        // Cuenta:
        Subscriber PewDiePie = new Subscriber("PewDiePie");
        Subscriber DudePerfect = new Subscriber("DudePerfect");

        // Subscribir cuenta a un canal
        MrBeast.subscribeObserver(PewDiePie);
        MrBeast.subscribeObserver(DudePerfect);

        // Publicación de un nuevo vídeo, con título "I sent my therapist to therapy"
        MrBeast.newVideo("I sent my therapist to therapy");
    }
}
